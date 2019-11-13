/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Product;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author student1
 */
public class StorageProduct {
    private final List<Product> products;

    public StorageProduct() {
       products = new LinkedList<>();
    }

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }

    public Product search(Long id) {
        for (Product product : products) {
            if(id.compareTo(product.getId())==0) return product;
        }
        return null;
    }

    public void remove(Long id) {
        for (Product product : products) {
            if(id.compareTo(product.getId())==0) {
                products.remove(product);
                return;
            }
        }
        
    }

   

    

   
   
    
    
}
