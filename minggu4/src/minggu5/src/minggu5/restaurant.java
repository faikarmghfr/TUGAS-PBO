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
public class restaurant {
    private makanan menuMakanan;
	private static byte idMenu = 0;
	
	public restaurant() {
		menuMakanan = new makanan();
	}

	public void tambahMenuMakanan(String nama, double harga, int stok) {
		menuMakanan.setHargaMakanan(harga, idMenu);
		menuMakanan.setNamaMakanan(nama, idMenu);
		menuMakanan.setStok(stok, idMenu);
		idMenu++;
	}

	public void tampilMenuMakanan(){
		for(byte i =0; i<=idMenu;i++){
			if(!isOutOfStock(i)){
				System.out.println(menuMakanan.getNamaMakanan(i) +"["+ menuMakanan.getStok(i) +"]"+"\tRp. "+ menuMakanan.getHargaMakanan(i));
			}
		}
	}

	public boolean isOutOfStock(byte id){
		if(menuMakanan.getStok(id) == 0){
			return true;
		}else{
			return false;
		}
	}

	public void pesanMenuMakanan(int idMenu, int jumlah) {
		byte id = (byte) idMenu;
		if(jumlah < 0)
			System.out.println("Input jumlah makanan salah");
		if((menuMakanan.getStok(id) - jumlah) < 0 )
			System.out.println("Mohon maaf stok tidak mencukupi");
		else {
			System.out.println("Anda Memesan " + menuMakanan.getNamaMakanan(id) + " sebanyak " + jumlah);
			System.out.println("Total Harga adalah Rp." + menuMakanan.getHargaMakanan(id)*jumlah);
			menuMakanan.removeStok(id, jumlah);
			System.out.println("----------------------");
		}
	}
}
