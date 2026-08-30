/*
 * Este programa demonstra o uso de MÉTODOS em Java.
 * Um método é um bloco de código reutilizável que realiza uma tarefa específica.
 * O programa cria um método calcularMulta que recebe parâmetros e retorna um resultado.
 * O método é chamado duas vezes do main com valores diferentes.
 *
 * Programa: Calcula multa de atraso em devolução de livros usando um método.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (Metodo.java).
public class Metodo {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Primeira chamada do método calcularMulta.
        // Passa 5 dias de atraso e taxa de 2.0 reais por dia.
        // O retorno (resultado) é armazenado na variável multaLivro1.
        double multaLivro1 = calcularMulta(5, 2.0);

        // Segunda chamada do método calcularMulta.
        // Passa 10 dias de atraso e taxa de 2.0 reais por dia.
        // O retorno (resultado) é armazenado na variável multaLivro2.
        double multaLivro2 = calcularMulta(10, 2.0);

        // Exibe a multa do primeiro livro.
        System.out.println("Multa do Livro 1: R$ " + multaLivro1);

        // Exibe a multa do segundo livro.
        System.out.println("Multa do Livro 2: R$ " + multaLivro2);

    }

    // Declaração de um MÉTODO chamado calcularMulta.
    // public       -> pode ser acessado de qualquer lugar.
    // static       -> não precisa de uma instância da classe para ser executado.
    // double       -> o tipo de dado que o método RETORNA (a multa calculada).
    // (int diasAtraso, double taxaMulta) -> PARÂMETROS que o método recebe.
    public static double calcularMulta(int diasAtraso, double taxaMulta) {

        // Calcula a multa multiplicando dias de atraso pela taxa por dia.
        // Return retorna o resultado do cálculo ao local que chamou o método.
        return diasAtraso * taxaMulta;

    }

    /* Código como disposto no conteúdo da faculdade, só foi alterado a ordem entre o main e
    o metodo biblioteca, colocando o main primeiro, nos casos onde a main estara jogada em 
    outra parte do código, no código comentado ela ira sempre aparecer primeiro e em seguida
    os metodos.
    
    public class Biblioteca {

        public static double calcularMulta(int diasAtraso, double taxaMulta) {

            return diasAtraso * taxaMulta;

        }

        public static void main(String[] args) {

            double multaLivro1 = calcularMulta(5, 2.0);

            double multaLivro2 = calcularMulta(10, 2.0);

            System.out.println("Multa do Livro 1: R$ " + multaLivro1);

            System.out.println("Multa do Livro 2: R$ " + multaLivro2);

        }

    }
    */
}

/*
 * EXEMPLOS DE EXECUÇÃO:
 *
 * Exemplo 1: Execução com os valores do programa
 * Saída:
 * Multa do Livro 1: R$ 10.0
 * Multa do Livro 2: R$ 20.0
 * (Livro 1: 5 dias × R$ 2.0 = R$ 10.0)
 * (Livro 2: 10 dias × R$ 2.0 = R$ 20.0)
 *
 * Exemplo 2: Se modificássemos para calcularMulta(3, 5.0) e calcularMulta(7, 1.5)
 * Saída:
 * Multa do Livro 1: R$ 15.0
 * Multa do Livro 2: R$ 10.5
 * (Livro 1: 3 dias × R$ 5.0 = R$ 15.0)
 * (Livro 2: 7 dias × R$ 1.5 = R$ 10.5)
 */

