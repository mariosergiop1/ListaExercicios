/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mario Sergio
 */
public class Aluno {
    
    String nome, endereço;
    int matricula, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Aluno(String nome, String endereço, int matricula, int cpf) {
        this.nome = nome;
        this.endereço = endereço;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public String infoAlunos(){
                 return "Nome: "+nome+"\nEndereço: "+endereço+"\nMatricula: "+matricula+"\nCpf: "+cpf;
    }
       
}
