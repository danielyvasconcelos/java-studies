package deitel.capitulo03.exemplos.blocodenotas;

public class BlocoDeNotas {
    public void mensagem(String nomeCurso){ // método para disparar uma mensagem ; não é um aplicativo java pois ele nao tem o metodo main , somente é um aplicativo java quando se existe o metodo main

        System.out.printf("Seja bem-vido ao meu Bloco de notas, \n%s!\n ", nomeCurso);
    }
    
}


/* sobre o método main:
 *  o método main começa a execução de cada aplicativo. Uma classe que contém o método main inicia a execução de um aplicativo Java. A classe BlocoDeNotas não é um aplicativo porque não contém main. Portanto, se tentar executar GradeBook digitando java BlocoDeNotas na janela de comando, você obterá uma mensagem de erro
 */
/* Métodos:
 * Por convenção, os nomes de método iniciam com a primeira letra minúscula e as palavras subsequentes do nome iniciam com uma maiúscula. 
 * Os parênteses depois do nome do método indicam que isso é um método.
 * Os parênteses vazios indicam que esse método não requer informações adicionais para realizar sua tarefa.
 */