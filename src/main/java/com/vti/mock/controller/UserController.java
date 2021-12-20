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
        List<UserDto> userDtos = new ArrayList<>();
        iUserService.getAll().forEach(user -> {
            userDtos.add(new UserDto(user));
        });
        return new ResponseEntity(userDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>> get(@PathVariable("id") @NumberFormat int id) {
        return new ResponseEntity(new UserDto(iUserService.getById(id)),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UserDto> create(@RequestBody CreateUserForm form) {
        return new ResponseEntity(new UserDto( iUserService.createUser(form)) , HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@RequestParam("id") @NumberFormat int id, @RequestBody UpdateUserForm form) {
        return new ResponseEntity(new UserDto(iUserService.updateUser(id, form)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") @NumberFormat int id) {
        iUserService.deleteUser(id);
    }
}
