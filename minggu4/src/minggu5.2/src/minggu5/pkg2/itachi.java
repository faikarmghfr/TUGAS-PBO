/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5.pkg2;

/**
 *
 * @author faikar
 */
public class itachi extends Rikudo{
        private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;

	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}

	void printDojutsu() {
		System.out.println(this.Dojutsu);
		this.setDojutsu();
		System.out.println(this.Dojutsu);
	}

	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}
}
