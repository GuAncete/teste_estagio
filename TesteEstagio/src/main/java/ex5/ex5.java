package ex5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args) {
        
        String palavra = JOptionPane.showInputDialog(null, "Informe uma palavra: "); 
        int caracteres = palavra.length();
        char[] reverso = new char[caracteres];
   
        for (int i = 0; i < caracteres; i++) {
            reverso[i] = palavra.charAt(caracteres - 1 - i);
        }
        
        String resultado = "";
        for (char c : reverso) {
            resultado += c;
        }

        JOptionPane.showMessageDialog(null,"Palavra invertida: " + resultado);

    }
}