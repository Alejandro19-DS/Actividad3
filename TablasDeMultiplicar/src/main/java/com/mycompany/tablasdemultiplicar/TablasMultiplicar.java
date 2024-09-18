/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablasdemultiplicar;

/**
 *
 * @author Alex
 */
public class TablasMultiplicar {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Tabla del " + i + ":");
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
            System.out.println(); // Para dejar un espacio entre tablas
        }
    }
}
