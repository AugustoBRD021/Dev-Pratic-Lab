/*
 * Este programa demonstra o uso de uma estrutura condicional if-else
 * para verificar o nível de oxigenação de um paciente.
 * Se a oxigenação estiver abaixo do valor crítico, o sistema aciona
 * um alerta; caso contrário, tudo parece estar normal.
 *
 * Programa: Verifica se o nível de oxigenação está em risco.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (ConElse.java).
public class Con_Else {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração e inicialização da variável "oxigenação" com o valor 90.
        // O tipo int permite armazenar números inteiros.
        int oxigenação = 90;

        // Estrutura condicional if-else.
        // Se a oxigenação for menor que 92, a condição é verdadeira e entra no bloco do if.
        // Caso contrário, entra no bloco do else.
        if ( oxigenação < 92) {

            // Mensagem exibida quando a condição for verdadeira.
            // Isso indica que o nível de oxigenação está abaixo do limite esperado.
            System.out.println("ALERTA: Oxigenação baixa!");

        } else {

            // Mensagem exibida quando a condição do if for falsa.
            // Nesse caso, o nível de oxigenação está em situação normal.
            System.out.println("Sinais estáveis: Oxigenação em nível seguro.");
        }
    }
}