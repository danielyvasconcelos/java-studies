package deitel.exemplos;
import java.util.Scanner; // importa e utiliza a classe scanner do java que serve para obter a entrada 

public class SomandoInteiros {
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in); // nomeiei a classe do tipo scanner de input

        int num01; // adionar o primeiro numero
        int num02;//adicionar o segundo numero
        int soma; // somar o primeiro e o segundo numero

        System.out.println("Insira o primeiro número:");
        num01 = input.nextInt(); // ler o primeiro numero inserido pelo usuario

        System.out.println("Insira o segundo número:");
        num02 = input.nextInt(); // ler o segundo numero inserido pelo usuario

        soma = num01 + num02;
        System.out.printf("O resultado é %d\n", soma); // exibe o valor por meio do print f



    }
    
}
/* Especificadores de formatos :
 * %d: inteiro decimal (int)
 * %f: número de ponto flutuante (float, double)
 * %s: string
 * %c: caractere
 * %b: booleano
 * %x: inteiro em hexadecimal
 * %o: inteiro em octal
 * %e: notação científica (float, double)
 * %%: imprime o caractere %
 */

