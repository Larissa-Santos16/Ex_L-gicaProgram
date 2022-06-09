//Fazer uma rotina que recebe como parâmetro um array de 5 posições contendo
//as notas de um aluno ao longo do ano e devolve a média do aluno.


import javax.swing.JOptionPane;


public class Ex8 {
    


    public static void main (String [] args){

        double notas[] = new double [5];
        double resultado = 0;
        double soma = 0;

        for(int i = 0; i <=5; i++){

            notas [i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor: "));


            soma = soma + notas[i];
            resultado = soma/5;

        }


            JOptionPane.showMessageDialog(null, "A média das notas será: "  + resultado );



    }

}
