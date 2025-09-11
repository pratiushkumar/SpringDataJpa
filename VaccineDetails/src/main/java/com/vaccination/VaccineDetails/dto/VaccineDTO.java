package com.vaccination.VaccineDetails.dto;

import java.time.LocalDate;

public class VaccineDTO {
    private Long id;
    private String name;
    private String manufacturer;
    private Integer dosagerequired;
    private Double Storage_temp;
    private LocalDate approval_date;
    private LocalDate expiry_date;
    private String description;

    public VaccineDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getDosagerequired() {
        return dosagerequired;
    }

    public void setDosagerequired(Integer dosagerequired) {
        this.dosagerequired = dosagerequired;
    }

    public Double getStorage_temp() {
        return Storage_temp;
    }

    public void setStorage_temp(Double storage_temp) {
        Storage_temp = storage_temp;
    }

    public LocalDate getApproval_date() {
        return approval_date;
    }

    public void setApproval_date(LocalDate approval_date) {
        this.approval_date = approval_date;
    }

    public LocalDate getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDate expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
