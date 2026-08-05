const canvas = document.getElementById("game");
const ctx = canvas.getContext("2d");

canvas.width = 400;
canvas.height = 600;

function gameLoop() {

    // Xóa màn hình
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // Vẽ nền
    ctx.fillStyle = "#70c5ce";
    ctx.fillRect(0, 0, canvas.width, canvas.height);

    // Cập nhật chim
    updateBird();

    // Vẽ chim
    drawBird();

    requestAnimationFrame(gameLoop);
}

// Chờ ảnh đầu tiên tải xong rồi chạy game
birdImages[0].onload = function () {
    gameLoop();
};