package com.vti.mock.repository;

import com.vti.mock.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program, Integer> {
    @Query("select p from Program p where p.status like ?1")
    List<Program> findByStatusIsLike(String status);
}
