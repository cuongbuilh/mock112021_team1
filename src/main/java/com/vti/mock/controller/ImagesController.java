package com.vti.mock.controller;

import com.vti.mock.service.IDonateService;
import com.vti.mock.service.IImagesService;
import com.vti.mock.service.IProgramService;
import com.vti.mock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/images")
public class ImagesController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProgramService programService;

    @Autowired
    private IImagesService imagesService;

    @Autowired
    private IDonateService donateService;

    @GetMapping()
    public ResponseEntity getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") String id) {
        return null;
    }

    @PostMapping()
    public ResponseEntity create() {
        return null;
    }

    @PutMapping()
    public ResponseEntity update() {
        return null;
    }

    @DeleteMapping()
    public ResponseEntity delete() {
        return null;
    }
}
