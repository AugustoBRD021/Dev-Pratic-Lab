/*
 * Este programa demonstra o uso de estruturas condicionais (if)
 * com operadores lógicos para avaliar múltiplas condições.
 * O programa verifica se um paciente está com febre e batimentos cardíacos
 * elevados, emitindo um alerta caso ambas as condições sejam verdadeiras.
 *
 * Programa: Verifica temperatura e frequência cardíaca para diagnosticar alerta médico.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (Temperatura.java).
public class Temperatura {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração e inicialização da variável "temperatura" com o valor 38.5.
        // O tipo double permite armazenar números com casas decimais (números reais).
        double temperatura = 38.5;

        // Declaração e inicialização da variável "frequenciaCardiaca" com o valor 110.
        // O tipo int permite armazenar números inteiros (batimentos por minuto).
        int frequenciaCardiaca = 110;

        // Estrutura condicional if que verifica DUAS condições simultâneas:
        // 1. temperatura > 38     -> verifica se a temperatura é maior que 38°C (febre)
        // 2. frequenciaCardiaca > 100  -> verifica se os batimentos são maiores que 100 bpm
        // O operador && (AND lógico) significa que AMBAS as condições devem ser verdadeiras
        // para que o bloco de código dentro do if seja executado.
        if(temperatura > 38 && frequenciaCardiaca > 100) {

            // Mensagem exibida apenas se AMBAS as condições forem verdadeiras.
            // Neste caso, o paciente tem febre E batimentos cardíacos elevados.
            System.out.println("Alerta, paciente esta passando mal.");
        }
    }    
}
