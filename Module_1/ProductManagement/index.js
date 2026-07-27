function saveData() { // mỗi khi mảng cập nhật về dữ liệu (CUD)
    localStorage.setItem("products", JSON.stringify(products));
}

function getData() {
    let data = localStorage.getItem("products");
    if (data) {
        return JSON.parse(data);
    } else {
        return [];
    }
}

let products = getData();
console.log(products);

function searchName() {
    let data = document.getElementById("search-name").value;
    showProductList(data);
}

function showHome() {
    document.getElementById("main").innerHTML = `
    <h3>Trang chủ</h3>
    <input type="text" placeholder="Nhập tên sản phẩm" id="search-name" oninput="searchName()">
    <br>
    <br>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Ảnh</th>
            <th>Giá</th>
            <th colspan="2">Hành động</th>
        </tr>
        <tbody id="list">

        </tbody>
    </table>
    `;
    showProductList("");
}

function showAddForm() {
    document.getElementById("main").innerHTML = `
    <h3>Thêm sản phẩn</h3>
    <input type="text" id="product-id" placeholder="ID Sản Phẩm">
    <br>
    <input type="text" id="product-name" placeholder="Tên Sản Phẩm">
    <br>
    <input type="text" id="product-img" placeholder="Ảnh Sản Phẩm">
    <br>
    <input type="number" id="product-price" placeholder="Giá Sản Phẩm">
    <br>
    <textarea id="product-description" placeholder="Mô tả Sản Phẩm"></textarea>
    <br>
    <button onclick="addProduct()">Thêm</button>
    `;
}

// Create
function addProduct() {
    let productID = document.getElementById("product-id").value;
    let productName = document.getElementById("product-name").value;
    let productImg = document.getElementById("product-img").value;
    let productPrice = document.getElementById("product-price").value;
    let productDescription = document.getElementById("product-description").value;
    let newProduct = {
        id: productID,
        name: productName,
        img: productImg,
        price: productPrice,
        description: productDescription
    }
    console.log("newProduct", newProduct);
    products.push(newProduct);
    saveData();
    showHome();
}

// Delete
function removeProduct(productId) {
    let removeIndex = getIndexByProductId(productId);
    if (removeIndex === -1) {
        alert("Sản phẩm không còn tồn tại!");
        return;
    }
    let isConfirm = confirm("Bạn chắc chắn muốn xóa chứ?");
    if (isConfirm) {
        products.splice(removeIndex, 1);
        saveData();
        showHome();
    }
}

function getIndexByProductId(productId) {
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == productId) {
            return i;
        }
    }
    return -1;
}

function showUpdateForm(productId) {
    let updateIndex = getIndexByProductId(productId);
    let oldProduct = products[updateIndex];
    console.log("oldProduct", oldProduct);
    document.getElementById("main").innerHTML = `
    <h3>Cập nhật sản phẩn</h3>
    <input type="text" id="product-id" placeholder="ID Sản Phẩm" value="${oldProduct.id}" readonly>
    <br>
    <input type="text" id="product-name" placeholder="Tên Sản Phẩm" value="${oldProduct.name}">
    <br>
    <input type="text" id="product-img" placeholder="Ảnh Sản Phẩm" value="${oldProduct.img}">
    <br>
    <input type="number" id="product-price" placeholder="Giá Sản Phẩm" value="${oldProduct.price}">
    <br>
    <textarea id="product-description" placeholder="Mô tả Sản Phẩm">${oldProduct.description}</textarea>
    <br>
    <button onclick="updateProduct('${productId}')">Lưu</button>
    `;
}

function updateProduct(productId) {
    let updateIndex = getIndexByProductId(productId);
    let productID = document.getElementById("product-id").value;
    let productName = document.getElementById("product-name").value;
    let productImg = document.getElementById("product-img").value;
    let productPrice = document.getElementById("product-price").value;
    let productDescription = document.getElementById("product-description").value;
    let newInfo = {
        id: productID,
        name: productName,
        img: productImg,
        price: productPrice,
        description: productDescription
    }
    products[updateIndex] = newInfo;
    saveData();
    showHome();
}

// Read
function showProductList(nameSearch) {
    let htmlStr = ``;
    for (let i = 0; i < products.length; i++) {
        let productName = products[i].name.toLowerCase();
        if (productName.includes(nameSearch.toLowerCase())) {
            htmlStr += `
            <tr>
                <td>${products[i].id}</td>
                <td>${products[i].name}</td>
                <td><img src="${products[i].img}" alt=""></td>
                <td>${products[i].price}</td>
                <td>
                    <button class="delete-btn" onclick="removeProduct('${products[i].id}')">Xóa</button>
                </td>
                <td>
                    <button class="edit-btn" onclick="showUpdateForm('${products[i].id}')">Sửa</button>
                </td>
            </tr>
       `
        }
    }
    document.getElementById("list").innerHTML = htmlStr;
}

showHome(); // undefined

/*
Hoàn thiện CRUD tương tự demo => Dự án cuối module
Thêm tính năng tìm kiếm theo khoảng giá
Thêm Trang trí (CSS)
 */

