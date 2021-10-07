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
public class Barang {
String kode_barang, nama_barang;
    private int stok = 0;
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        tambahStok(stk);
    }

    public int getStok() {
        return stok;
    }
    
    public void tambahStok(int a){
        this.stok += a;
    }
}
