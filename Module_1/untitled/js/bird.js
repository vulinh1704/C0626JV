
// =======================
// Thông tin con chim
// =======================
const bird = {
    x: 80,
    y: 200,
    width: 40,
    height: 30
};



// =======================
// Tải 3 ảnh của chim
// =======================
const birdImages = [];

for (let i = 0; i < 3; i++) {
    birdImages[i] = new Image();
    birdImages[i].src = `b${i}.png`;
}


// =======================
// Animation
// =======================
let frame = 0;
let frameCount = 0;

// =======================
// Cập nhật animation
// =======================
function updateBird() {

    frameCount++;

    // Đổi frame sau mỗi 10 lần gameLoop
    if (frameCount >= 10) {

        frame++;

        if (frame > 2) {
            frame = 0;
        }

        frameCount = 0;
    }
}

// =======================
// Vẽ chim
// =======================
function drawBird() {

    ctx.drawImage(
        birdImages[frame],
        bird.x,
        bird.y,
        bird.width,
        bird.height
    );

}
