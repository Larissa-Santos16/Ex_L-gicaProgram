//Fazer um programa que lê um conjunto de 10 valores e os imprime ordenados.

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main (String [] args){

        int num [] = new int [10];
        int i;

        for (i = 0; i<=10; i++){


            num [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));


        }
             Arrays.sort(num);

             for (int j = 0; j<num.length; j++){
            JOptionPane.showMessageDialog(null, "Os valores digitados, ordenados são: "  + num[j]);


             }
    }

    
}
