package com.vti.mock.controller;


import com.vti.mock.dto.UserDto;
import com.vti.mock.form.user.CreateUserForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.User;
import com.vti.mock.service.IDonateService;
import com.vti.mock.service.IImagesService;
import com.vti.mock.service.IProgramService;
import com.vti.mock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
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

    @Autowired
    private IProgramService programService;

    @Autowired
    private IImagesService imagesService;

    @Autowired
    private IDonateService donateService;

    @GetMapping()
    public ResponseEntity<List<UserDto>> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>> get(@PathVariable("id") String id) {
        return null;
    }

    @PostMapping()
    public ResponseEntity<UserDto> create(@RequestBody CreateUserForm form) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@RequestParam("id") @NumberFormat int id, @RequestBody UpdateUserForm form) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete() {
    }
}
