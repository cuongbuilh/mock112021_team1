package com.vti.mock.service;

import com.vti.mock.dto.ProgramDto;
import com.vti.mock.form.program.CreateProgramForm;
import com.vti.mock.form.program.UpdateProgramForm;
import com.vti.mock.model.Program;
import com.vti.mock.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgramService implements IProgramService {
    @Autowired
    private ProgramRepository programRepository;

    @Override
    public List<ProgramDto> getAll() {
        List<Program> programs = programRepository.findAll();
        List<ProgramDto> programDtos = new ArrayList<>();

        programs.forEach(program -> {
            programDtos.add(new ProgramDto(program));
        });

        return programDtos;
    }

    @Override
    public List<ProgramDto> gets(String searchKey) {
        return null;
    }

    @Override
    public List<ProgramDto> getStoppedProgram() {
        List<ProgramDto> programDtos = new ArrayList<>();
        programRepository.findByStatusIsLike("stop").forEach(p -> {
            programDtos.add(new ProgramDto(p));
        });
        return programDtos;
    }

    @Override
    public ProgramDto getById(int id) {
        ProgramDto programDto = new ProgramDto();
        Optional<Program> optional = programRepository.findById(id);
        if(optional.isPresent()){
            programDto = new ProgramDto(optional.get());
        }else {
            return null;
        }
        return programDto;
    }

    @Override
    public ProgramDto create(CreateProgramForm form) {
        Program program = form.toProgram();
        program = programRepository.save(program);
        return new ProgramDto(program);
    }

    @Override
    public ProgramDto update(int id, UpdateProgramForm form) {
        Program program = form.toProgram();
        program.setId(id);
        program=programRepository.save(program);
        return new ProgramDto(program);
    }


    @Override
    public void delete(int id) {
        programRepository.deleteById(id);
    }
}
