// Fazer uma rotina que recebe um array do tipo double e o número de valores que devem ser solicitados 
// ao usuário e devolve o array preenchido com os valores digitados.

import javax.swing.JOptionPane;


public class Ex9 {

    public static void main (String [] args){

        int qtd ;


        qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de valores que o vetor terá: "));


        double amor []= new double [qtd];


        for ( int i = 0; i<=qtd; i ++){


        amor [i]= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero: "));

 
        }

        for (int j = 0; j <= amor.length; j++) {

            JOptionPane.showMessageDialog(null, "O valor do vetor será: " + amor[j]);
        }







    }
    
}
