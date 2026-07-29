let users = getListUsers();

/*
User sẽ có định dạng:
{
 username: "ning1704",
 password: "123456"
}
 */

function saveUsers() {
    localStorage.setItem("users", JSON.stringify(users));
}

function saveCurrentUser(user) {
    localStorage.setItem("currentUser", JSON.stringify(user));
}

function getListUsers() {
    let data = localStorage.getItem("users");
    if (data) {
        return JSON.parse(data);
    } else {
        return [];
    }
}

function showFormLogin() {
    document.getElementById("content").innerHTML = `
    <div class="auth-container">
        <div class="auth-box">
            <h1>💙 Login</h1>

            <input type="text" placeholder="Username" id="username">

            <input type="password" placeholder="Password" id="password">

            <button class="auth-btn" onclick="login()">Login</button>

            <p class="switch-form">
                Bạn chưa có tài khoản?
                <span onclick="showFormRegister()">Register</span>
            </p>
        </div>
    </div>
    `;
}

function login() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    for (let i = 0; i < users.length; i++) {
        let user = users[i];
        if (username === user.username && password === user.password) {
            alert("Đăng nhập thành công");
            saveCurrentUser(user);
            showHomePage();
            return;
        }
    }
    alert("Tài khoản hoặc mật khẩu k đúng");
}


function showFormRegister() {
    document.getElementById("content").innerHTML = `
    <div class="auth-container">
        <div class="auth-box">
            <h1>🌸 Register</h1>

            <input type="text" placeholder="Username" id="username">

            <input type="password" placeholder="Password" id="password">

            <button class="auth-btn" onclick="register()">Register</button>

            <p class="switch-form">
                Đã có tài khoản?
                <span onclick="showFormLogin()">Login</span>
            </p>
        </div>
    </div>
    `;
}

function register() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let newUser = {
        username: username,
        password: password
    }
    users.push(newUser);
    saveUsers();
    alert("Đăng ký thành công");
    showFormLogin();
}

function showHomePage() {
    document.getElementById("content").innerHTML = `
    <div class="app-container">
    
        <div class="header">
            <h1>🛍️ Quản lý sản phẩm</h1>
    
            <div class="menu">
                <button class="menu-btn" onclick="showHome()">🏠 Trang chủ</button>
                <button class="menu-btn" onclick="showAddForm()">➕ Thêm mới</button>
                <button class="logout-btn" onclick="logout()">🚪 Logout</button>
            </div>
        </div>
        <div id="main" class="main-content"></div>
    </div>
`;
    showHome();
}

function chooseScreen() {
    let currentUser = JSON.parse(localStorage.getItem("currentUser"));
    if (currentUser) {
        showHomePage();
    } else {
        showFormLogin();
    }
}

function logout() {
    localStorage.removeItem("currentUser");
    showFormLogin();
}

chooseScreen();