/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrivisor;

/**
 *
 * @author Ali-Wassouf
 */
public class Fibers {

    private String quantity; 
    private String messuringUnit;
    
     public Fibers(String quantity , String messuringUnit) {
        this.quantity = quantity;
        this.messuringUnit = messuringUnit;
    }
    
    public String getMessuringUnit() {
        return messuringUnit;
    }

    public void setMessuringUnit(String messuringUnit) {
        this.messuringUnit = messuringUnit;
    }

   
    
   @Override
    public String toString() {
        return "Fibers " + quantity + " "+messuringUnit ;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

}
