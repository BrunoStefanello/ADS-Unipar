/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areadotriangulo;

import java.util.Scanner;

/**
 *
 * @author Bruno Stefanello
 */
public class AreaDoTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a largura do triângulo em centimetros: ");
        
        double largura = entrada.nextDouble();
        
        System.out.println("Informe a largura do triângulo em centímetros: ");
        
        double altura = entrada.nextDouble();
        
        double area = ((largura*altura)/2);
        
        System.out.println("A área do triangulo é: " +area+ "cm.");
        
        if (area > 10) {
            System.out.println("Hello World");
        }
        else {
            System.out.println("...");
        }
    }
}
