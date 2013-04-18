/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bmi;

/**
 *
 * @author CSIT
 */
public class Size {
    private double wrist,height,size;

    public void setHeight(double h) {
        this.height = h;
    }

    public void setWrist(double w) {
        this.wrist = w;
    }

    public double getHeight() {
        return height;
    }

    public double getWrist() {
        return wrist;
    }
    public double getSize() {
        Size();
        return size;
    }
    private void Size(){
        size=height/wrist;
    }


}
