/*
 * Este é o programa "Hello, World!" mais simples possível em Java.
 * É frequentemente o primeiro programa que se escreve ao aprender
 * uma nova linguagem de programação.
 *
 * Programa: Exibe a mensagem "Hello, World!" no console.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (Hello.java).
public class Hello {

    // Método principal. É onde a execução do programa começa.
    // A assinatura do main é sempre: public static void main(String[] args)
    // public    -> pode ser acessado de qualquer lugar.
    // static    -> não precisa de uma instância da classe para ser executado.
    // void      -> o método não retorna nenhum valor.
    // String[] args -> permite receber argumentos da linha de comando.
    public static void main(String[] args) {

        // System.out.println() imprime uma mensagem no console seguida de uma quebra de linha.
        // "Hello, World!" é uma string (sequência de caracteres).
        System.out.println("Hello, World!");
    }
}