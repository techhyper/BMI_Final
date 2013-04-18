/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bmi;

/**
 *
 * @author CSIT
 */
public class Calculate {
    private double height,male,female;
    public void setHeight(double h) {
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getFemale() {
        CalFemel();
        return female;
    }

    public double getMale() {
        CalMan();
        return male;
    }

    private void CalMan(){
        male=height-100;
    }
    private void CalFemel(){
        female=(height-100)-(0.1*(height-100));
    }

}
