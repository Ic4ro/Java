/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner( System.in);
     
     // sout + tab
     System.out.println("Digite seu nome: ");
     String nome = teclado.next();
     
     System.out.println("Digite sua idade: ");
     int idade = teclado.nextInt();
     
     System.out.println("Digite seu peso: ");
     double peso = teclado.nextDouble ();
     
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        
        teclado.close();
     
        
        
    }
}
