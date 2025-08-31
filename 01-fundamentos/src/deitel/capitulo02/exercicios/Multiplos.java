package deitel.capitulo02.exercicios;
import java.util.Scanner;

/* Enunciado:  2.26 (Múltiplos) Escreva um aplicativo que lê dois inteiros, determina se o primeiro é um múltiplo do segundo e imprime o resultado. [Dica: utilize 
o operador de módulo].
 */

public class Multiplos {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();
        //System.out.printf("%d\n", numero1);

        System.out.print("Insira o segundo número inteiro: ");
        int numero2 = entrada.nextInt();
        //System.out.printf("%d\n", numero2);

        int resto = numero1 % numero2;

        if(resto == 0){
            System.out.print("O " + numero1 + " é multiplo do " + numero2);

        }else{
            System.out.print("O " + numero1 + " NÃO é multiplo do " + numero2);

        }

        entrada.close();

    }
}
    

