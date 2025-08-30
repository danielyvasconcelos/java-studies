// TesteAmbiente.java
public class TesteDeAmbiente2 {
    public static void main(String[] args) {
        System.out.println("🎉 Java funcionando no VS Code!");
        
        // Teste de recursos básicos
        System.out.println("Versão Java: " + System.getProperty("java.version"));
        
        // Teste de auto-complete e formatação
        String nome = "Estudante Java";
        int idade = 25;
        
        // Teste de debugging (coloque breakpoint aqui)
        mostrarInfo(nome, idade);
        
        // Teste de arrays e loops
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        System.out.println("✅ Ambiente configurado com sucesso!");
    }
    
    // Teste de métodos e parâmetros
    public static void mostrarInfo(String nome, int idade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}