package com.vti.mock.service;

import com.vti.mock.form.CreateUserForm;
import com.vti.mock.form.UpdateUserForm;
import com.vti.mock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

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
