/*
 * Este programa demonstra o uso de um método que RETORNA um valor.
 * O programa lê uma temperatura em Fahrenheit, converte para Celsius
 * usando um método, e depois diagnostica a saúde do paciente
 * com base em faixas de temperatura específicas.
 *
 * Programa: Converte temperatura e diagnostica estado de saúde.
 */


// Importação da classe Scanner para permitir a leitura
// de dados digitados pelo usuário.
import java.util.Scanner;


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (LaboratorioCentral.java).
public class LaboratorioCentral {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados
        // digitados pelo usuário através do teclado.
        Scanner ler = new Scanner(System.in);

        // Solicita ao usuário que digite uma temperatura em Fahrenheit.
        System.out.print("Insira uma temperatura em Fahrenheit: ");

        // Declaração da variável "tempFahrenheit" do tipo double.
        // Armazena a temperatura lida do usuário.
        double tempFahrenheit = ler.nextDouble();

        // Chamada do método converterParaCelsius que recebe a temperatura em Fahrenheit
        // e RETORNA a temperatura em Celsius.
        // O retorno do método se TORNA o valor atribuído a tempCelsius.
        double tempCelsius = converterParaCelsius(tempFahrenheit);

        // Exibe a temperatura convertida para Celsius.
        System.out.println("A temperatura processada é: " + tempCelsius + "°C");

        // Série de verificações (if, else if, else) para diagnosticar o paciente
        // com base em faixas de temperatura específicas.

        // Verifica se a temperatura está na faixa normal (36°C a 37°C).
        if (tempCelsius > 36 && tempCelsius < 37) {
            System.out.println("Paciente esta normal!");

        // Verifica se a temperatura está levemente baixa (35°C a 36°C).
        } else if(tempCelsius > 35 && tempCelsius < 36) {
            System.out.println("Paciente esta normal, mas com a temperatura baixa");

        // Verifica se o paciente está com febre (37°C a 39°C).
        } else if(tempCelsius >= 37 && tempCelsius < 39) {
            System.out.println("Paciente esta com febre");

        // Verifica se o paciente está com febre alta (39°C ou mais).
        } else if(tempCelsius >= 39) {
            System.out.println("Paciente esta com febre alta");

        // Caso nenhuma faixa anterior seja correspondente (hipotermia).
        } else {
            System.out.println("Paciente esta com hipotermia");
        }

        // Fecha o Scanner após terminar a leitura dos dados.
        ler.close();

    }

    // Declaração de um MÉTODO chamado converterParaCelsius.
    // public       -> pode ser acessado de qualquer lugar.
    // static       -> não precisa de uma instância da classe para ser executado.
    // double       -> o tipo de dado que o método RETORNA (a temperatura em Celsius).
    // (double fahrenheit) -> PARÂMETRO que o método recebe (temperatura em Fahrenheit).
    // Diferença do método anterior: este método RETORNA um valor usando return.
    public static double converterParaCelsius(double fahrenheit) {

        // Declara a variável "resultado" que armazenará a temperatura convertida.
        // Fórmula: (Fahrenheit - 32) × 5 / 9 = Celsius.
        double resultado = (fahrenheit - 32) * 5 / 9;

        // Return entrega o valor calculado de volta ao local que chamou o método.
        // Após o return, o método encerra sua execução.
        return resultado;

    }

    /* Código como disposto no conteúdo da faculdade, nas alterações foram colocadas
    condicionais e o recebimento de input, para poder diagnosticar de forma mais
    precisa.
    public static void main(String[] args) {

        double tempFahrenheit = 98.6;

        // A mágica acontece aqui: a chamada do método SE TORNA o valor

        double tempCelsius = converterParaCelsius(tempFahrenheit);

        System.out.println("A temperatura processada é: " + tempCelsius + "°C");

        if (tempCelsius > 37.5) {

            System.out.println("ALERTA: Paciente com febre!");

        }

    }

    // Trocamos 'void' por 'double' (Promessa de retorno)

    public static double converterParaCelsius(double fahrenheit) {

        double resultado = (fahrenheit - 32) * 5 / 9;

        return resultado; // Entrega o produto final e encerra o método

    }
    */
}

/*
 * EXEMPLOS DE ENTRADA E SAÍDA:
 *
 * Exemplo 1: Entrada: 98.6 (temperatura corporal normal em Fahrenheit)
 * Saída:
 * Insira uma temperatura em Fahrenheit: 98.6
 * A temperatura processada é: 37.0°C
 * Paciente esta com febre
 * (Conversão: (98.6 - 32) × 5 / 9 ≈ 37.0°C, que está na faixa de febre)
 *
 * Exemplo 2: Entrada: 104 (temperatura alta em Fahrenheit)
 * Saída:
 * Insira uma temperatura em Fahrenheit: 104
 * A temperatura processada é: 40.0°C
 * Paciente esta com febre alta
 * (Conversão: (104 - 32) × 5 / 9 = 40.0°C, que é febre alta)
 */

