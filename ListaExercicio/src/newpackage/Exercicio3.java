/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Mario Sergio
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        
    Lampada la = new Lampada (true, false, false);
    
    la.lampadaTresEstados();
        System.out.println(la.estaLigada());
    
    }
}