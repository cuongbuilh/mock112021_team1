package com.vti.mock.service;

import com.vti.mock.form.CreateUserForm;
import com.vti.mock.form.UpdateUserForm;
import com.vti.mock.model.User;
import com.vti.mock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getByName(String name) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public void createUser(CreateUserForm form) {

    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public void updateUser(String id, UpdateUserForm form) {

    }

}
