/*
 * Este programa demonstra o uso de encadeamento de condições com if, else if e else.
 * O código verifica o nome da pessoa e o período do dia para exibir uma mensagem
 * diferente de acordo com as combinações possíveis.
 *
 * Programa: Exibe saudações personalizadas conforme o horário e o nome.
 */


// Declaração da classe principal do programa.
// O nome da classe deve corresponder ao nome do arquivo (Con_ElseIf.java).
public class Con_ElseIf {

    // Método principal. É onde a execução do programa começa.
    public static void main(String[] args) {

        // Declaração e inicialização da variável "name" do tipo String.
        // String é uma classe em Java usada para armazenar texto.
        String name = "Luciano";

        // Declaração e inicialização da variável "horario" do tipo String.
        String horario = "Tarde";

        // Primeira condição: verifica se o nome é "Luciano" e o horário é "Manhã".
        // O operador && significa "E lógico". As duas condições precisam ser verdadeiras.
        if (name == "Luciano" && horario == "Manhã") {

            // Exibe uma mensagem de bom dia para Luciano.
            System.out.println("Bom dia" + name);

        // Segunda condição: verifica se o nome é "Luciano" e o horário é "Tarde".
        } else if(name == "Luciano" && horario == "Tarde") {

            // Exibe uma mensagem de boa tarde para Luciano.
            System.out.println("Boa"+ horario + ", " + name);

        // Terceira condição: verifica se o nome é "Luciano" e o horário é "Noite".
        } else if(name == "Luciano" && horario == "Noite") {

            // Exibe uma mensagem de boa noite para Luciano.
            System.out.println("Boa" + horario + ", " + name );

        // Caso nenhuma das condições anteriores seja verdadeira.
        } else {

            // Exibe uma mensagem genérica de boas-vindas.
            System.out.println("Boas-vindas, " + name);
        }
    }
}
