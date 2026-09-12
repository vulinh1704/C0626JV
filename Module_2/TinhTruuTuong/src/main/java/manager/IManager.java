package manager;

import java.util.List;
import java.util.Objects;

public interface IManager { // Một bộ tính năng
    void create();
    void update();
    void delete();
    List<Objects> showAll();

    default void log() {
        System.out.println("Log");
    }

    static void test() {
        System.out.println("Test");
    }
}
