package com.vti.mock.controller;

import com.vti.mock.dto.DonateDto;
import com.vti.mock.service.IDonateService;
import com.vti.mock.service.IImagesService;
import com.vti.mock.service.IProgramService;
import com.vti.mock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/donates")
public class DonateController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProgramService programService;

    @Autowired
    private IImagesService imagesService;

    @Autowired
    private IDonateService donateService;

    @GetMapping()
    public ResponseEntity<List<DonateDto>> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonateDto> get(@PathVariable("id") String id) {
        return null;
    }

    @PostMapping()
    public ResponseEntity<DonateDto> create() {
        return null;
    }

    @PutMapping()
    public ResponseEntity<DonateDto> update() {
        return null;
    }

    @DeleteMapping()
    public ResponseEntity<String> delete() {
        return null;
    }

}
