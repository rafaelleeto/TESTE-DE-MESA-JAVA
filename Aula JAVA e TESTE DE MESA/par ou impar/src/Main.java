import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero!");
         numero=scanner.nextInt();

        if (numero %2 ==0){
            System.out.println(" é par" );
        }

        else {
            System.out.println("É impar ");
        }

    }
}







