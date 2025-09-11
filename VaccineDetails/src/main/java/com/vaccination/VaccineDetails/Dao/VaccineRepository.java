package com.vaccination.VaccineDetails.Dao;

import com.vaccination.VaccineDetails.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VaccineRepository extends JpaRepository<Vaccine,Long> {
    List<Vaccine> findbynameignore(String name );
}

