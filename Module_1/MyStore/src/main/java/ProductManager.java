import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    private ArrayList<Product> list;

    public ProductManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Product product) {
        this.list.add(product);
    }

    @Override
    public void remove(int index) {
        this.list.remove(index);
    }

    @Override
    public void update(int index, Product product) {
        this.list.set(index, product);
    }

    @Override
    public ArrayList<Product> findAll() {
        return this.list;
    }
}
