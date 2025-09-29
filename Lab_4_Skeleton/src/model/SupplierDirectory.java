/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<Supplier>();
    }
    
    public ArrayList<Supplier> getSuppplierList(){
        return supplierList;

    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;

    }
    
    public void removeSupplier (Supplier s){
        supplierList.remove(s);
        
    }
    
    public Supplier searchSupplier(String keyWord){
        for (Supplier s : supplierList){
            if(keyWord.equals(s.getSupplyName())) {
                return s;
            }
            
        }
        return null;  
    }

    public Iterable<Supplier> getSupplierList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
