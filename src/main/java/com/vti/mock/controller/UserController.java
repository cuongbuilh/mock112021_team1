package com.vti.mock.controller;


import com.vti.mock.dto.UserDto;
import com.vti.mock.form.CreateUserForm;
import com.vti.mock.form.UpdateUserForm;
import com.vti.mock.model.User;
import com.vti.mock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() {
        List<UserDto> dtos = new ArrayList<>();
        // convert userList -> userDtoList
        iUserService.getAll().forEach(user -> dtos.add(new UserDto(user)));
        return new ResponseEntity(dtos, HttpStatus.OK);
    }

    @GetMapping("/byEmail")
    public ResponseEntity<UserDto> getUserByEmail(@RequestParam("email") String email) {
        return new ResponseEntity(new UserDto(iUserService.getByEmail(email)), HttpStatus.OK);
    }

    @GetMapping("/byUsername")
    public ResponseEntity getUserByUsername(@RequestParam("username") String username) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity createUser(@RequestBody CreateUserForm form) {
        try {
            iUserService.createUser(form);
        } catch (Exception e) {
            return new ResponseEntity("Cannot create user, try again leter", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("Created", HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity deleteUser(@RequestParam("id") String id) {
        try {
            iUserService.deleteUser(id);
        } catch (Exception e) {
            return new ResponseEntity("Cannot delete!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("User has been deleted", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable("id") String id, @RequestBody UpdateUserForm form) {
        try {
            iUserService.updateUser(id, form);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
