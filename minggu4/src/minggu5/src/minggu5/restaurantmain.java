/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author faikar
 */
public class restaurantmain {
    public static void main(String[] args) {
		restaurant menu = new restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
		System.out.println();
		menu.pesanMenuMakanan(0, 10);
		menu.pesanMenuMakanan(3, 20);
		menu.tampilMenuMakanan();
	}
}
