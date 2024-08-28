package com.project.main_project.Address.domain.entity;

import java.time.LocalDateTime;

import com.project.main_project.city.domain.entity.city;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_Id" )
    private Long id;

    @Column(name = "Address_1", columnDefinition = "VARCHAR(50)")
    private String FirstAddres;

    @Column(name = "Address_2", columnDefinition = "VARCHAR(50)")
    private String SecondAddress;

    @Column(name = "District", columnDefinition = "VARCHAR(20)")
    private String District;

    @Column(name = "Postal_Codec", columnDefinition = "VARCHAR(10)")
    private String CodecPostal;

    @Column(name = "Phone", columnDefinition = "VARCHAR(20)")
    private String Phone;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localTime;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private city City;


    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstAddres() {
        return FirstAddres;
    }

    public void setFirstAddres(String firstAddres) {
        FirstAddres = firstAddres;
    }

    public String getSecondAddress() {
        return SecondAddress;
    }

    public void setSecondAddress(String secondAddress) {
        SecondAddress = secondAddress;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCodecPostal() {
        return CodecPostal;
    }

    public void setCodecPostal(String codecPostal) {
        CodecPostal = codecPostal;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public LocalDateTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalDateTime localTime) {
        this.localTime = localTime;
    }

    public city getCity() {
        return City;
    }

    public void setCity(city city) {
        City = city;
    }

    
}
