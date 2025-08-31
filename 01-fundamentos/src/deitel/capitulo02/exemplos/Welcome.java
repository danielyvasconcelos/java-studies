package deitel.capitulo02.exemplos;
//programa de impressão de texto
public class Welcome { // classe definida pelo programador
    //método inicia a execução
    public static void main (String[] args){ 
        System.out.print("Bem-vindos"); //imprime sem pular linha 
        System.out.println("Meu primeiro programa em java"); // imprime pulando uma linha 
        System.out.println("Olá,\n meu nome é Daniely! \n Muito prazer em te conhecer ");// imprime toda essa linhade codigo pulando linha a cada \n
        System.out.printf("%s\n%s\n", "Bom dia", "Java Programing!"); // (f significa “formatted”)  exibe os dados formatados;  lista separada por vírgulas. 


    } // fim do metodo main
    
} // fim da classe 

/* NOMEAÇÃO DE CLASSES PROPRIAS:
 * regra 01 : sempre a primeira letra da classe(identificador) tem que ser maiscula .
 *  BOA PRATICA : Por convenção, inicie o identificador de cada nome de classe com uma letra maiúscula e inicie cada palavra subsequente do identi
ficador com uma letra maiúscula.
 * regra 02: outros ipos de identificadores validos :  Bemvindo1, $valor, _valor, m_campoDeEntrada1 e botao7;
 *  O Java faz distinção entre letras maiúsculas e minúsculas ;
 */

 /*ENTENDENDO O public static void main (String[] args)
 public - public define que um elemento (classe, método ou variável) pode ser acessado por qualquer outra classe em qualquer pacote.
 static - static indica que um membro (variável, método ou bloco) pertence à classe, e não a uma instância específica da classe.
 void -  void indica que esse método não devolverá nenhuma informação.
 main() - Os parênteses depois do identificador main indicam que ele é um bloco de construção do programa chamado método.  Para um aplicativo Java, um dos métodos 
deve ser chamado main e deve ser definido como mostrado na linha 7; caso contrário, a JVM não executará o aplicativo. 
 String[]  args  -uma parte requerida da declaração do método main
*/

/* ENTENDENDO A SAÍDA
 * System.out - é conhecido como o objeto de saída padrão
 *  método System.out.println exibe (ou imprime) uma linha de texto na janela de comando. A string entre parênteses na linha é o argumento para o método.
 * 
 */