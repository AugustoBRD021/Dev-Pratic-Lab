/*
 * Este programa demonstra operações simples com variáveis inteiras.
 * O programa declara duas variáveis, calcula a soma delas
 * e exibe o resultado no console.
 *
 * Programa: Calcula e exibe a soma de dois números inteiros.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (SomaSimples.java).
public class SomaSimples {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração e inicialização da variável "a" com o valor 10.
        // O tipo int permite armazenar números inteiros.
        int a = 10;

        // Declaração e inicialização da variável "b" com o valor 25.
        // O tipo int permite armazenar números inteiros.
        int b = 25;

        // Declaração e inicialização da variável "soma" com o resultado
        // da adição entre "a" e "b" (10 + 25 = 35).
        int soma = a + b;

        // System.out.println() imprime uma mensagem no console seguida de uma quebra de linha.
        // A mensagem combina texto fixo com o valor das variáveis usando concatenação (+).
        System.out.println("a soma de " + a + " e " + b + " é " + soma);
    }
}