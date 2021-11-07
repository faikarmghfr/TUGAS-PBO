/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7.pkg2;

/**
 *
 * @author faikar
 */
public class Rectangle extends Shape {
    private double width;
    private double lenght;

    Rectangle(){
        super();
        this.width = 1.0;
        this.lenght = 1.0;
    }	

    Rectangle(double width, double lenght){
        super();
        this.width = width;
        this.lenght = lenght;
    }

    Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width*lenght;
    }

    public double getPerimeter() {
        return width+width+lenght+lenght;
    }

    public String toString() {
        return "A Rectangle with width=" + getWidth() + " and length=" + getLenght() + ", which is subclass of \n" + super.toString();
    }
}
