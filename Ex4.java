// Fazer um programa que imprime a tabela ASCII 
// (código decimal, código hexa, caracter) para os códigos de 0 a 127.

public class Ex4{

    public static void main (String [] args){

        int dec;
        String hex;
        char carac;

        for (int i =0; i<= 127; i ++){
            dec = i;
            carac = (char) dec ;
            hex = Integer.toHexString(i);

         System.out.println("Tabela ASCII   Decimal: " + dec + "  Hexadecimal: " + hex + "  Caracter: " + carac);

        }
        
    
    









    }

}