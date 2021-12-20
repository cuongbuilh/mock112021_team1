package com.vti.mock.controller;

import com.vti.mock.dto.DonateDto;
import com.vti.mock.dto.UserDto;
import com.vti.mock.form.donate.CreateDonateForm;
import com.vti.mock.form.donate.UpdateDonateForm;
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
        List<DonateDto> donateDtos = new ArrayList<>();
        donateService.getAll().forEach(d ->{
            donateDtos.add(new DonateDto(d));
        });
        return new ResponseEntity(donateDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonateDto> get(@PathVariable("id") @NumberFormat int id) {
        return new ResponseEntity(new DonateDto(donateService.getById(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<DonateDto> create(@RequestBody CreateDonateForm form) {
        return new ResponseEntity(new DonateDto(donateService.create(form)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DonateDto> update(@PathVariable("id") @NumberFormat int id ,@RequestBody UpdateDonateForm form) {
        return new ResponseEntity(new DonateDto(donateService.update(id,form)), HttpStatus.OK);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestParam("id") @NumberFormat int id) {
        donateService.delete(id);
    }

}
