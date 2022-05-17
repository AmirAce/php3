/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recipe;

import java.io.Serializable;

/**
 *
 * @author aamir
 */
public class Ingredients implements Serializable {
    private String name;
    private String measure;
    private double quantity;

    public Ingredients(String name, String Measure, double Quantity) {
        this.name = name;
        this.measure = Measure;
        this.quantity = Quantity;
    }

    public Ingredients() {
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String Measure) {
        this.measure = Measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double Quantity) {
        this.quantity = Quantity;
    }
    
}
