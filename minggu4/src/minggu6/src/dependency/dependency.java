/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency;

/**
 *
 * @author faikar
 */
public class dependency {
    public static void main(String[] args) {
        
        bonus b = new bonus(2000);
        
        System.out.println("Jumlah uang pada bank : " + b.getBonus());
        
    }
}
