/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dwin357.workalong.web.controllers;

import io.github.dwin357.workalong.persistence.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dwin
 */
@Controller
@RequestMapping("/")
public class UserController {
    
    private final UserRepo userRepo;

    @Autowired
    public UserController(UserRepo repo) {
        super();
        this.userRepo = repo;
    }
    
    
}
