/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somainfinita;

import java.util.Scanner;

/**
 *
 * @author Bruno Stefanello
 */
public class SomaInfinita {

    public static void main(String[] args) {
        
        int n, soma=0;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe quantos numeros você deseja somar:");
        
        n = entrada.nextInt();
        int a[] = new int[n];
        System.out.println("Informe quantos numeros você deseja somar:");
        System.out.println("Informe os " + n + " numeros:\n");
        for (int i = 0; i < n; i++){
            System.out.println("Informe o " + (i+1) + " numeros desejados:");
            a[i]=entrada.nextInt();
        }
        for (int i = 0; i < n; i++){
            soma+= (a[i]);
        }
        
        System.out.println("O resultado da soma dos "+ n +"numeros é:"+soma);
    }
}
