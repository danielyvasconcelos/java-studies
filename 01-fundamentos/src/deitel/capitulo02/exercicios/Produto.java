package deitel.capitulo02.exercicios;

import java.util.Scanner;
// a) Declare que um programa calculará o produto de três inteiros.
public class Produto {
    public static void main(String[] args){
        // b) Crie um Scanner chamado input que lê valores a partir da entrada padrão.
        Scanner entrada = new Scanner(System.in);
        // c) Declare as variáveis x, y, z e result como tipo int.
        int x;
        int y;
        int z;
        int result;
        // d) Solicite que o usuário insira o primeiro inteiro.
        System.out.println("Insira o valor de x: ");

         // e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
        x = entrada.nextInt();

        // f) Solicite que o usuário insira o segundo inteiro.
        System.out.println("Insira o valor de y: ");    
        // g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
        y = entrada.nextInt();

        // h) Solicite que o usuário insira o terceiro inteiro.
        System.out.println("Insira o valor de z: ");  
        // i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
        z = entrada.nextInt();

        // j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
        result = x*y*z;
        // k) Exiba a mensagem "Product is" seguida pelo valor da variável result */
        System.out.print("O produto de dos valores x, y e z é : ");

        System.out.printf("%d\n", result);  


        entrada.close();
}

}
