package fit.iuh.se.tuan4.dao;

import fit.iuh.se.tuan4.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserDAO {
    private static List<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static List<User> getAllUsers() {
        return users;
    }
}
