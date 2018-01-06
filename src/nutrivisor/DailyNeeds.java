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
public class DailyNeeds {

    private Mineral Iron , Foliate , Zinc , Calcium , Sodium ; 
    private Vitamine vitamineA , vitamineC, vitamineD, vitamineE, vitamineK, Thiamine, 
                     Riboflavin, Niacine, vitamineB6, vitamineB12; 
    private Protine protine;
    private Carbohydrates carbohydrates;
    private Fibers fiber; 
    private Floride floride; 
    private Lodine  lodine;
    private Energy energy;
    public DailyNeeds(Energy energy, Protine protine , Carbohydrates carbohydrates , Fibers fiber , 
            Vitamine vitamineA ,Vitamine vitamineD ,Mineral Iron,Mineral Foliate , Mineral Zinc, Mineral Calcium,
            Vitamine vitamineE , Vitamine vitamineK, Vitamine vitamineC , Vitamine Thiamine , Vitamine Riboflavin ,
            Vitamine Niacine , Vitamine vitamineB6 , Vitamine vitamineB12 , Floride floride , Lodine lodine ,
            Mineral Sodium) {
        this.Iron = Iron;
        this.Foliate = Foliate;
        this.Zinc = Zinc;
        this.Calcium = Calcium;
        this.Sodium = Sodium;
        this.vitamineA = vitamineA;
        this.vitamineC = vitamineC;
        this.vitamineD = vitamineD;
        this.vitamineE = vitamineE;
        this.vitamineK = vitamineK;
        this.Thiamine = Thiamine;
        this.Riboflavin = Riboflavin;
        this.Niacine = Niacine;
        this.vitamineB6 = vitamineB6;
        this.vitamineB12 = vitamineB12;
        this.protine = protine;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
        this.floride = floride;
        this.lodine = lodine;
        this.energy = energy; 
    }

    public Mineral getIron() {
        return Iron;
    }

    public Mineral getFoliate() {
        return Foliate;
    }

    public Mineral getZinc() {
        return Zinc;
    }

    public Mineral getCalcium() {
        return Calcium;
    }

    public Mineral getSodium() {
        return Sodium;
    }

    public Vitamine getVitamineA() {
        return vitamineA;
    }

    public Vitamine getVitamineC() {
        return vitamineC;
    }

    public Vitamine getVitamineD() {
        return vitamineD;
    }

    public Vitamine getVitamineE() {
        return vitamineE;
    }

    public Vitamine getVitamineK() {
        return vitamineK;
    }

    public Vitamine getThiamine() {
        return Thiamine;
    }

    public Vitamine getRiboflavin() {
        return Riboflavin;
    }

    public Vitamine getNiacine() {
        return Niacine;
    }

    public Vitamine getVitamineB6() {
        return vitamineB6;
    }

    public Vitamine getVitamineB12() {
        return vitamineB12;
    }

    public Protine getProtine() {
        return protine;
    }

    public Carbohydrates getCarbohydrates() {
        return carbohydrates;
    }

    public Fibers getFiber() {
        return fiber;
    }

    public Floride getFloride() {
        return floride;
    }

    public Lodine getLodine() {
        return lodine;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setIron(Mineral Iron) {
        this.Iron = Iron;
    }

    public void setFoliate(Mineral Foliate) {
        this.Foliate = Foliate;
    }

    public void setZinc(Mineral Zinc) {
        this.Zinc = Zinc;
    }

    public void setCalcium(Mineral Calcium) {
        this.Calcium = Calcium;
    }

    public void setSodium(Mineral Sodium) {
        this.Sodium = Sodium;
    }

    public void setVitamineA(Vitamine vitamineA) {
        this.vitamineA = vitamineA;
    }

    public void setVitamineC(Vitamine vitamineC) {
        this.vitamineC = vitamineC;
    }

    public void setVitamineD(Vitamine vitamineD) {
        this.vitamineD = vitamineD;
    }

    public void setVitamineE(Vitamine vitamineE) {
        this.vitamineE = vitamineE;
    }

    public void setVitamineK(Vitamine vitamineK) {
        this.vitamineK = vitamineK;
    }

    public void setThiamine(Vitamine Thiamine) {
        this.Thiamine = Thiamine;
    }

    public void setRiboflavin(Vitamine Riboflavin) {
        this.Riboflavin = Riboflavin;
    }

    public void setNiacine(Vitamine Niacine) {
        this.Niacine = Niacine;
    }

    public void setVitamineB6(Vitamine vitamineB6) {
        this.vitamineB6 = vitamineB6;
    }

    public void setVitamineB12(Vitamine vitamineB12) {
        this.vitamineB12 = vitamineB12;
    }

    public void setProtine(Protine protine) {
        this.protine = protine;
    }

    public void setCarbohydrates(Carbohydrates carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFiber(Fibers fiber) {
        this.fiber = fiber;
    }

    public void setFloride(Floride floride) {
        this.floride = floride;
    }

    public void setLodine(Lodine lodine) {
        this.lodine = lodine;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "DailyNeeds Iron " + Iron + ", Foliate " + Foliate + ", Zinc " + Zinc + ", Calcium " + 
                Calcium + ", Sodium " + Sodium + ", vitamine A " + vitamineA + ", vitamine C " + 
                vitamineC + ", vitamine D " + vitamineD + ", vitamine E " + vitamineE + ", vitamine K" + 
                vitamineK + ", Thiamine " + Thiamine + ", Riboflavin " + Riboflavin + ", Niacine " + 
                Niacine + ", vitamine B6 " + vitamineB6 + ", vitamine B12 " + vitamineB12 + ", protine " + 
                protine + ", carbohydrates " + carbohydrates + ", fiber " + fiber + ", floride " + 
                floride + ", lodine " + lodine + ", energy " + energy ;
    }
}
