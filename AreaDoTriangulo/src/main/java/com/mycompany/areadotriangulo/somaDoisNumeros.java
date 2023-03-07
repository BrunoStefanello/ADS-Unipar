/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areadotriangulo;

import java.util.Scanner;

/**
 *
 * @author Bruno Stefanello
 */
public class somaDoisNumeros {
     public static void main(String[] args) {
         
        Scanner entrada = new Scanner (System.in);
    
         System.out.println("Informe o primeiro numero: ");   
        double primeiro = entrada.nextDouble();
        
        System.out.println("Informe o segundo numero: ");
        double segundo = entrada.nextDouble();
        
        double soma = (primeiro+segundo);
        System.out.println("A soma dos dois numeros é: "+soma);
        
    }
}
