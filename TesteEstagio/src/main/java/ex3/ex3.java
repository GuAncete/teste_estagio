package ex3;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gusta
 */
public class ex3 {

    public static void main(String[] args) {

        double[] faturamentos = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612,
            42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823,
            373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
            35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,
            0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};

        double menorValor = Double.MAX_VALUE;
        double maiorValor = 0;
        double somaTotal = 0;
        int diasValidos = 0;

        for (double valor : faturamentos) {
            if (valor > 0) {
                menorValor = Math.min(menorValor, valor);
                maiorValor = Math.max(maiorValor, valor);
                somaTotal += valor;
                diasValidos++;
            }
        }

        double media = somaTotal / diasValidos;

        int diasAcimaMedia = 0;
        for (double valor : faturamentos) {
            if (valor > media) {
                diasAcimaMedia++;
            }
        }
        JOptionPane.showMessageDialog(null, "Menor valor de faturamento: R$ " + menorValor
                + "\nMaior valor de faturamento: R$ " + maiorValor
                + "\nNúmero de dias com faturamento acima da média: " + diasAcimaMedia);

    }
}
