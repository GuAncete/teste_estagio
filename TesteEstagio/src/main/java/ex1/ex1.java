/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class ex1 {

    public static void main(String[] args) {
        int indice = 13, soma = 0, k=0;
        
        while(k < indice){
            k = k + 1;
            soma = soma + k;
        }
        JOptionPane.showMessageDialog(null, soma);
    }
}
