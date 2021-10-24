/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author faikar
 */
class Kain {
	private String nama;
	private String harga;
	
	Kain(String nama, String harga){
		this.nama = nama;
		this.harga = harga;
	}
	
	public void getKain() {
		System.out.println("\nKain");
		System.out.println("Nama bahan      : " + nama);
		System.out.println("Harga kain      : " + harga);	
	}
	
	
	
}

class Kameja {
	private String merek;
	private char ukuranKameja;
	private Kain kain;
	private String harga;
	
	Kameja (String merek, char ukuranKameja, String harga, String namaKain, String hargaKain ) {
		this.merek = merek;
		this.ukuranKameja = ukuranKameja;
		this.harga = harga;
		this.kain = new Kain(namaKain, hargaKain);
	}
	
	public void getKameja() {
		System.out.println("\nINFORMASI KAMEJA");
		System.out.println("Merek           : " + merek);
		System.out.println("Ukuran Kameja   : " + ukuranKameja);
		System.out.println("Harga           : " + harga);
		this.kain.getKain();
	}
}

//main method
class main
{
	public static void main (String[] args)
	{
		Kameja kameja1 = new Kameja("Eiger", 'M', "300000", "Flanel", "20000");
		kameja1.getKameja();
	}
}
