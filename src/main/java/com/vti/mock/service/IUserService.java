package com.vti.mock.service;

import com.vti.mock.form.user.CreateUserForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.User;

import java.util.List;


public interface IUserService {
    List<User> getAll();
    List<User> getByName(String name);
    User getById(int id);
    User getByEmail(String email);
    User getByUsername(String username);
    User getByPhoneNumber(String phoneNumber);

    User createUser(CreateUserForm form);
    void deleteUser(int id);
    User updateUser(int id, UpdateUserForm form);
}
