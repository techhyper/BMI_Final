/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bmi;

/**
 *
 * @author CSIT
 */
public class Big extends Calculate{
   public double getMaleBig(){
       return getMale()+(0.1*getMale());
   }
   public double getFemaleBig(){
       return getFemale()+(0.1*getFemale());
   }
}
