/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeformatacao;

import java.util.Scanner;

/**
 *
 * @author Bruno Stefanello
 */
public class TesteFormatacao {

    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         int a,b;
         System.out.println("Adicione dois numeros para saber a +(soma),-(subtração),*(multiplicação) e /(divisão). ");
         System.out.println("Informe o primeiro valor: ");
         a = entrada.nextInt();
         
         System.out.println("Informe o segundo valor: ");
         b = entrada.nextInt();
         
         System.out.printf("\nResultados:\n");
         System.out.printf("%d + %d = %3d\n", a, b, (a + b));
         System.out.printf("%d - %d = %3d\n", a, b, (a - b));
         System.out.printf("%d * %d = %3d\n", a, b, (a * b));
         System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
         System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double) a + b));
         
         
         
    }
}
