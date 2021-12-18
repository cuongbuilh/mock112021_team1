package com.vti.mock.service;

import com.vti.mock.form.user.CreateUserForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.User;

import java.util.List;


public interface IUserService {
    List<User> getAll();
    List<User> getByName(String name);
    User getByEmail(String email);
    User getByUsername(String username);
    User getByPhoneNumber(String phoneNumber);

    void createUser(CreateUserForm form);
    void deleteUser(String id);

    void updateUser(String id, UpdateUserForm form);
}
