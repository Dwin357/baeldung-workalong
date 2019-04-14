/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dwin357.workalong.persistence;

import io.github.dwin357.workalong.web.models.User;

/**
 *
 * @author dwin
 */
public interface UserRepo {
    
    public Iterable<User> findAll();    
    public User save(User user);    
    public User findUser(Long id);
    public void deleteUser(Long id);
}
