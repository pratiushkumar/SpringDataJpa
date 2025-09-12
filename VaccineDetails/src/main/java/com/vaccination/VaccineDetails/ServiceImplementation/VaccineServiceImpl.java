package com.vaccination.VaccineDetails.ServiceImplementation;

import com.vaccination.VaccineDetails.Dao.VaccineRepository;
import com.vaccination.VaccineDetails.dto.VaccineDTO;
import com.vaccination.VaccineDetails.exception.ResourceNotFound;
import com.vaccination.VaccineDetails.mapper.VaccineMapper;
import com.vaccination.VaccineDetails.model.Vaccine;
import com.vaccination.VaccineDetails.service.VaccineService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VaccineServiceImpl implements VaccineService {

    private final VaccineRepository vaccineRepository;

    public VaccineServiceImpl(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @Override
    public List<VaccineDTO> getAllVaccines() {
        return vaccineRepository.findAll().stream().map(VaccineMapper:: toDto).collect(Collectors.toList());
    }

    @Override
    public VaccineDTO getVaccineById(Long id) {
        Vaccine v = vaccineRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Vaccine not found by id "+ id));
    return VaccineMapper.toDto(v);
    }

    @Override
    public VaccineDTO createVaccine(VaccineDTO vaccineDTO) {
        Vaccine saved = vaccineRepository.save(VaccineMapper.toEntity(vaccineDTO));
        return VaccineMapper.toDto(saved);
    }

    @Override
    public VaccineDTO updateVaccine(Long Id, VaccineDTO vaccineDTO) {
        return null;
    }

    @Override
    public void deletevaccine(Long id) {

    }

    @Override
    public List<VaccineDTO> searchByname(String name) {
        return List.of();
    }
}
