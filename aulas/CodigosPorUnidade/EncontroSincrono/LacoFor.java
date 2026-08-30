/*
 * Este programa demonstra o uso de um laço (loop) for para
 * calcular a soma de todos os números de 1 até um número
 * digitado pelo usuário.
 *
 * Programa: Calcula a soma dos números de 1 até N usando laço for.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
public class LacoFor {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "numero".
        // O tipo int permite armazenar números inteiros.
        int numero;

        // Solicita ao usuário que digite um número inteiro positivo.
        System.out.print("Digite um número inteiro positivo: ");

        // Lê um número inteiro digitado pelo usuário
        // e armazena o valor na variável "numero".
        numero = ler.nextInt();

        // Declaração da variável "soma" inicializada com 0.
        // Esta variável acumulará a soma dos números.
        int soma = 0;

        // Laço/Loop for é utilizado para repetir um bloco de código um número específico de vezes.
        // Neste caso, irá repetir de 1 até o valor armazenado em "numero".
        // int i = 1         -> inicializa a variável i com 1.
        // i <= numero       -> condição: enquanto i for menor ou igual a numero.
        // i++               -> incrementa i em 1 a cada iteração (volta do loop).
        for( int i = 1 ; i <= numero ; i++ ){

            // A cada iteração, adiciona o valor de i à variável soma.
            // soma = soma + i é equivalente a soma += i.
            soma = soma + i;
        }

        // Exibe na tela o resultado da soma.
        System.out.println("Soma de 1 até " + numero +  " é: " + soma);

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}