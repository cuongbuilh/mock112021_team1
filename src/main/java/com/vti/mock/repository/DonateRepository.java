package com.vti.mock.repository;

import com.vti.mock.model.Donate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateRepository extends JpaRepository<Donate, Integer> {
}
