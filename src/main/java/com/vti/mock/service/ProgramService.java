package com.vti.mock.service;

import com.vti.mock.dto.ProgramDto;
import com.vti.mock.model.Program;
import com.vti.mock.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramService implements IProgramService{
    @Autowired
    private ProgramRepository programRepository;

    @Override
    public List getAll() {
        List<Program> programs = programRepository.findAll();
        List<ProgramDto> programDtos = new ArrayList<>();

        programs.forEach(program->{
            programDtos.add(new ProgramDto(program));
        });

        return programDtos;
    }

    @Override
    public List gets() {
        return null;
    }

    @Override
    public void create() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {

    }
}
