/*
 * Este programa demonstra o uso da instrução continue dentro de um laço for.
 * O programa lê um número e exibe apenas os números ÍMPARES de 1 até esse número,
 * pulando (continue) todos os números pares.
 *
 * Programa: Exibe números ímpares usando continue para pular pares.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LacoComContinue.java).
public class LacoComContinue {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "numero".
        // Esta variável armazenará o limite superior do laço.
        int numero = ler.nextInt();

        // Laço for que irá de 1 até o valor armazenado em "numero".
        // int i = 1        -> inicializa i com 1.
        // i <= numero      -> continua enquanto i for menor ou igual a numero.
        // i++              -> incrementa i em 1 a cada iteração.
        for (int i = 1; i <= numero; i++) {

            // Verifica se o número é PAR usando o operador módulo (%).
            // i % 2 == 0 significa: o resto da divisão de i por 2 é 0 (número par).
            if (i % 2 == 0) {

                // Continue é uma instrução que PULA para a próxima iteração do laço.
                // Qualquer instrução após o continue não é executada nesta volta.
                continue;

            }

            // Exibe o valor de i.
            // Esta linha só executa se a condição do if for falsa (número ímpar).
            System.out.println(i);
        }

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}

/*
 * EXEMPLOS DE ENTRADA E SAÍDA:
 *
 * Exemplo 1: Entrada: 10
 * Saída:
 * 1
 * 3
 * 5
 * 7
 * 9
 * (Pula 2, 4, 6, 8, 10 porque são pares)
 *
 * Exemplo 2: Entrada: 7
 * Saída:
 * 1
 * 3
 * 5
 * 7
 * (Pula 2, 4, 6 porque são pares)
 */

