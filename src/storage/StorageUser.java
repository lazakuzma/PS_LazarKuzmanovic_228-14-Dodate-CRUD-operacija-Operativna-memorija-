/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student1
 */
public class StorageUser {
   private final List<User> users;

    public StorageUser() {
        users = new ArrayList<>();
        users.add(new User(1l,"pera","pera123","Pera","Peric"));
        users.add(new User(2l,"zika","zika123","Zika","Zikic"));
    }

    public List<User> getAll() {
        return users;
    }
    
    
    
}
