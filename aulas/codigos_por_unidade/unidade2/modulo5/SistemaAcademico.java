/*
 * Este programa demonstra o uso de MÉTODOS em Java.
 * O programa calcula a média de três notas e verifica
 * se o aluno foi aprovado ou reprovado.
 *
 * Programa: Sistema Acadêmico.
 */

public class SistemaAcademico {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração das variáveis que armazenam as três notas do aluno.
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 9.0;

        // Chamada do método calcularMedia.
        // Os valores das três notas são enviados como parâmetros.
        // O método retorna a média, que é exibida na tela.
        System.out.println("Média: " + calcularMedia(nota1, nota2, nota3));

        // Chamada do método verificarAprovacao.
        // O método verifica a média do aluno e retorna
        // "Aprovado" ou "Reprovado".
        System.out.println("Situação: " + verificarAprovacao(nota1, nota2, nota3));
    }

    // Declaração de um MÉTODO chamado calcularMedia.
    // public       -> pode ser acessado de qualquer lugar.
    // static       -> não precisa de uma instância da classe para ser executado.
    // double       -> o tipo de dado que o método RETORNA.
    // Os três parâmetros recebem as notas do aluno.
    public static double calcularMedia(double nota1, double nota2, double nota3) {

        // Calcula a média somando as três notas e dividindo por 3.
        // O resultado é retornado ao local que chamou o método.
        return (nota1 + nota2 + nota3) / 3;
    }

    // Declaração de um MÉTODO chamado verificarAprovacao.
    // public       -> pode ser acessado de qualquer lugar.
    // static       -> não precisa de uma instância da classe para ser executado.
    // String       -> o método retorna um texto.
    // Os três parâmetros recebem as notas do aluno.
    public static String verificarAprovacao(double nota1, double nota2, double nota3) {

        // Chama o método calcularMedia para obter a média das três notas.
        // O resultado retornado é armazenado na variável "media".
        double media = calcularMedia(nota1, nota2, nota3);

        // Verifica se a média é maior ou igual a 7.0.
        if (media >= 7.0) {

            // Retorna "Aprovado" caso a média seja igual ou superior a 7.0.
            return "Aprovado";
        }

        // Caso a condição anterior não seja verdadeira,
        // o método retorna "Reprovado".
        return "Reprovado";
    }
}

/*
 * EXEMPLO DE EXECUÇÃO:
 *
 * Entrada definida no próprio programa:
 * nota1 = 8.0
 * nota2 = 7.5
 * nota3 = 9.0
 *
 * Saída:
 * Média: 8.166666666666666
 * Situação: Aprovado
 *
 * (Média: (8.0 + 7.5 + 9.0) / 3 = 8.1666...)
 * (Como a média é maior ou igual a 7.0, o aluno é aprovado.)
 */
