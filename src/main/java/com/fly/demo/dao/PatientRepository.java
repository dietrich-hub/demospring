package com.fly.demo.dao;

import com.fly.demo.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
public  Page<Patient> findByNameContains(String mc, Pageable pegeable);
}
