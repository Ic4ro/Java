
package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        Livros livro1 = new Livros("Cobrakai", "Pedro", 350, 200);
        livros livro2 = new Livros("Amor e anarquia", "ronaldo", 250, 200);
        
        
       
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Salário: " + livro1.getNumeroDePaginas());
        System.out.println("Preço: " + livro1.getPreco());
        
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Salário: " + livro2.getNumeroDePaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}
