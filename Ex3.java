//Fazer um programa que solicite 2 números e informe:
// a) A soma dos números;
// b) O produto do primeiro número pelo quadrado do segundo;
// c) O quadrado do primeiro número;
// d) A raiz quadrada da soma dos quadrados;
// e) O seno da diferença do primeiro número pelo segundo;
// f) O módulo do primeiro número.

import javax.swing.JOptionPane;

public class Ex3um {

    public static void main (String [] args){

    double n1;
    double n2;
    double soma;
    double n2quad;
    double prod;
    double quad;
    double rquad;
    double raiz;
    double dife;
    double sen;
    double modulo;

    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo numero: "));

        soma = n1 + n2;
        n2quad = Math.pow(n2 ,2);
        prod = n1 * n2quad;
        quad = Math.pow(n1 ,2);
        rquad= (Math.pow(n1 ,2)  + Math.pow(n2 ,2));
        raiz = Math.sqrt(rquad);
        dife = n1 - n2;
        sen = Math.sin(dife);
        modulo = Math.abs(n1);

        JOptionPane.showMessageDialog(null, "A soma de ambos os números será: " + soma);
        JOptionPane.showMessageDialog(null, "O produto do primeiro número, pelo quadrado do segundo será: " + prod);
        JOptionPane.showMessageDialog(null, "O quadrado do primeiro númer será: " + quad);
        JOptionPane.showMessageDialog(null, "A raiz quadrada, da soma dos quadros de ambos os números será: " + raiz);
        JOptionPane.showMessageDialog(null, "O seno da diferença do primeiro número pelo segundo será: " + sen );
        JOptionPane.showMessageDialog(null, "O módulo do primeiro número será: " + modulo);








    }   
}