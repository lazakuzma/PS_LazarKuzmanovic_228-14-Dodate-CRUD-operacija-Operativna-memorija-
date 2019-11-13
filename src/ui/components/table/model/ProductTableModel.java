/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.table.model;

import domain.Manufacturer;
import domain.MeasureUnit;
import domain.Product;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lazar-PC
 */
public class ProductTableModel extends AbstractTableModel{

    private final List<Product> products;
    private final String[] columns= new String[] {"Id","name","manufacturer","price","measurement unit"};
    private final Class[] columnsType = new Class[] {Long.class, String.class, Manufacturer.class, BigDecimal.class, MeasureUnit.class};
    public ProductTableModel(List<Product> product) {
        this.products = product;
    }
    
    
    @Override
    public int getRowCount() {
        if(products==null) return 0;
        return products.size();
    }

    @Override
    public int getColumnCount() {
         return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Product product = this.products.get(row);
        
        switch(column){
            case 0: return product.getId();
            case 1: return product.getName();
            case 2: return product.getManufacturer();
            case 3: return product.getPrice();
            case 4: return product.getMeasureUnit();
            default: return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column==2 || column==3;
    }

    @Override
    public void setValueAt(Object o, int row, int column) {
        Product product = products.get(row);
        switch(column){
            case 2: product.setManufacturer((Manufacturer)o);
             break;
            case 3: product.setPrice(new BigDecimal(o.toString()));
             break;
            
        }
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return columnsType[column];
    }
    
    
    
    
}
