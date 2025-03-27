package com.example.selice.dto;

import com.model.School;

public class SchoolDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;

    public SchoolDTO(School school) {
        this.id = school.getId();
        this.name = school.getName();
        this.address = school.getAddress();
        this.city = school.getCity();
        this.state = school.getState();
    }

    // Getters e setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
