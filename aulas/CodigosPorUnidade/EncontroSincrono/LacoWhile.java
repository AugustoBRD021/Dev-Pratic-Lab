/*
 * Este programa demonstra o uso de um laço (loop) while combinado
 * com a estrutura switch para criar um menu interativo.
 * O programa apresenta um menu de opções e continua executando
 * até que o usuário escolha a opção de sair.
 *
 * Programa: Menu interativo que permite adicionar números à uma soma.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
public class LacoWhile {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "soma" inicializada com 0.
        // Esta variável acumulará os números adicionados pelo usuário.
        int soma = 0;

        // Declaração da variável "op" inicializada com -1.
        // Esta variável armazenará a opção escolhida pelo usuário no menu.
        int op = -1 ;

        // Laço/Loop while é utilizado para repetir um bloco de código enquanto
        // uma condição for verdadeira. Diferentemente do for, o while é usado quando
        // não se sabe exatamente quantas vezes o bloco deve ser repetido.
        // Neste caso, o laço continua enquanto "op" for diferente de 0 (sair).
        while ( op != 0 ) {

            // Exibição do menu de opções de forma formatada.
            System.out.println(" ------ Menu ------------");
            System.out.println("| 1) Adicionar na soma   |");
            System.out.println("| 2) Mostrar soma.       |");
            System.out.println("| 0) Sair                |");
            System.out.println(" ------------------------");

            // Solicita ao usuário que digite a opção desejada.
            System.out.print(" Digite sua opção: ");

            // Lê um número inteiro digitado pelo usuário
            // e armazena o valor na variável "op".
            op = ler.nextInt();

            // Estrutura switch é utilizada para executar diferentes blocos de código
            // com base no valor da variável "op". É mais recomendado que múltiplos if-else
            // quando se tem um conjunto finito de valores possíveis.
            switch (op) {

                // Caso a opção seja 1: Adicionar um número à soma.
                case 1:
                    // Solicita ao usuário que digite um número.
                    System.out.println("Digite o número: ");

                    // Lê um número inteiro e o adiciona à variável soma.
                    // A operação += é equivalente a soma = soma + ler.nextInt().
                    soma += ler.nextInt();
                    break;

                // Caso a opção seja 2: Mostrar a soma atual.
                case 2:
                    // Exibe o valor atual armazenado em soma.
                    System.out.println( "Soma: " + soma );
                    break;

                // Caso a opção seja 0: Sair do programa.
                case 0:
                    // Exibe mensagem de despedida.
                    System.out.println( "Bye-bye!" );
                    break;

                // Caso o usuário digite uma opção que não existe no menu.
                default:
                    // Exibe mensagem de erro informando que a opção é inválida.
                    System.out.println( "Opção inválida!" );
                    break;
            }
        }

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}