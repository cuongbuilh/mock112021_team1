package com.vti.mock.service;

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

}
