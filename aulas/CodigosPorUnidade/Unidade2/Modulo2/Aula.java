/*
Operadores relacionais
== "igual a"
!= "diferente de"
> < "maior e menor que"
>= <= "maior ou igual e menor ou igual que"

operadores aritméticos
+ "soma"
- "subtração"
* "multiplicação"
/ "divisão"
% "módulo" ou "resto da divisão"
++ "incremento" numero = 1; numero++;
-- "decremento" numero--;

operadores de atribuição
= atribuição numero = 3;
+= atribuição com soma numero += 1; == 2
-= atribuição com subtração numero -= 1; == 1
*= atribuição com multiplicação
/= atribuição com divisão
%= atribuição com módulo número %= 2; == 0 3/2 = 1 ()

Operadores lógicos
&& "e"
|| "ou"
! "Não"

condicionais
if(){}
else if(){}
else{}
switch(){ case (x): break; default:}

em expressões complexas o interpretador ira ler primeiro "()", depois "!",
depois os símbolos relacionais, depois "&&" e por último "||"
*/

import java.util.Scanner;

public class Aula {
    public static void main(String[] args){

        // = atribuição == comparação

        // declaração de variáveis
        int inteiros = 10;
        double decimais = 12.50;
        String texto = "Exemplo";
        char letra = 'c';

        Scanner ler = new Scanner(System.in);

        // quero que o valor seja divido por 2.
        inteiros /= 2;// 10 / 2 = 5

        // recebendo input e atribuindo para variável
        System.out.print("Digite seu nome: ");

        String nome = ler.nextLine();

        //  verdadeira
        // nome.isEmpty() == false, nome = "Luciano", !nome.isEmpty == true
        // letra == 'c' == true
        // inteiros > 4 == true && inteiros < 10 == true
        if(!nome.isEmpty() && letra == 'c' && inteiros > 4 && inteiros < 10){ // vai ser verdadeira por tanto que eu escreva o meu nome no console

            // verificar erro de sintaxe ou semantica
            System.out.println("Ola, " + nome + "!\n Seu resultado é " + inteiros);

        }
        // inteiros > 20 == false
        else if(!nome.isEmpty() && letra == 'c' && inteiros > 20){

            System.out.println("Ola, " + nome + "!");

        }else{

            System.out.println("Ola!");
        }

        // fechamento do Scanner para evitar vazamento de memoria
        ler.close();
    }
}
