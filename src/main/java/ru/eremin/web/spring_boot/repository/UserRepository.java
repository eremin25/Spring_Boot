package ru.eremin.web.spring_boot.repository;

import ru.eremin.web.spring_boot.model.User;

import java.util.List;

public interface UserRepository {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    void editUser(User user);
}
