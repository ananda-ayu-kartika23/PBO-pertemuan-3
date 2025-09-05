/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasp3;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
  abstract class Tumbuhan {

    String nama;    

    public Tumbuhan(String nama) {
        this.nama = nama;
    }

    abstract void berkembangBiak();

    void nama() {
        System.out.println("Nama Tumbuhan: " + nama);
    }
    
}
