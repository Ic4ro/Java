package com.mycompany.exercicio02;

import java.util.Scanner;


public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Declaração de variáveis
        System.out.println("Digite o valor da compra: ");
        String mercado = "Mercado do joão";
        double valorDaCompra = teclado.nextDouble ();
        
        double valorDaParcela = valorDaCompra / 5;
        
       
        // Exibindo resultados
        
        System.out.println("Nome do mercado: " + mercado);
        System.out.println("Valor das parcelas: " + valorDaParcela);
        
        teclado.close();
        
    }
}