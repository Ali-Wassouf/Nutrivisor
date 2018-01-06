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
public class Carbohydrates {
    private String quantity ;
    private String messuringUnit;

    public void setMessuringUnit(String messuringUnit) {
        this.messuringUnit = messuringUnit;
    }

    public String getMessuringUnit() {
        return messuringUnit;
    }

    @Override
    public String toString() {
        return "Carbohydrates" + quantity + " " +messuringUnit;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public Carbohydrates(String quantity ,String messuringUnit) {
        this.quantity = quantity;
        this.messuringUnit = messuringUnit;
    }
    
    
}
