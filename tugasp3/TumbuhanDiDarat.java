/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp3;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
abstract class TumbuhanDiDarat extends Tumbuhan {

    public TumbuhanDiDarat(String nama) {
        super(nama);
    }
    
    abstract void jenisAkar();

    void habitat() {
        System.out.println(nama + " hidup di daratan yang subur.");
    }

     
    
}
