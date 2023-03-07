/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areacirculo;

import java.util.Scanner;
        
/**
 *
 * @author Bruno Stefanello
 */
public class AreaCirculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o raio da Circunferencia:");
        double raio = entrada.nextDouble();
        
        double area = ((22*raio*raio)/7);
        System.out.print("A area do curculo é:");
        System.out.printf("%.2f", +area);
    }
}
