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
public class Funcionario {
    
    String nome, setor, RG;
    double salario;
    double ganhoAnual;
    String dataEntrada;
    
    Scanner sc = new Scanner(System.in);

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    

    public double getGanhoAnual() {
        return ganhoAnual;
    }

    public void setGanhoAnual(double ganhoAnual) {
        this.ganhoAnual = ganhoAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String setor, String RG, double salario, String data) {
        this.nome = nome;
        this.setor = setor;
        this.RG = RG;
        this.salario = salario;
        this.dataEntrada = data;
    }
    
    public void receberAumento() {
        int aumento;

        System.out.println("O funcionario deve receber aumento? Digite 1 para 'sim' e 2 para 'não'");
        aumento = sc.nextInt();

        if (aumento == 1) {
            salario += 500;
            System.out.println("O funcionario recebeu um aumento de R$ 500,00");
        } else {
            System.out.println("O funcionario não recebeu aumento");
        }
    }

    public void calculaGanhoAnual() {
        ganhoAnual = salario * 12;
        System.out.println("Anualmente este funcionario recebe R$" + ganhoAnual);
    }

}

