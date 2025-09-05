/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
    
    public abstract class Hewan {

    // abstract method yang harus di-override subclass
    abstract void bergerak();

    // overload method tanpa parameter
    void info() {
        System.out.println("Ini adalah hewan.");
    }

    // Overloading method dengan parameter()
    void info(String habitat) {
        System.out.println("Hewan ini hidup di " + habitat);
    }

    void info(String habitat, int umur) {
        System.out.println("Hewan ini hidup di " + habitat + " dan berumur " + umur + " tahun");
    }
}
    
