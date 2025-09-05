/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp3;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class main {
    public static void main(String[] args) {
        Mangga TumbuhanMangga = new Mangga("Manalagi");

        System.out.println("JENIS TUMBUHAN: ");
        TumbuhanMangga.nama();
        TumbuhanMangga.habitat();
        TumbuhanMangga.ciriUmum();

        System.out.println("");
        System.out.println("DETAIL TUMBUHAN: ");
        TumbuhanMangga.berkembangBiak();
        TumbuhanMangga.jenisAkar();
        TumbuhanMangga.jenisBiji();

        System.out.println("");
        System.out.println("KEMAMPUAN TUMBUHAN: ");
        TumbuhanMangga.berbuah();
        TumbuhanMangga.berbunga();
        TumbuhanMangga.tumbuhcepat();
    }
}
