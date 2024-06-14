package com.example.demo1.dto_request;

import java.time.LocalDate;

public class UserUpdateRequest {
    
    private String password;
    private String fistname;
    private String lastname;
    private LocalDate dob;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFistname() {
        return this.fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
