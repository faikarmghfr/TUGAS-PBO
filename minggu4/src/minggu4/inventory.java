/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author faikar
 */
public class inventory {
    Barang[] barangs;
    
    void initBarang(){
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    void pengadaan(){
        initBarang();
        
        barangs[0].tambahStok(10);
        showBarang();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inventory beli = new inventory();
        beli.pengadaan();
    }
}
