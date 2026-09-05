/*
 * Este programa demonstra o uso da estrutura condicional if.
 * A condição verifica se um número é menor ou igual a 15.
 * Se a condição for verdadeira, uma mensagem é exibida no console.
 *
 * Programa: Verifica se um número está dentro de um limite definido.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (Con_if.java).
public class Con_if {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração e inicialização da variável "numero" com o valor 10.
        // O tipo int permite armazenar números inteiros.
        int numero = 10;

        // Estrutura condicional if.
        // A expressão "numero <= 15" significa: se o valor de numero for menor ou igual a 15,
        // então o bloco dentro do if será executado.

        if(numero <= 15) {

            // Mensagem exibida apenas quando a condição for verdadeira.
            System.out.println("Então esta tudo ok");
        }
    }
}
