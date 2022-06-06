//Faça um programa que lê dois valores e imprime:

//se o primeiro valor for menor que o segundo, a lista de valores do primeiro até o segundo;

//se o primeiro valor for maior que o segundo a lista de valores do segundo até o primeiro em ordem decrescente;

//se ambos forem iguais a mensagem "valores iguais".

import javax.swing.JOptionPane;

public class Ex3dois {

    public static void main (String [] args){

    int n1;
    int n2;
    int i;
    int cres;
    int dec;
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo numero: "));


    if (n1 < n2){
        for(i= n1; i<= n2; i ++){
            cres = i;
            JOptionPane.showMessageDialog(null, cres);

        }

        


    }


    else if (n1 >n2){
        for(i= n1; i>= n2; i --){
            dec = i;
            JOptionPane.showMessageDialog(null, dec);

        }


    }

    else { 
        
     JOptionPane.showMessageDialog(null, "Os numeros são iguais.");


    }

    }
}
