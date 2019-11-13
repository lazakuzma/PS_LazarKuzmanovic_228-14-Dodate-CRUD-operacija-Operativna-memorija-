/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Manufacturer;
import domain.Product;
import java.util.List;
import storage.StorageManufacturer;
import storage.StorageProduct;
import storage.StorageUser;

/**
 *
 * @author student1
 */
public class Controller {
   
   private static Controller instance; 
   private final StorageUser storageUser;
   private final StorageManufacturer storageManufacturer;
   private final StorageProduct storageProduct;

    private Controller() {
        storageUser = new StorageUser();
        storageManufacturer = new StorageManufacturer();
        storageProduct = new StorageProduct();
    }

    public void login(String username, String password){
        
    }
    
    public List<Manufacturer> getManufacturers(){
        return storageManufacturer.getAll();
    }

    public void saveProduct(Product product) {
        storageProduct.save(product);
    }

    public List<Product> getProducts() {
        return storageProduct.getAll();
    }

    public Product searchProduct(Long id) {
        return storageProduct.search(id);
    }

    public void removeProduct(Long id) {
        storageProduct.remove(id);
    }

    public Manufacturer searchManufacturer(Long id) {
        return storageManufacturer.search(id);
    }
    
    public static Controller getInstance(){
        if(instance==null) instance = new Controller();
        return instance;
    }

    

   
   

   

    
 
   
   
    
}
