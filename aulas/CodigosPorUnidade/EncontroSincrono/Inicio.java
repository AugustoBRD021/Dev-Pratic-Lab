/*
 * Este primeiro programa terá mais comentários para explicar
 * o que cada parte faz e ajudar a entender melhor como funciona
 * a linguagem Java.
 *
 * Programa: Verifica se a pessoa é maior ou menor de idade.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
public class Inicio {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Declaração da variável "idade".
        // O tipo int permite armazenar números inteiros.
        int idade;

        // Solicita ao usuário que digite sua idade.
        System.out.print("Digite a sua idade: ");

        // Lê um número inteiro digitado pelo usuário
        // e armazena o valor na variável "idade".
        idade = ler.nextInt();

        // Verifica se a idade é maior ou igual a 18.
        // O operador >= significa "maior ou igual a".
        if (idade >= 18) {

            // Executado caso a condição do if seja verdadeira.
            System.out.println("Você é maior de idade!");

        }

        // Caso a condição do if seja falsa, este bloco será executado.
        else {

            System.out.println("Você é menor de idade!");
        }

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();
    }
}