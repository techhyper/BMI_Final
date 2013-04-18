/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bmi;

/**
 *
 * @author CSIT
 */
public class Small extends Calculate {
   public double getMaleSmall(){
       return getMale()-(0.1*getMale());
   }
   public double getFemaleSmall(){
       return getFemale()-(0.1*getFemale());
   }
}
