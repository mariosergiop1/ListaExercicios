/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Mario Sergio
 */
public class Exercicio2 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Insira o nome do funcionario");
        String nome = sc.nextLine();
        System.out.println("Insira o setor em que o funcionario trabalha");
        String setor = sc.nextLine();
        System.out.println("Insira o RG do funcionario");
        String rg = sc.nextLine();
        System.out.println("Insira o salário do funcionário");
        String salario = sc.nextLine();
        System.out.println("Informe a data de entrada do funcionário na empresa");
        String data = sc.nextLine();
        
        double s = Double.parseDouble(salario);
        
        Funcionario f = new Funcionario(nome, setor, rg, s, data);
        
        f.receberAumento();
        f.calculaGanhoAnual();

    }
    
    
}
