package com.vti.mock.repository;

import com.vti.mock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);
    User findUserByUsername(String username);

}
