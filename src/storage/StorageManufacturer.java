/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Manufacturer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student1
 */
public class StorageManufacturer {
    
    private final List<Manufacturer> manufactures;

    public StorageManufacturer() {
        
        manufactures = new ArrayList(){
            {/*
                add(new Manufacturer((long)11, "Manufacturer / 2"));
                add(new Manufacturer((long)11, "Manufacturer / 2"));
                add(new Manufacturer((long)11, "Manufacturer / 2"));
                add(new Manufacturer((long)11, "Manufacturer / 2"));
                 */
                
                add(new Manufacturer(1l, "Manufacturer / 1"));
                add(new Manufacturer(2l, "Manufacturer / 2"));
                add(new Manufacturer(3l, "Manufacturer / 3"));
                add(new Manufacturer(4l, "Manufacturer / 4"));
                add(new Manufacturer(5l, "Manufacturer / 5"));
                add(new Manufacturer(6l, "Manufacturer / 6"));
                add(new Manufacturer(7l, "Manufacturer / 7"));
                add(new Manufacturer(8l, "Manufacturer / 8"));
                add(new Manufacturer(9l, "Manufacturer / 9"));
                add(new Manufacturer(10l, "Manufacturer / 10"));
                
                
                
            }
        };
    }
    
    public List<Manufacturer> getAll(){
        return manufactures;
    }

    public Manufacturer search(Long id) {
        for (Manufacturer manufacturer : manufactures) {
            if(id.equals(manufacturer.getId())) return manufacturer;
        }
        return null;
    }

   
}
