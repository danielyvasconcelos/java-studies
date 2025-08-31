package deitel.capitulo03.exemplos.blocodenotas;
import java.util.Scanner;

public class BlocoDeNotasTeste {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);// cria um Scanner  para ler o nome do curso fornecido pelo usuário.

        BlocoDeNotas meuBlocoDeNotas = new BlocoDeNotas(); // cria um objeto bloco de notas e atribui a ele o meu bloco de notas

        System.out.println("Digite o nome do curso: "); //exibe um prompt que pede para o usuário inserir o nome de um curso
        String nomeDoCurso = entrada.nextLine(); //atribui à variável nameOfCourse
        System.out.println();  // linha em branco
        //Observe que o tipo da variável é BlocoDeNotas a classe que declaramos . Cada nova classe que você cria torna-se um novo tipo que pode ser utilizado para declarar variáveis e criar objetos. 
        meuBlocoDeNotas.mensagem(nomeDoCurso); // chamo meu metodo mensagem do meu objeto "meuBlocode Notas" que pertence ao metodo mensagem da classe bloco de notas .

        /* A variável nomedocurso entre parênteses é o argumento que é passado ao método mensagem para o método poder realizar sua tarefa. O valor da variável nomedocurso em main torna-se o valor do parâmetro courseName do método mensagem na linha 7 da Figura 3.4. Quando você executa esse aplicativo, observe que 
o método displayMessage gera a saída do nome que você digita como parte da mensagem de boas-vindas (Figura 3.5). */
}
    
}
/*BlocoDeNotas
- método estático é especial porque pode ser chamado sem primeiro criar um objeto da classe em que o método é declarado.
- você não pode chamar um método que pertence a outra classe até criar um objeto classe .
- Cada nova classe que você cria torna-se um novo tipo que pode ser utilizado para declarar variáveis e criar objetos. Você pode 
declarar novos tipos de classe conforme necessário; essa é uma razão pela qual o Java é conhecido como uma linguagem extensível.
-  A variável meuBlocoDeNotas é inicializada com o resultado da expressão de criação de instância de classe new BlocoDeNotas().
 A palavra-chave new cria um novo objeto da classe especificada à direita da palavra-chave (isto é, BlocoDeNotas). Os parênteses à direita de BlocoDeNotas são necessários.  esses parênteses em combinação com um nome de classe representam 
uma chamada para um construtor, que é semelhante a um método, mas é utilizado na hora em que um objeto é criado para inicializar os 
dados do objeto. Nessa seção você verá que os dados podem ser colocados entre parênteses para especificar os valores iniciais para os dados do objeto. Por enquanto, simplesmente não incluímos nada entre os parênteses.
 * 
 */