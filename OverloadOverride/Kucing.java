/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */

    
    public class Kucing extends Hewan {
        
    void bergerak() {
    System.out.println("Kucing berjalan dengan 4 kaki.");
}
        
     
    public static void main(String[] args) {
        Kucing k = new Kucing();

        System.out.println(" OVERRIDE ");
        k.bergerak();   

        System.out.println(" OVERLOAD ");
        k.info();
        k.info("Rumah");        
        k.info("Rumah", 3);     
    }
}
    

