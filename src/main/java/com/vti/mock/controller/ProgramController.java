package com.vti.mock.controller;

import com.vti.mock.dto.ProgramDto;
import com.vti.mock.form.program.CreateProgramForm;
import com.vti.mock.form.program.UpdateProgramForm;
import com.vti.mock.service.IDonateService;
import com.vti.mock.service.IImagesService;
import com.vti.mock.service.IProgramService;
import com.vti.mock.service.IUserService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/programs")
public class ProgramController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IProgramService programService;

    @Autowired
    private IImagesService imagesService;

    @Autowired
    private IDonateService donateService;

    @GetMapping()
    public ResponseEntity<List<ProgramDto>> getAll() {
        return new ResponseEntity(programService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/stoped")
    public ResponseEntity<List<ProgramDto>> getStoped() {
        return new ResponseEntity(programService.getStoppedProgram(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProgramDto> get(@PathVariable("id") @NumberFormat int id) {
        return new ResponseEntity(programService.getById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProgramDto> create(@RequestBody CreateProgramForm form) {
        return new ResponseEntity(programService.create(form), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProgramDto> update(@PathVariable("id") @NumberFormat int id,@RequestBody UpdateProgramForm form) {
        return new ResponseEntity(programService.update(id, form), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<String> delete(@RequestParam("id") @NumberFormat int id) {
        programService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
