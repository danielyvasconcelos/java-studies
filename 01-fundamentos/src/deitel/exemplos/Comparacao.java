package deitel.exemplos;
import java.util.Scanner;

public class Comparacao {
    
    public static void main(String[] args){
    
        //criar uma classe scanner para ler as entradas 
        Scanner entrada = new Scanner(System.in); // System.in representa a entrda de dados do teclado

        // criar as variaveis do tipo inteiro para recber as entradas 
        int num01;
        int num02;
        // imprimir mensagem de entrada
        System.out.println("Numero 01 : ");
        // chamar a classe scanner criada para ler os valores da entrada 
        num01 =  entrada.nextInt(); // metodo da classe scanner que lê e retorna o proximo valor inteiro digitado

        // repetir o mesmo processo acima
        System.out.println("Numero 02 : ");
        num02 = entrada.nextInt();

        //  if for verdadeira, a instrução de saída associada com essa instrução if é executada; caso contrário, a instrução é pulada. 

        //Operador de Igualdade : == num01 é igual ao num02
        if (num01 == num02){
            System.out.print("Igual : ");
            System.out.printf("%d == %d\n", num01, num02); 
        }
        //Operador de diferença : != num01 é diferente do num02
        if (num01 != num02){
            System.out.print("Diferente : ");
            System.out.printf("%d != %d\n", num01, num02);
        }
        //Operador de maior :  num01 > num02    num1 é maior que num02
        if (num01 > num02){
            System.out.print("Maior : ");
            System.out.printf("%d > %d\n", num01, num02);
        }
        //Operador de menor :  num01 < num02  num1 é menor que num02
        if (num01 < num02){
            System.out.print("Menor : ");
            System.out.printf("%d < %d\n", num01, num02);
        }
        //Operador de maior ou igual a :  num01 >= num02  num1 é maior ou igual a num02
        if (num01 >= num02) {
             System.out.print("Maior ou igual : ");
            System.out.printf("%d >= %d", num01, num02);
        }
        //Operador de maior ou igual a :  num01 <= num02  num1 é menor ou igual a num02
        if (num01 <= num02) {
            System.out.print("Menor ou igual : ");
            System.out.printf("%d <= %d", num01, num02);
        }
        entrada.close();

    }

}
/*Metodos mais usados da classe Scanner :
 * nextInt(): lê um inteiro
 * nextDouble(): lê um número de ponto flutuante (double)
 * nextFloat(): lê um número de ponto flutuante (float)
 * nextLong(): lê um valor long
 * next(): lê a próxima palavra (String até o próximo espaço)
 * nextLine(): lê uma linha inteira de texto
 * nextBoolean(): lê um valor booleano
 * hasNextInt(), hasNextDouble(), etc.: verificam se há um próximo valor do tipo correspondente
 */