package com.vaccination.VaccineDetails.mapper;

import com.vaccination.VaccineDetails.dto.VaccineDTO;
import com.vaccination.VaccineDetails.model.Vaccine;

public class VaccineMapper
{
    public static VaccineDTO toDto(Vaccine v) {
         if(v==null) {
             return null;
         }
         VaccineDTO vt = new VaccineDTO();
         vt.setId(vt.getId());
    }
}
