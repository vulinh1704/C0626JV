package manager;

import java.util.List;
import java.util.Objects;

// CURD
public class ProductManager implements  IManager{
    @Override
    public void create() {
        IManager.test();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Objects> showAll() {
        return List.of();
    }

}
