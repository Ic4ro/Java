
package com.mycompany.metodosstring;

public class MetodosString {

    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        // Exibindo nome compLeto usando metodos Strings - maiúsculas
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        // Exibindo nome completo usando métodos Strings - Minúsculas
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
