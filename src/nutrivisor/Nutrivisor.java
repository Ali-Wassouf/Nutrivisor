/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrivisor;

import java.util.Iterator;
import jess.*;
/**
 *
 * @author Ali-Wassouf
 */
public class Nutrivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JessException{
        // TODO code application logic here
        Rete r = new Rete(); 
       Iterator  c; 
      r.reset();
      r.batch("rule.clp");
      Person p = new Person(17 , "yes" , "no" ,"yes" , 71 , 171 , "Male");
      r.add(p);
      r.run();
      c =   r.getObjects(new Filter.ByClass(DailyNeeds.class));
      if (c.hasNext()) {
			System.out.println("   " + c.next());
		}
        
    }
    
}
