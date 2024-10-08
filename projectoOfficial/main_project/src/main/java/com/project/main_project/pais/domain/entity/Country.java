package com.project.main_project.pais.domain.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.project.main_project.city.domain.entity.city;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Country_id" )
    private Long id;

    @Column
    private String nameCountry;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localTime;

    @OneToMany(mappedBy = "country" , cascade =  CascadeType.ALL)
    private List<city> cities;

    

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
}
