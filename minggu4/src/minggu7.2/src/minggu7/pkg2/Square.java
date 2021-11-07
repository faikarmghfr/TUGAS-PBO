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
public class Square extends Rectangle {
    Square(){
        super();
    }

    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return getLenght();
    }

    public void setSide(double side) {
        setLenght(side);
        setWidth(side);
    }

    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of\n" + super.toString();
    }
}
