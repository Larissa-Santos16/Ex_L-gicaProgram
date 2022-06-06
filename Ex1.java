//Fazer um programa que pergunta um valor em metros e imprime o
// correspondente em decímetros, centímetros e milímetros.


import javax.swing.JOptionPane;


public class Ex1 {

    public static void main (String [] args){

        int M;
        int cm;
        int dm;
        int mm;

        M = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor em metros: "));

        dm = M * 10;
        cm = dm * 10;
        mm = cm * 10;

        JOptionPane.showMessageDialog(null,"O valor "+M+" em decímetros é: "+dm);
        JOptionPane.showMessageDialog(null,"O valor "+M+" em centímetros é: "+cm);
        JOptionPane.showMessageDialog(null,"O valor "+M+" em milímetros é: "+ mm);

        
    






    }
    
}
