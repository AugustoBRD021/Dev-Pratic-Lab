/*
 * Este programa demonstra o uso de laços for de diferentes formas:
 * 1. Leitura e acumulação de múltiplos valores decimais
 * 2. Loop com iteração crescente (0 até 10)
 * 3. Loop com iteração decrescente (10 até 1)
 *
 * Programa: Trabalha com loops crescentes e decrescentes.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LacoFor.java).
public class LacoFor {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "soma" inicializada com 0.0.
        // O tipo double permite armazenar números com casas decimais.
        double soma = 0.0;

        // Declaração da variável "n" inicializada com 5.
        // Esta variável define quantos números serão lidos.
        int n = 5;

        // Laço for que irá executar 5 vezes (de 1 até 5).
        // int i = 1         -> inicializa a variável i com 1.
        // i <= n            -> condição: enquanto i for menor ou igual a 5.
        // i++               -> incrementa i em 1 a cada iteração.
        for( int i = 1; i <= n; i++) {

            // Declaração da variável "valor" para armazenar temporariamente
            // cada número decimal lido do usuário.
            double valor = ler.nextDouble();

            // Adiciona o valor lido à variável soma.
            // soma += valor é equivalente a soma = soma + valor.
            soma += valor;
        }

        // Exibe na tela a soma total de todos os valores lidos.
        System.out.println("O valor das somas é; " + soma);

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();

        // Exemplos adicionais de loops com ordem crescente e decrescente.

        // Primeiro exemplo: loop com iteração CRESCENTE.
        // Este loop exibe os números de 0 até 10 em ordem crescente.
        // int i = 0         -> inicializa i com 0.
        // i <= 10           -> continua enquanto i for menor ou igual a 10.
        // i++               -> incrementa i em 1 a cada volta.
        for (int i = 0; i <= 10; i++) {

            // Exibe cada número na sequência crescente.
            System.out.println(i);
        }

        // Segundo exemplo: loop com iteração DECRESCENTE.
        // Este loop exibe os números de 10 até 1 em ordem decrescente.
        // int i = 10        -> inicializa i com 10.
        // i >= 1            -> continua enquanto i for maior ou igual a 1.
        // i--               -> decrementa i em 1 a cada volta.
        for (int i = 10; i >= 1; i--) {

            // Exibe cada número na sequência decrescente.
            System.out.println(i);
        }
    }
}