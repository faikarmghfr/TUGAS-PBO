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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rec = new Rectangle();
        Square square = new Square();

        //printan
        System.out.println(shape);
        System.out.println("-----------------------");
        System.out.println(circle);
        System.out.println("-----------------------");
        System.out.println(rec);
        System.out.println("-----------------------");
        System.out.println(square);
        System.out.println("-----------------------");
    }
    
}
