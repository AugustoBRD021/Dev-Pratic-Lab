
import java.util.Scanner;

public class Aula {
    public static void main(String[] args){

        /*
        Operadores de atribuição
        = atribuição numero = 3;
        += atribuição com soma numero += 1; == 2
        -= atribuição com subtração numero -= 1; == 1
        *= atribuição com multiplicação
        /= atribuição com divisão
        %= atribuição com módulo número %= 2; == 0 3/2 = 1 ()
        */
        // declaração da variável opeAtribuicao do tipo integer/int com 0 como valor inicial atribuído
        int opeAtribuicao = 0;
        System.out.println(opeAtribuicao);

        // atribuição com soma, nessa variável ja temos o valor de 0 e a ele será somado 3, então 0 + 3 = 3
        opeAtribuicao += 3;
        System.out.println(opeAtribuicao);

        // atribuição com subtração, por conta da operação anterior temos 3, então 3 - 1 = 2
        opeAtribuicao -= 1;
        System.out.println(opeAtribuicao);

        // atribuição com mutiplicação, por conta da operação anterior temos 2, então 2 * 2 = 4
        opeAtribuicao *= 2;
        System.out.println(opeAtribuicao);

        // atribuição com divisão, por conta da operação anterior temos 4, então 4 / 2 = 2
        opeAtribuicao /= 2;
        System.out.println(opeAtribuicao);

        // atribuição com módulo ou resto de divisão, por conta da operação anterior temos 2, então 2 / 2 = 1 (0)
        //  2 / 2    3 / 2    17 / 2     10 / 3         10 = 3 * 3 + 1
        // (0)  1   (1)  1   (1)   8     (1)  3,333...
        opeAtribuicao %= 2;
        System.out.println(opeAtribuicao);

       /*
        Operadores relacionais
        == "igual a"
        != "diferente de"
        > < "maior e menor que"
        >= <= "maior ou igual e menor ou igual que"

        // declaração de variavel
        int opeRelacionais = 1;

        if(opeRelacionais == 2){

            System.out.println("Igual a 2");

        }else if(opeRelacionais != 1){

            System.out.println("Diferente de 1");

        }else if(opeRelacionais > 1){

            System.out.println("Maior do que 1");

        }else if(opeRelacionais < 1){

            System.out.println("Menor do que 1");

        } else if(opeRelacionais >= 1 && opeRelacionais != 1) {

            System.out.println("Maior ou igual a 1, mas ele tambem tem que ser diferente de 1");

        } else if(opeRelacionais <= 1 && opeRelacionais != 1) {

            System.out.println("Menor ou igual a 1, mas ele tambem tem que ser diferente de 1 ");

        } else{

            System.out.println("Somente se ele for 1");
        }

        operadores aritméticos
        + "soma"
        - "subtração"
        * "multiplicação"
        / "divisão"
        % "módulo" ou "resto da divisão"
        ++ "incremento" numero = 1; numero++;
        -- "decremento" numero--;

        // declaração da variável opeAritmeticos do tipo integer/int com a atribuição do valor 0
        int opeAritmeticos = 0;

        // 2 * 3 == 6
        // 75 / 5 == 15
        // 35 % 5 == 0
        // 6 + 15 - 0 == 21
        opeAritmeticos = (2 * 3) + (75 / 5) - (35 % 5);
        System.out.println(opeAritmeticos);

        // soma por 1
        opeAritmeticos++;
        System.out.println(opeAritmeticos);

        // subtrai por 1
        opeAritmeticos--;
        System.out.println(opeAritmeticos);

        Operadores lógicos
        && "e"
        || "ou"
        ! "Não"

        int opeLogicos = 0;

        boolean opeLogi = opeLogicos == 0

        if(opeLogicos == 1 && !opeLogi == false || opeLogicos == 75){
            System.out.println("Ira imprimir 1");
        }

        condicionais
        if(){}
        else if(){}
        else{}
        switch(){ case (x): break; default:}

        em expressões complexas o interpretador ira ler primeiro "()", depois "!",
        depois os símbolos relacionais, depois "&&" e por último "||"

        // declaração da variavel expComplexa do tipo integer/int com a atribuição de valor 10
        int expComplexa = 10;

        // declaração da variavel ativo do tipo booleana/boolean com a atribuição do valor true/verdadeiro
        boolean ativo = true;

        // Primeiro o entre parênteses mais interno
        // expComplexa < 20 == verdadeiro
        // segundo a outra opção separada pelo ||
        // ativo originalmente é true, mas aqui ele esta sendo negado, então ele é false, logo
        // !ativo == false
        // então um retorna true e o outro false, como estão separadas pela logica de ou, retornam true
        // o parênteses mais interno é igual a () == true
        // então por enquanto temos !(? && true);
        // expComplexa > 5 == true
        // então !(true && true) == true
        // e de acordo com a tabela verdade true && true == true, logo () == true
        // mas temos mais uma negação, então !() == false
        boolean resultado = !(expComplexa > 5 && (expComplexa < 20 || !ativo));

        System.out.println(resultado);

        */

        // declaração de variáveis
        int inteiros = 10;
        double decimais = 12.50;
        String texto = "Exemplo";
        char letra = 'c';

        Scanner ler = new Scanner(System.in);

        // quero que o valor seja divido por 2.
        inteiros *= 2;//

        /* recebendo input e atribuindo para variável
        System.out.print("Digite seu nome: ");

        String nome = ler.nextLine();
        */

        /*
        if(!nome.isEmpty() && letra == 'c' && inteiros > 4 && inteiros < 10){ // vai ser verdadeira por tanto que eu escreva o meu nome no console

            // verificar erro de sintaxe ou semantica
            System.out.println("Ola, " + nome + "!\n Seu resultado é " + inteiros);

        }
        // inteiros > 20 == false
        else if(!nome.isEmpty() && letra == 'c' && inteiros > 20){

            System.out.println("Ola, " + nome + "!");

        }else{

            System.out.println("Ola!");
        }*/

        // fechamento do Scanner para evitar vazamento de memoria
        ler.close();
    }
}
