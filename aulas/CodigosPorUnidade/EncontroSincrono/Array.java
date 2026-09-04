/*
 * Este programa demonstra o uso de arrays (vetores) para armazenar
 * múltiplos valores do mesmo tipo. O programa lê 5 números inteiros,
 * armazena em um array, calcula a soma e a média deles.
 *
 * Programa: Lê 5 números, armazena em um array e calcula soma e média.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
public class Array {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "soma" inicializada com 0.
        // Esta variável acumulará a soma de todos os números lidos.
        int soma = 0;

        // Declaração da variável "media" do tipo double.
        // O tipo double permite armazenar números com casas decimais.
        double media;

        // Declaração de um array (vetor) de inteiros com tamanho 5.
        // Um array é uma estrutura de dados que armazena múltiplos valores
        // do mesmo tipo em posições sequenciais de memória.
        // Os índices do array começam em 0 e vão até 4 (tamanho - 1).
        int[] numeros = new int[5];

        // Laço/Loop for é utilizado para percorrer o array.
        // Neste caso, o laço irá executar 5 vezes (i de 0 até 4).
        // int i = 0         -> inicializa a variável i com 0.
        // i < 5             -> condição: enquanto i for menor que 5.
        // i++               -> incrementa i em 1 a cada iteração.
        for( int i = 0 ; i < 5 ; i++){

            // Solicita ao usuário que digite um número.
            // A expressão (i+1) é usada para exibir posições de 1 a 5 (mais intuitivo).
            System.out.print( "Digite o " + (i+1) + "º número: " );

            // Lê um número inteiro digitado pelo usuário e o armazena
            // no array "numeros" na posição indicada pelo índice i.
            numeros[i] = ler.nextInt();

            // Adiciona o valor armazenado no array à variável soma.
            // soma += numeros[i] é equivalente a soma = soma + numeros[i].
            soma += numeros[i];
        }

        // Exibe o início da listagem dos números armazenados no array.
        System.out.print("Números digitados: ");

        // Novo laço for para percorrer o array e exibir todos os valores.
        for( int i = 0 ; i < 5 ; i++){

            // Exibe cada número armazenado no array separado por um travessão.
            System.out.print( numeros[i] + " - " );
        }

        // Exibe uma linha de separação para melhor visualização.
        System.out.print("\n------------------------");

        // Exibe o valor da soma de todos os números.
        System.out.println("Soma: " + soma);

        // Calcula a média dividindo a soma pelo total de números (5).
        media = soma / 5;

        // Exibe o valor da média.
        System.out.println("Média: " + media);

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();   
    }
}