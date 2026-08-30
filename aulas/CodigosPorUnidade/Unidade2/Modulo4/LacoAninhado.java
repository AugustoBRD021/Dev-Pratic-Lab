/*
 * Este programa demonstra o uso de laços aninhados (um for dentro de outro).
 * O programa lê dois números: linhas e colunas, e exibe uma matriz de
 * coordenadas (linha, coluna) em um formato de grade.
 *
 * Programa: Cria uma matriz de coordenadas usando laços aninhados.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LacoAninhado.java).
public class LacoAninhado {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "linha".
        // Esta variável armazenará o número de linhas da matriz.
        int linha = ler.nextInt();

        // Declaração da variável "coluna".
        // Esta variável armazenará o número de colunas da matriz.
        int coluna = ler.nextInt();

        // Primeiro laço for (laço externo): itera sobre as LINHAS.
        // int i = 1        -> inicializa i com 1 (primeira linha).
        // i <= linha        -> continua enquanto i for menor ou igual ao número de linhas.
        // i++              -> incrementa i em 1 a cada iteração.
        for (int i = 1; i <= linha; i++) {

            // Segundo laço for (laço interno): itera sobre as COLUNAS.
            // Este laço está ANINHADO (dentro) do primeiro laço.
            // int j = 1        -> inicializa j com 1 (primeira coluna).
            // j <= coluna      -> continua enquanto j for menor ou igual ao número de colunas.
            // j++             -> incrementa j em 1 a cada iteração.
            for (int j = 1; j <= coluna; j++) {

                // Exibe as coordenadas (i, j) no formato (linha, coluna).
                // System.out.print() exibe SEM quebra de linha.
                System.out.print("(" + i + "," + j + ") ");

            }

            // Após completar todas as colunas de uma linha, exibe uma quebra de linha.
            // System.out.println() exibe UMA QUEBRA DE LINHA.
            System.out.println();

        }

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}

/*
 * EXEMPLOS DE ENTRADA E SAÍDA:
 *
 * Exemplo 1: Entrada: 2 2
 * (1,1) (1,2)
 * (2,1) (2,2)
 *
 * Exemplo 2: Entrada: 3 3
 * (1,1) (1,2) (1,3)
 * (2,1) (2,2) (2,3)
 * (3,1) (3,2) (3,3)
 *
 * Exemplo 3: Entrada: 2 4
 * (1,1) (1,2) (1,3) (1,4)
 * (2,1) (2,2) (2,3) (2,4)
 */

