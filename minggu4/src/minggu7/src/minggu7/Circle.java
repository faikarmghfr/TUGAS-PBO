/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author faikar
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "blue";
    }
    
    public Circle(double r){
        radius = r;
        color = "red";
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public String toString(){
        return "Circle[radius = " + radius + " color : " + color + "]";
    }
}
