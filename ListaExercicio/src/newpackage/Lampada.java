/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Mario Sergio
 */
public class Lampada {
    
    boolean apagada, acesa, meiaLuz;

    public Lampada(boolean apagada, boolean acesa, boolean meiaLuz) {
        this.apagada = apagada;
        this.acesa = acesa;
        this.meiaLuz = meiaLuz;
    }
    Scanner sc = new Scanner(System.in);
    
    public boolean isApagada() {
        return apagada;
    }

    public void setApagada(boolean apagada) {
        this.apagada = apagada;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public boolean isMeiaLuz() {
        return meiaLuz;
    }

    public void setMeiaLuz(boolean meiaLuz) {
        this.meiaLuz = meiaLuz;
    }
    
    
    
    
    public void lampadaTresEstados(){
        
        
        int status = 0;
        
        System.out.println("Este sistema permite controlar o status de uma lampada, alternando de acesa para apagada");
        System.out.println("Para ligar a lampada digite 1. \nPara apagar a lampada digite 2. \nPara sair do sistema digite outro numero");
        status = sc.nextInt();
        
        
        if(status == 1 || status == 2){
            switch(status){
            case 1:
                acesa = true;
                meiaLuz = true;
                break;
            
            case 2:
                apagada = true;
                break;
            }
        }else System.out.println("Você saiu do sistema"); 

    }
    public boolean estaLigada(){
        if(acesa == true && meiaLuz == true)
           
            return acesa;
        
        else
            return acesa;
    }
}

