let products = ["Bánh mì", "Kẹo mút", "Mì tôm", "Rong biển"];

// CURD: Create, Update, Read, Delete

function showHome() {
    document.getElementById("main").innerHTML = `
    <h3>Trang chủ</h3>
    <input type="text" placeholder="Nhập tên sản phẩm">
    <br>
    <br>
    <table border="1">
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th colspan="2">Hành động</th>
        </tr>
        <tbody id="list">

        </tbody>
    </table>
    `;
    showProductList();
}

function showAddForm() {
    document.getElementById("main").innerHTML = `
    <h3>Thêm sản phẩn</h3>
    <input type="text" id="product-name" placeholder="Tên Sản Phẩm">
    <button onclick="addProduct()">Thêm</button>
    `;
}

// Create
function addProduct() {
    let productName = document.getElementById("product-name").value;
    products.push(productName);
    showHome();
}

// Delete
function removeProduct(removeIndex) {
    let isConfirm = confirm("Bạn chắc chắn muốn xóa chứ?");
    if (isConfirm) {
        products.splice(removeIndex, 1);
        showHome();
    }
}

function showUpdateForm(updateIndex) {
    let oldProductName = products[updateIndex];
    document.getElementById("main").innerHTML = `
    <h3>Cập nhật sản phẩn</h3>
    <input type="text" id="product-name" value="${oldProductName}" placeholder="Tên Sản Phẩm">
    <button onclick="updateProduct(${updateIndex})">Lưu</button>
    `;
}

function updateProduct(updateIndex) {
    let newProductName = document.getElementById("product-name").value;
    products[updateIndex] = newProductName;
    showHome();
}

// Read
function showProductList() {
    let htmlStr = ``;
    for (let i = 0; i < products.length; i++) {
        htmlStr += `
        <tr>
            <td>${i + 1}</td>
            <td>${products[i]}</td>
            <td>
                <button class="delete-btn" onclick="removeProduct(${i})">Xóa</button>
            </td>
            <td>
                <button class="edit-btn" onclick="showUpdateForm(${i})">Sửa</button>
            </td>
        </tr>
        `
    }
    console.log(htmlStr);
    document.getElementById("list").innerHTML = htmlStr;
}

showHome();
