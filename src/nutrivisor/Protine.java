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
public class Protine {

    private String quantity ; 
    private String messuringUnit;

    public Protine(String quantity ,String mesuringUnit) {
        this.quantity = quantity;
        this.messuringUnit = mesuringUnit;
    }
    

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public void setMessuringUnit(String messuringUnit) {
        this.messuringUnit = messuringUnit;
    }

    public String getMessuringUnit() {
        return messuringUnit;
    }
    
    @Override
    public String toString() {
        return "Protine " + quantity + " "+messuringUnit ;
    }
}
