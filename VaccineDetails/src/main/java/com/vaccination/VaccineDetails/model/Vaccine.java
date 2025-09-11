package com.vaccination.VaccineDetails.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="vaccine")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name;
    private String manufacture;


    @Column(name="dosagerequired")
    private Integer dosagerequired;
    @Column(name="Storage_temp")
    private Double Storage_temp;

    @Column(name="approval_date")
    private LocalDate approval_date;

    @Column(name="expiry_date")
    private LocalDate expiry_date;

    @Column(length=1000)
    private String description;

    public Vaccine() {
        System.out.println("default constructor is been called ");

    }

    public Vaccine(Long id, String name, String manufacture,Integer dosagerequired, Double storage_temp, LocalDate approval_date, LocalDate expiry_date, String description) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.dosagerequired=dosagerequired;
        this.Storage_temp = storage_temp;
        this.approval_date = approval_date;
        this.expiry_date = expiry_date;
        this.description = description;
    }

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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
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
