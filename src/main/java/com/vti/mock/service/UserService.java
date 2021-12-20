package com.vti.mock.service;

import com.vti.mock.form.user.CreateUserForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.User;
import com.vti.mock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public User getById(int id){
        Optional<User> optional = userRepository.findById(id);
        return optional.orElse(null);
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
    public User createUser(CreateUserForm form) {
        User user = form.toUser();
        user = userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(int id, UpdateUserForm form) {
        User user = form.toUser();
        user.setId(id);
        user = userRepository.save(user);
        return user;
    }

}
