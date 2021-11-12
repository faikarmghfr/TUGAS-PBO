/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat7_3;

/**
 *
 * @author faikar
 */
public class Commission extends Hourly{
    private double totalSales, commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    
    public double pay(){
        double payment = super.pay() + (super.pay()*this.commissionRate);
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        
        result += "\nTotal Sales : " + totalSales;
        
        return result;
    }
}
