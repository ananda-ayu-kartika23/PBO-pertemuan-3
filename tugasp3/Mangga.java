/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp3;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Mangga extends TumbuhanBerbiji implements DapatBerbuah, DapatBerbunga, DapatTumbuhCepat{

    public Mangga(String nama) {
        super(nama);
    }
    
    void berkembangBiak() {
        System.out.println(nama + " berkembang biak dengan generatif (biji).");
    }

    void jenisAkar() {
        System.out.println(nama + " memiliki akar tunggang yang kuat.");
    }

    void jenisBiji() {
        System.out.println(nama + " termasuk tumbuhan berbiji tertutup (Angiospermae).");
    }

    public void berbuah() {
        System.out.println(nama + " bisa menghasilkan buah yang manis.");
    }

    public void berbunga() {
        System.out.println(nama + " menghasilkan bunga sebelum berbuah.");
    }

    public void tumbuhcepat() {
        System.out.println(nama + " bisa tumbuh dengan cepat.");
    }

    
    
    
    
    
}
