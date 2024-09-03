/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class ex2 {

    public static void main(String[] args) {
        int n1, n2, n3;
        int opc;
        boolean verificaValor = true;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        n1 = 0;
        n2 = 1;
        n3 = n1 + n2;
        while (n1 <= opc) {
            if (n1 == opc) {
                JOptionPane.showMessageDialog(null, "O número " + opc + " faz parte da sequência Fibonacci");
                verificaValor = false;
                break;
            } else {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
        if (verificaValor) {
            JOptionPane.showMessageDialog(null, "O número não faz parte da sequência Fibonacci");
        }
    }
}
