package com.vti.mock.repository;

import com.vti.mock.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesRepository extends JpaRepository<Images, Integer> {
}
