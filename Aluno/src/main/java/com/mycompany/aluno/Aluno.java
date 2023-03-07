/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aluno;

import java.util.Scanner;


/**
 *
 * @author Bruno Stefanello
 */
public class Aluno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do Aluno:");
                
        String nome = entrada.nextLine();
        
        System.out.println("Informe o sexo do aluno:");
        char sexo = entrada.next().charAt(0);
        
        switch (sexo) {
            case 'f' -> System.out.println("Feminino");
            case 'm' -> System.out.println("Masculino");
            case 'g' -> System.out.println("Gay");
            case 'l' -> System.out.println("Lesbica");
            default -> System.out.println("Programador");
        } 
    }
}
