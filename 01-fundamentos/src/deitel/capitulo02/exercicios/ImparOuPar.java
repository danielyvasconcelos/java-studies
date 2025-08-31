package deitel.capitulo02.exercicios;
import java.util.Scanner;

  /*Enunciado:
         *  2.25 (Ímpar ou par) Escreva um aplicativo que lê um inteiro, determina e imprime se ele é ímpar ou par.    [Dica: utilize o operador de módulo. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
         */
public class ImparOuPar {
    public static void main(String[] args){
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro : ");
        int numero = entrada.nextInt();
        System.out.printf("%d\n", numero);
        
        int resto = numero % 2;
        
        if (resto == 0){
        System.out.print("Seu número é par");
        } else {
        System.out.print("Seu número é ímpar");
         }    

         entrada.close();
    }
}
