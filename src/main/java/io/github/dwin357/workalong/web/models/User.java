/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dwin357.workalong.web.models;

import java.util.Calendar;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author dwin
 */
public class User {
    
    private Long id;
    
    @NotEmpty(message="Username is required")
    private String username;
    
    @NotEmpty(message="Email is required")
    private String email;
    
    private Calendar created = Calendar.getInstance();
    
    
    /////////////////////////////
    ////  Getters + Setters  ////
    /////////////////////////////
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getCreated() {
        return created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }
    
    
}
