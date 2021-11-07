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
public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        color = "red";
        filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        if(isFilled())
            return "A Shape with color of " + getColor() + "and Filled"	;
        else
            return "A Shape with color of " + getColor() + "and Not Filled"	;
    }
}
