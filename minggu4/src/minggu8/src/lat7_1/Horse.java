/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat7_1;

/**
 *
 * @author faikar
 */
public class Horse extends Animal {
	public void sound() {
		System.out.println("Neigh");
	}
	public static void main(String[] args) {
		Animal obj=new Horse();
		obj.sound();
	}
}
