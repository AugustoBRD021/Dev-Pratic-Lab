import java.util.Scanner;

public class Mario {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);



        System.out.print("Digite o tamanho: ");
        int tamanho = ler.nextInt();



        // imprimir linha por linha
        for(int j = 0; j < tamanho; j++){
        // iteração numero da repetição

            // imprimir o espaçamento
            //             0      4       1   1
            for(int i = 0; i < (tamanho - j - 1); i++){
                System.out.print(" ");
            }

            // imprimir o #
            //            4       1; 5     4       1
            for(int i = tamanho + 1; i > tamanho - j; i--){
                System.out.print("#");
            }
            System.out.print("  ");
            for(int i = tamanho + 1; i > tamanho - j; i--){
                System.out.print("#");
            }
            System.out.println();
        }





        /*
        *
        *        #  #
        *       ##  ##
        *
        *
        *
        * */
    }

}
