/*
 * Este programa demonstra o uso de um laço do-while para validação de entrada.
 * A diferença em relação ao while é que o bloco de código é executado
 * pelo menos uma vez antes de verificar a condição.
 *
 * Programa: Valida entrada do usuário com laço do-while.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LacoDoWhile.java).
public class LacoDoWhile {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "amostras" sem inicialização.
        // Esta variável armazenará o número de amostras informado pelo usuário.
        int amostras;

        // Laço do-while para validação de entrada.
        // Este laço executa o bloco de código PELO MENOS UMA VEZ,
        // mesmo se a condição for falsa no início.
        // Após a primeira execução, verifica a condição e continua repetindo
        // enquanto o valor for menor ou igual a zero.
        do {

            // Solicita ao usuário que digite a quantidade de amostras desejadas.
            System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");

            // Lê um número inteiro digitado pelo usuário
            // e o armazena na variável "amostras".
            amostras = ler.nextInt();

        // Condição do do-while: continua repetindo enquanto amostras for <= 0.
        } while (amostras <= 0);

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}
