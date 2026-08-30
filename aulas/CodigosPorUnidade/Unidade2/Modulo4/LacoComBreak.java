/*
 * Este programa demonstra o uso da instrução break dentro de um laço for.
 * O programa lê um número e exibe os números de 1 até esse número,
 * mas INTERROMPE (break) quando chegar a 6, mesmo que o número seja maior.
 *
 * Programa: Exibe números com interrupção usando break.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LacoComBreak.java).
public class LacoComBreak {

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

            // Verifica se i chegou a 6.
            // Se a condição for verdadeira, o laço é interrompido.
            if (i == 6) {

                // Break é uma instrução que SAI DO LAÇO imediatamente.
                // Qualquer instrução após o break dentro do laço não será executada.
                break;

            }

            // Exibe o valor de i.
            // Esta linha só executa se a condição do if for falsa.
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
 * 2
 * 3
 * 4
 * 5
 * (Para aqui porque i chegou a 6 e break foi executado)
 *
 * Exemplo 2: Entrada: 3
 * Saída:
 * 1
 * 2
 * 3
 * (O laço termina naturalmente porque 3 < 6, então o break não é acionado)
 */

