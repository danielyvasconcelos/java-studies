package deitel.capitulo02.exercicios;
import java.util.Scanner;

/*Enunciado : (Maiores e menores inteiros) Escreva um aplicativo que lê cinco inteiros, determina e imprime o maior e o menor inteiro no grupo. Utilize 
somente as técnicas de programação que você aprendeu neste capítulo. */

public class MaiorMenor {
    public static void main(String[] args){
        System.out.print("Insira o primeiro numero : ");


        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        System.out.printf("%d\n", numero1);

        int maior;
        int menor;


        maior = numero1;
        menor = numero1; 
        
        System.out.print("Insira o segundo numero:");
        
        int numero2= entrada.nextInt();
        System.out.printf("%d\n", numero2);
        if (numero2 > maior) {
            maior = numero2;           
        }
        if (numero2 < menor) {
             menor = numero2;
        }

        System.out.print("Insira o terceiro numero:");
        int numero3= entrada.nextInt();
        System.out.printf("%d\n", numero3);

        if (numero3 > maior) {
            maior = numero3;           
        }
        if (numero3 < menor) {
             menor = numero3;
        }

        System.out.print("Insira o quarto numero:");
        int numero4= entrada.nextInt();
        System.out.printf("%d\n", numero4);

        if (numero4 > maior) {
            maior = numero4;           
        }
        if (numero4 < menor) {
             menor = numero4;
        }

        System.out.print("Insira o quinto numero:");
        int numero5= entrada.nextInt();
        System.out.printf("%d\n", numero5);

        if (numero5 > maior) {
            maior = numero5;           
        }
        if (numero5 < menor) {
             menor = numero5;
        }

         System.out.print("O numero maior é :");
         System.out.printf("%d\n", maior);

         System.out.print("O numero menor é :");
         System.out.printf("%d\n", menor);


         entrada.close();

    }
    
}
// depois refazer esse exercicio usando o laço for .