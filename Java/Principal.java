
package com.mycompany.mavenproject5;

public class Principal {

    public static void main(String[] args) {
        // Instanciando um objeto.
        Funcionarios  funcionario = new Funcionarios("Marta", 35, 1500);   
        
       // funcionario.setNome("Marta");
       // funcionario.setIdade(35);
       // funcionario.setSalario(1500);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: " + funcionario.getSalario());
        
        //Botão direito do mouse insert code.
    }
}
