/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosimpares;

/**
 *
 * @author Alex
 */
public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Números impares del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
