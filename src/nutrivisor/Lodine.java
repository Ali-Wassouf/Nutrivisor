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
public class Lodine {

    
    private String quantity;
    private String messuringUnit;
    
    public Lodine(String quantity, String messuringUnit) {
        this.quantity = quantity;
        this.messuringUnit = messuringUnit;
    }
   

    public String getMessuringUnit() {
        return messuringUnit;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setMessuringUnit(String messuringUnit) {
        this.messuringUnit = messuringUnit;
    }

    public void setQuantity(String quantity, String messuringUnit ) {
        this.quantity = quantity;
        this.messuringUnit= messuringUnit;
    }

    public String getQuantity() {
        return quantity;
    }
    
 @Override
    public String toString() {
        return "Lodine " + quantity + " " +messuringUnit;
    }   
}
