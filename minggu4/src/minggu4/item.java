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
public class item {
    private String name;
    private item(){
        name = "ipin";
    }
    public item(String name){
        this();
        System.out.println(this.name);
    }
}
