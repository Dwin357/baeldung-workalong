/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dwin357.workalong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author dwin
 */
@SpringBootApplication
@ComponentScan("io.github.dwin357.workalong.web")
public class Workalong {
    
    public static void main(String [] args) {
        SpringApplication.run(Workalong.class, args);
    }
}
