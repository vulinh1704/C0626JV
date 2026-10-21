package repository;

import entity.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IRepository<User> {
    private static final String FILE_NAME = "data/users.csv";

    @Override
    public void write(List<User> list) {
        String dataStr = "";
        for (User item : list) {
            dataStr += item.getId() + "," + item.getUsername() + "," + item.getPassword() + "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dataStr);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[UserRepository.write.error]: " + e.getMessage());
        }
    }

    @Override
    public List<User> read() {
        List<User> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine(); // 121,ningvu,12345
                if (line == null) break;
                String[] data = line.split(","); // ["121", "ningvu", "12345"]
                long id = Long.parseLong(data[0]); // "121" => parseLong -> 121
                String username = data[1];
                String password = data[2];
                User item = new User(id, username, password);
                list.add(item);
            }
            bufferedReader.close();
            return list;
        } catch (IOException e) {
            System.out.println("[UserRepository.read.error]: " + e.getMessage());
        }
        return list;
    }

    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
//        List<User> list = repository.read();
//        for (User item : list) {
//            System.out.println(item.getId() + "," + item.getUsername() + "," + item.getPassword());
//        }
        List<User> list = new ArrayList<>();
        list.add(new User(13221, "duong", "anhduong"));
        repository.write(list);
    }
}

