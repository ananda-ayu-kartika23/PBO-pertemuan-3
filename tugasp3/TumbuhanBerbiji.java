/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp3;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
abstract class TumbuhanBerbiji extends TumbuhanDiDarat {

    public TumbuhanBerbiji(String nama) {
        super(nama);
    }
    
    abstract void jenisBiji();

    void ciriUmum() {
        System.out.println(nama + " berkembang biak dengan biji.");
    }
    
}
