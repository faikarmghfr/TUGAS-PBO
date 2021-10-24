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
public class makanan {
        private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;

	makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int[10];
	}

	public void setNamaMakanan(String nama, byte id) {
		this.nama_makanan[id] = nama;
	}

	public void setHargaMakanan(double harga,byte id) {
		this.harga_makanan[id] = harga;
	}

	public void setStok(int stok, byte id) {
		this.stok[id] += stok;
	}

	public String getNamaMakanan(byte id) {
		return nama_makanan[id];
	}

	public double getHargaMakanan(byte id) {
		return harga_makanan[id];
	}

	public int getStok(byte id) {
		return stok[id];
	}
	
	public void removeStok(byte id, int jumlah) {
		this.stok[id] -= jumlah;
	}
}
