package com.project.main_project.city.domain.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.project.main_project.Address.domain.entity.Address;
import com.project.main_project.pais.domain.entity.Country;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table (name = "City")
public class city {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameCity;


    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localTime;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    // El MappedBy debe councidir con la instancia DE city en Address
    
    @OneToMany(mappedBy = "City" , cascade =  CascadeType.ALL)
    private List<Address> address;
        
    public city() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public LocalDateTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalDateTime localTime) {
        this.localTime = localTime;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

        

    

}
