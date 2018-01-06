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
public class Person {

  private int age; 
  private String phys;
  private String constipation;
  private String purge;
  private double hieght; 
  private double weight; 
  private String gender ; 
  private double bmi; 
  
  
  Person(int age , String phys , String constipation  , String purge , double w , double h , String gender  ){ 
      this.age  = age ;
      this.phys = phys;
      this.constipation = constipation;
      this.purge = purge; 
      if(this.constipation.equals("yes") ){this.purge = "no";}
      else if(this.purge.equals("yes")){this.constipation = "no";}
      this.gender = gender; 
      this.hieght = h;
      this.weight= w; 
      double bmi = (weight /(hieght *hieght ) )*10000;
      setBmi(bmi);
      
  }
  
  public String getConstipation(){return constipation;}
  public String getPurge(){return purge ; }
  public String getPhys(){return phys; }
  public int getage(){return age;}
  public int getAge() { return age;}  
  public double getHieght() {return hieght;}
  public double getWeight() {return weight;}
  public String getGender() {return gender;}
  public double getBmi() {return bmi;}

    
  public void setAge(int age) {this.age = age;}  
  public void setPhys(String phys) {this.phys = phys;}
  public void setHieght(double hieght) {this.hieght = hieght;}
  public void setWeight(double weight) {this.weight = weight;}
  public void setGender(String gender) {this.gender = gender;}
  public void setBmi(double bmi) {this.bmi = bmi;}
  public void setConstipation(String Constipation){this.constipation = Constipation;}
  public void setPurge(String purge){this.purge = purge ;  }
  public void setage(int age){this.age = age;}
  public void setphys(String phys){this.phys = phys; }
}    
    

