# Resumo de Fundamentos de Java

## 1. Estrutura Básica: O ponto de partida do Java

Todo programa Java começa com a definição de uma classe pública, cujo nome deve ser igual ao nome do arquivo. O método `main` é o ponto de entrada da aplicação:

```java
public class NomeDaClasse {
    public static void main(String[] args) {
        // Código a ser executado
    }
}
````

  - `public`: indica que a classe ou método pode ser acessado de qualquer lugar.
  - `static`: permite que o método seja chamado sem criar uma instância da classe.
  - `void`: indica que o método não retorna valor.
  - `String[] args`: parâmetro que recebe argumentos da linha de comando.

-----

## 2\. Saída de Dados: `print`, `println`, `printf` e especificadores de formato

  - `System.out.print()`: imprime sem pular linha.
  - `System.out.println()`: imprime e pula para a próxima linha.
  - `System.out.printf()`: imprime com formatação, usando especificadores de formato.

**Principais especificadores:**

| Especificador | Descrição              |
| :------------ | :--------------------- |
| `%d`          | Inteiro decimal        |
| `%f`          | Ponto flutuante        |
| `%s`          | String                 |
| `%c`          | Caractere              |
| `%b`          | Booleano               |
| `%n`          | Quebra de linha        |
| `%%`          | Imprime o caractere `%` |

**Exemplo:**

```java
int idade = 20;
System.out.printf("Idade: %d anos%n", idade);
```

-----

## 3\. Classe Scanner: Entrada de Dados

A classe `Scanner` permite ler dados do teclado:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int numero = sc.nextInt();
String texto = sc.nextLine();
double valor = sc.nextDouble();
```

**Métodos mais usados:**

  - `nextInt()`, `nextDouble()`, `nextFloat()`, `nextLong()`: lêem números.
  - `next()`: lê a próxima palavra.
  - `nextLine()`: lê a linha inteira.
  - `nextBoolean()`: lê booleano.
  - `hasNextInt()`, `hasNextDouble()`, etc.: verificam se há próximo valor do tipo.

-----

## 4\. Operações Aritméticas e Regras de Precedência

**Operadores aritméticos:**

  - **Soma:** `+`
  - **Subtração:** `-`
  - **Multiplicação:** `*`
  - **Divisão:** `/`
  - **Módulo (resto):** `%`

**Regras de precedência:**

1.  Parênteses `()`
2.  Multiplicação, divisão, módulo `* / %`
3.  Soma e subtração `+ -`

**Exemplo:**

```java
int resultado = 2 + 3 * 4; // resultado = 14
```

-----

## 5\. Operadores de Igualdade, Relacionais e Precedência

  - **Igualdade:** `==` (igual), `!=` (diferente)
  - **Relacionais:** `<`, `>`, `<=`, `>=`

**Ordem decrescente de precedência dos operadores:**

1.  Parênteses `()`
2.  Pós-incremento/decremento `x++`, `x--`
3.  Pré-incremento/decremento `++x`, `--x`
4.  Multiplicação, divisão, módulo `* / %`
5.  Soma, subtração `+ -`
6.  Relacionais `< > <= >=`
7.  Igualdade `== !=`
8.  Lógicos AND `&&`
9.  Lógicos OR `||`
10. Atribuição `= += -= *= /= %=`

-----

## 6\. Tomada de Decisão: Condição, `true`/`false` e `if`

**Condição:** é uma expressão que resulta em `true` (verdadeiro) ou `false` (falso).

O bloco dentro do `if` só é executado se a condição for verdadeira.

**Exemplo de uso do `if`:**

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

```
```
