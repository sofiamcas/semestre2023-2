import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Tamaño del marco del gato: ");
        int n = teclado.nextInt();

        if (n>=0 && n<=10){

            //Marco superior
            for(int i = 0; i < n; i++){
                System.out.print("-");
            }
            System.out.println();

            //Marcos de los costados
            for(int i=0; i<n-2; i++){
                System.out.print("|");
                for(int j=0; j<n-2; j++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }

            //Marco inferior
            for(int i = 0; i < n; i++){
                System.out.print("-");
            }
        }
    }
}