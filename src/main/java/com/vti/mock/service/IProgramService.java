package com.vti.mock.service;

import com.vti.mock.dto.ProgramDto;
import com.vti.mock.form.program.CreateProgramForm;
import com.vti.mock.form.program.UpdateProgramForm;
import com.vti.mock.model.Program;

import java.util.List;

public interface IProgramService {
    List<ProgramDto> getAll();
    List<ProgramDto> gets(String searchKey);
    List<ProgramDto> getStoppedProgram();
    ProgramDto getById(int id);
    ProgramDto create(CreateProgramForm form);
    ProgramDto update(int id, UpdateProgramForm form);
    void delete(int id);
}
