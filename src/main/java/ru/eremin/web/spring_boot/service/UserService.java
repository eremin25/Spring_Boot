package ru.eremin.web.spring_boot.service;

import ru.eremin.web.spring_boot.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteById(Long id);

    void editUser(User user);

}
