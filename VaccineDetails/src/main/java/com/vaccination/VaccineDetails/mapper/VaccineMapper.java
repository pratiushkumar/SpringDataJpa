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
         vt.setId(v.getId());
         vt.setName(v.getName());
         vt.setManufacturer(v.getManufacturer());
         vt.setDosagerequired(v.getDosagerequired());
         vt.setStorage_temp(v.getStorage_temp());
         vt.setApproval_date(v.getApproval_date());
         vt.setExpiry_date(v.getExpiry_date());
         vt.setDescription(v.getDescription());
         return vt;
    }
    public static Vaccine toEntity(VaccineDTO d) {
        if (d == null) {
            return null;
        }
        Vaccine dt = new Vaccine();
        dt.setId(d.getId());
        dt.setName(d.getName());
        dt.setManufacturer(d.getManufacturer());
        dt.setDosagerequired(d.getDosagerequired());
        dt.setStorage_temp(d.getStorage_temp());
        dt.setApproval_date(d.getApproval_date());
        dt.setExpiry_date(d.getExpiry_date());
        dt.setDescription(d.getDescription());
        return dt;
    }
}
