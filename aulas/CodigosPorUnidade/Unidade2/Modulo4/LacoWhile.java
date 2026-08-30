/*
 * Este programa demonstra o uso de um laço while para validação de entrada.
 * O programa pede ao usuário um número (quantidade de amostras) e continua
 * pedindo até que o usuário digite um valor maior que zero.
 *
 * Programa: Valida entrada do usuário com laço while.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LacoWhile.java).
public class LacoWhile {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Solicita ao usuário que digite a quantidade de amostras desejadas.
        System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");

        // Declaração da variável "amostras".
        // Esta variável armazenará o número de amostras informado pelo usuário.
        int amostras = ler.nextInt();

        // Laço while que verifica se o valor digitado é válido.
        // Enquanto o valor for menor ou igual a zero, o programa pede novamente.
        // amostras <= 0 -> condição: se amostras for menor ou igual a 0, entra no loop.
        while (amostras <= 0) {

            // Mensagem informando que o valor é inválido e solicitando um novo valor.
            System.out.print("Valor Invalido. Digite Novamente: ");

            // Lê um novo valor do usuário e o armazena na variável "amostras".
            amostras = ler.nextInt();
        }

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }

}
