//Fazer um programa que solicita um número decimal e imprime o
//correspondente em hexa e octal.

import javax.swing.JOptionPane;

public class Ex2 {

    public static void main (String [] args){

    int dec;
    String hex;
    String oct;

    dec = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor decimal, para converão: "));

     hex = Integer.toHexString(dec);
     oct = Integer.toOctalString(dec);

     JOptionPane.showMessageDialog(null, "O valor da conversão do número " + dec + " para hexadecimal é: " + hex);
     JOptionPane.showMessageDialog(null, "O valor da conversão do número " + dec + " para octal é: " + oct);
    






    }
    
}
