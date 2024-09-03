/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

import javax.swing.JOptionPane;

public class ex4 {

    public static void main(String args[]){

        double valorSp, valorRj, valorMg, valorEs, valorOutros, valorTotal;

        valorSp = 67836.43;
        valorRj = 36678.66;
        valorMg = 29229.88;
        valorEs = 27165.48;
        valorOutros = 19849.53;

        valorTotal = valorSp + valorRj + valorMg + valorEs + valorOutros;

        String resultado = String.format(
            "SP: %.2f%%\nRJ: %.2f%%\nMG: %.2f%%\nES: %.2f%%\nOutros: %.2f%%",
            (valorSp / valorTotal) * 100,
            (valorRj / valorTotal) * 100,
            (valorMg / valorTotal) * 100,
            (valorEs / valorTotal) * 100,
            (valorOutros / valorTotal) * 100
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}

