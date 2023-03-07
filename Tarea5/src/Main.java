import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                System.out.print("Introduce una cadena de 9 carácteres de X,O,_: ");
                String jugadas = teclado.next();
                System.out.println(jugadas);

                if (jugadas.length() != 9 || !jugadas.matches("[XO_]{9}")) {
                    System.out.println("Cadena no válida");
                return;
                }

                //Tablero
                int n = 5;

                if (n>=0 && n<=5){

                    //Marco superior
                    for(int i = 0; i < n; i++){
                        System.out.print("-");
                    }
                    System.out.println();

                    //Marco de los costados y jugadas
                        System.out.println("|" + jugadas.charAt(0) + jugadas.charAt(1) + jugadas.charAt(2) + "|");
                        System.out.println("|" + jugadas.charAt(3) + jugadas.charAt(4) + jugadas.charAt(5) + "|");
                        System.out.println("|" + jugadas.charAt(6) + jugadas.charAt(7) + jugadas.charAt(8) + "|");


                    //Marco inferior
                    for(int i = 0; i < n; i++){
                        System.out.print("-");
                    }
                }
    }
}

