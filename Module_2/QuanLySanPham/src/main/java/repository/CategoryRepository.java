package repository;

import entity.Category;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements IRepository<Category> {
    private static final String FILE_NAME = "data/categories.csv";

    @Override
    public void write(List<Category> list) {
        String dataStr = "";
        for (Category item : list) {
            dataStr += item.getCategoryId() + "," + item.getCategoryName() + "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dataStr);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[CategoryRepository.write.error]: " + e.getMessage());
        }
    }

    @Override
    public List<Category> read() {
        List<Category> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine(); // 121,Banh
                if (line == null) break;
                String[] data = line.split(","); // ["121", "Banh"]
                long categoryId = Long.parseLong(data[0]); // "121" => parseLong -> 121
                String categoryName = data[1];
                Category item = new Category(categoryId, categoryName);
                list.add(item);
            }
            bufferedReader.close();
            return list;
        } catch (IOException e) {
            System.out.println("[CategoryRepository.read.error]: " + e.getMessage());
        }
        return list;
    }

}
