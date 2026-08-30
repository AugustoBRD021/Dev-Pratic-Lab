/*
 * Este programa demonstra o uso de um laço (loop) for combinado
 * com a leitura de múltiplos dados do usuário através do Scanner.
 * O programa pede uma quantidade de números e calcula a soma deles.
 *
 * Programa: Lê N números digitados pelo usuário e calcula a soma usando laço for.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
public class LacoForR {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "numero".
        // O tipo int permite armazenar números inteiros.
        int numero;

        // Solicita ao usuário que digite quantos números deseja somar.
        System.out.print("Quantos números você quer somar: ");

        // Lê um número inteiro digitado pelo usuário
        // e armazena o valor na variável "numero".
        numero = ler.nextInt();

        // Declaração da variável "soma" inicializada com 0.
        // Esta variável acumulará a soma de todos os números lidos.
        int soma = 0;

        // Laço/Loop for é utilizado para repetir um bloco de código um número específico de vezes.
        // Neste caso, irá repetir de 1 até o valor armazenado em "numero".
        // int i = 1         -> inicializa a variável i com 1.
        // i <= numero       -> condição: enquanto i for menor ou igual a numero.
        // i++               -> incrementa i em 1 a cada iteração (volta do loop).
        for( int i = 1 ; i <= numero ; i++ ){

            // A cada iteração, solicita ao usuário que digite um número.
            System.out.print("Digite o " + i + "º valor: ");

            // Lê um número inteiro digitado pelo usuário e imediatamente
            // o adiciona (soma) à variável soma.
            soma = soma + ler.nextInt();
        }

        // Exibe na tela o resultado final da soma de todos os números lidos.
        System.out.println("Resultado da soma é: " + soma);

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}