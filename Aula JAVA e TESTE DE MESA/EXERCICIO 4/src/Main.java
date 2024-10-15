import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade<13){
            System.out.println("Criança");
        }
        else if( idade<18){
            System.out.println("Adolescente");
        }
        else {
            System.out.println("Adulto");
        }

        }
    }
