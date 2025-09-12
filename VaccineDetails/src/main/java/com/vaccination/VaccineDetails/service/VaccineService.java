package com.vaccination.VaccineDetails.service;

import com.vaccination.VaccineDetails.dto.VaccineDTO;

import java.util.List;

public interface VaccineService {
    List<VaccineDTO> getAllVaccines();
    VaccineDTO getVaccineById(Long Id);
    VaccineDTO createVaccine(VaccineDTO vaccineDTO);
    VaccineDTO updateVaccine(Long Id, VaccineDTO vaccineDTO);
    void deletevaccine(Long id);
    List<VaccineDTO> searchByname(String name);

}
