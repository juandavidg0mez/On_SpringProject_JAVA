package com.project.main_project.Employee.domain.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.project.main_project.Address.domain.entity.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_Id" )
    private Long id;

    @Column(name = "NameEmployee", columnDefinition = "VARCHAR(45)")
    private String NameEmployee;

    @Column(name = "LastNameEmployee" , columnDefinition = "VARCHAR(45)")
    private String LastNameEmployee;

    @Column(name =  "Picture", columnDefinition = "LONGBLOB")
    private byte[] img;

    @Column(name ="Activo", columnDefinition = "TINYINT")
    private int Activo;

    @Column(name = "UserName", columnDefinition = "VARCHAR(16)")
    private String UserNameEmployee;

    @Column(name = "Password", columnDefinition = "VARCHAR(40)")
    private String PasswordEmployee;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localTime;
    
    @ManyToMany
    @JoinTable(
        name = "Almacen",
        joinColumns = @JoinColumn(name = "Employee_id"),
        inverseJoinColumns = @JoinColumn(name = "Address_id")
    )
    private List<Address> address;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return NameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        NameEmployee = nameEmployee;
    }

    public String getLastNameEmployee() {
        return LastNameEmployee;
    }

    public void setLastNameEmployee(String lastNameEmployee) {
        LastNameEmployee = lastNameEmployee;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public int getActivo() {
        return Activo;
    }

    public void setActivo(int activo) {
        Activo = activo;
    }

    public String getUserNameEmployee() {
        return UserNameEmployee;
    }

    public void setUserNameEmployee(String userNameEmployee) {
        UserNameEmployee = userNameEmployee;
    }

    public String getPasswordEmployee() {
        return PasswordEmployee;
    }

    public void setPasswordEmployee(String passwordEmployee) {
        PasswordEmployee = passwordEmployee;
    }

    public LocalDateTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalDateTime localTime) {
        this.localTime = localTime;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

        

}
