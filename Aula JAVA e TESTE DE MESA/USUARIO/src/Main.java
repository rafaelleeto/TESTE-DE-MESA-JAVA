import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int numero=0;
        int media=0;
        int media2=0;
        int media_final=0;
        System.out.println("Digite um numero ");
        numero= scanner.nextInt();
        for (int cont=0;cont<numero;cont++){
            System.out.println("Digite num numero: ");
            media= scanner.nextInt();
            media2=media2+media;


        }
        media_final=media2/numero;
        System.out.println(media_final);


    }
}

