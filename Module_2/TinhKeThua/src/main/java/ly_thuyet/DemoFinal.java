package ly_thuyet;

public class DemoFinal {
    final double PI = 3.14; // biến thuộc tính

    final void test() {
        final double PI02 = 3.14; // biến local
        // PI02 = 3.1; // lỗi
        // this.PI = 3.1; // lỗi
    }
}

class Demo extends DemoFinal {
}



// final Có thể đi được biến (biến local, biến thuộc tính): thể hiện rằng đây là hằng số và không thể thay đổi giá trị
// final đi với class: không cho phéo có class con
// final đi với method: Không cho override method