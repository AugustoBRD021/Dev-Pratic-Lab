/*
 * Este programa demonstra que a estrutura switch em Java pode receber
 * diferentes tipos de valores: inteiro, caractere e String.
 * A ideia é comparar a variável com vários casos possíveis e executar
 * a instrução correspondente ao valor encontrado.
 *
 * Switch tradicional: usa a sintaxe com case e break, e exige que o bloco
 * seja encerrado com break para evitar que o programa continue executando
 * outros cases.
 *
 * Switch com flecha: usa a sintaxe com "->" e é mais curta e direta,
 * executando apenas o bloco do case correspondente.
 *
 * Programa: Mostra exemplos de switch com int, char e String.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (Switch.java).
public class Switch {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração e inicialização da variável "caso" com o valor 2.
        // O tipo int permite armazenar números inteiros.
        int caso = 2;

        // Declaração e inicialização da variável "letra" com o valor 'a'.
        // O tipo char permite armazenar apenas um único caractere.
        char letra = 'a';

        // Declaração e inicialização da variável "nome" com o valor "bola".
        // O tipo String permite armazenar textos.
        String nome = "bola";

        // Primeiro switch: compara a variável "caso" com os valores 0, 1 e 2.
        switch(caso) {

            // Caso o valor seja 0, executa este bloco.
            case 0:
                System.out.println("Esse é o caso 0, se a variavel 'caso' for igual a '0");
                break;

            // Caso o valor seja 1, executa este bloco.
            case 1:
                System.out.println("Esse é o caso 1, se a variavel 'caso' for igual a '1");
                break;

            // Caso o valor seja 2, executa este bloco.
            case 2:
                System.out.println("Esse é o caso 2, se a variavel 'caso' for igual a '2");
                break;

            // Caso nenhum valor anterior seja correspondente, executa o default.
            default:
                System.out.println("Esse é o caso padrão, ocorre, quando 'caso não se encaixa nos parametro");
                break;
        }

        // Segundo switch: compara a variável "letra" com os caracteres 'a', 'b' e 'c'.
        // A sintaxe com flecha "->" é uma versão mais moderna e compacta do switch.
        switch(letra) {

            // Caso a letra seja 'a'.
            case 'a' -> System.out.println("Esse é o caso a, se a variavel 'letra' for igual a 'a");

            // Caso a letra seja 'b'.
            case 'b' -> System.out.println("Esse é o caso b, se a variavel 'letra' for igual a 'b");

            // Caso a letra seja 'c'.
            case 'c' -> System.out.println("Esse é o caso c, se a variavel 'letra' for igual a 'c");

            // Caso não exista nenhuma correspondência, executa o default.
            default -> System.out.println("Esse é o caso padrão, ocorre, quando 'caso não se encaixa nos parametro");
        }

        // Terceiro switch: compara a variável "nome" com textos específicos.
        switch(nome) {

            // Caso o nome seja "bola".
            case "bola" -> System.out.println("Esse é o caso bola, se a variavel 'nome' for igual a 'bola");

            // Caso o nome seja "porta".
            case "porta" -> System.out.println("Esse é o caso porta, se a variavel 'nome' for igual a 'porta");

            // Caso o nome seja "elefante".
            case "elefante" -> System.out.println("Esse é o caso elefante, se a variavel 'nome' for igual a 'elefante");

            // Caso nenhum valor corresponde, executa o default.
            default -> System.out.println("Esse é o caso padrão, ocorre, quando 'caso não se encaixa nos parametro");
        }
    }
}
