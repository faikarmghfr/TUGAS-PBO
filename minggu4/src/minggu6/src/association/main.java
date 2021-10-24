/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author faikar
 */
class Meja {
	private String merek;
	
	Meja(String merek) {
		this.merek = merek;
	}
	
	public String getMeja(){
		return this.merek;
	}
}

//employee class
class Laptop{
	private String merek;
	
	Laptop (String merek){
		this.merek = merek;
	}
	
	public String getLaptop() {
		return this.merek;
	}
	
}

//Association between both the
//classes in main method
class main
{
	public static void main (String[] args)
	{
		Meja meja1 = new Meja("Olympic");
		Laptop laptop1 = new Laptop("Asus");
		
		System.out.println("Laptop bermerek " + laptop1.getLaptop() + " ada di atas meja bermerek " + meja1.getMeja());
	}
}
