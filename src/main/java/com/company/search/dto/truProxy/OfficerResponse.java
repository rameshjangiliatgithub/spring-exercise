package com.company.search.dto.truProxy;


import com.company.search.dto.Address;

public class OfficerResponse {
    private String name;
    private String officer_role;
    private String appointed_on;
    private String resigned_on;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficer_role() {
        return officer_role;
    }

    public void setOfficer_role(String officer_role) {
        this.officer_role = officer_role;
    }

    public String getAppointed_on() {
        return appointed_on;
    }

    public void setAppointed_on(String appointed_on) {
        this.appointed_on = appointed_on;
    }

    public String getResigned_on() {
        return resigned_on;
    }

    public void setResigned_on(String resigned_on) {
        this.resigned_on = resigned_on;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}