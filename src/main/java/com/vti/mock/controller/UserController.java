package com.vti.mock.controller;


import com.vti.mock.model.User;
import com.vti.mock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<List<User>>(iUserService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/byEmail")
    public ResponseEntity<User> getUserByEmail(@RequestParam("email") String email){
        return new ResponseEntity<User>( iUserService.getByEmail(email), HttpStatus.OK);
    }

    @GetMapping("/byUsername")
    public ResponseEntity getUserByUsername(@RequestParam("username") String username){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity createUser(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteUser(){
        return null;
    }

    @PutMapping
    public ResponseEntity updateAccount(){
        return null;
    }

    @PatchMapping
    public ResponseEntity updateOrCreateUser(){
        return null;
    }
}
