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
public class Mineral {

    private String name; 
    private String quantity ; 
    private String messuringUnit;
    
    public Mineral(String name, String quantity, String messuringUnit) {
        this.name = name;
        this.quantity = quantity;
        this.messuringUnit = messuringUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getMessuringUnit() {
        return messuringUnit;
    }

    public void setMessuringUnit(String messuringUnit) {
        this.messuringUnit = messuringUnit;
    }
    
    @Override
    public String toString() {
        return  " quantity =" + quantity +" " +messuringUnit +",";
    }
    
}
