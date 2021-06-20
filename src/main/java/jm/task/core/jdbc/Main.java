package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService u1 = new UserServiceImpl();

        u1.createUsersTable();

        u1.saveUser("Ivan", "Petrov", (byte) 25);
        u1.saveUser("Ilya", "Petrov", (byte) 56);
        u1.saveUser("Maria", "Petrova", (byte) 99);
        u1.saveUser("Katya", "Sosedova", (byte) 21);

        List<User> list = u1.getAllUsers();
        for (User u : list) {
            System.out.println(u.toString());
        }

        u1.cleanUsersTable();

        u1.dropUsersTable();
    }
}

