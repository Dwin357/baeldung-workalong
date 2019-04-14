/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dwin357.workalong.persistence;

import io.github.dwin357.workalong.web.models.User;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author dwin
 */
public class InMemoryUserRepo implements UserRepo {
    
    private static AtomicLong idSeq = new AtomicLong();
    private final ConcurrentMap<Long, User> repo = new ConcurrentHashMap<>();

    @Override
    public Iterable<User> findAll() {
        return repo.values();
    }
    
    @Override
    public User save(User user) {
        Long id = user.getId();
        if(null == id) {
            id = idSeq.incrementAndGet();
            user.setId(id);
        }
        repo.put(id, user);
        return user;
    }
    
    @Override
    public User findUser(Long id) {
        return repo.get(id);
    }
    
    @Override
    public void deleteUser(Long id) {
        repo.remove(id);
    }
}
