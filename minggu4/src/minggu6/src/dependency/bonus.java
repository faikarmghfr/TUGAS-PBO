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
public class bonus extends tabungan {
    
    private int bunga;
    tabungan tbgn = new tabungan();
    
    bonus(int bunga){
        this.bunga = bunga + tbgn.banyakTabungan;
    }

    bonus(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getbonus(){
        return this.bunga;
    }

    String getBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
