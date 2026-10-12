package repository;

import entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository<Product> {
    private static final String FILE_NAME = "data/products.txt";

    @Override
    public void write(List<Product> list) {
        String dataStr = "";
        for (Product item : list) {
            dataStr += item.getId() + "," + item.getName() + "," + item.getPrice() + "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dataStr);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[ProductRepository.write.error]: " + e.getMessage());
        }
    }

    @Override
    public List<Product> read() {
        List<Product> list = new ArrayList<>();
        try {
            // Đọc từng dòng trong file -> Chuyển chuỗi dòng đó thành đối tượng Product -> thêm vào list -> return
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine(); // 121,Banh mi,3000.0
                if (line == null) break;
                String[] data = line.split(","); // ["121", "Banh mi", "3000.0"]
                long id = Long.parseLong(data[0]); // "121" => parseLong -> 121
                String name = data[1];
                double price = Double.parseDouble(data[2]);
                Product item = new Product(id, name, price);
                list.add(item);
            }
            bufferedReader.close();
            return list;
        } catch (IOException e) {
            System.out.println("[ProductRepository.read.error]: " + e.getMessage());
        }
        return list;
    }

    /*
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        List<Product> list = repository.read();
        for (Product item : list) {
            System.out.println(item.getId() + "," + item.getName() + "," + item.getPrice());
        }
        List<Product> list = new ArrayList<>();
        list.add(new Product(121, "Banh mi", 3000));
        list.add(new Product(12232, "Banh mi", 3500));
        list.add(new Product(12233, "Com nam", 4000));
        repository.write(list);
    }
    */
}
