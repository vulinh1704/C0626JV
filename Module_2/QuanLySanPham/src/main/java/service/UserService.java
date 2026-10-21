package service;

import entity.Category;
import entity.User;
import lib.errors.UserIsExist;
import repository.CategoryRepository;
import repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository = new UserRepository();
    private List<User> list;
    private static final UserService userService = new UserService();

    private UserService() {
        this.list = userRepository.read();
    }

    public static UserService getObject() {
        return userService;
    }

    public void register(User user) {
        for (User item : this.list) {
            String username = user.getUsername();
            if (item.getUsername().equals(username)) {
                throw new UserIsExist();
            }
        }
        this.list.add(user);
        userRepository.write(list);
    }

    public boolean login(String username, String password) {
        for (User item : this.list) {
            if (item.getUsername().equals(username) && item.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
