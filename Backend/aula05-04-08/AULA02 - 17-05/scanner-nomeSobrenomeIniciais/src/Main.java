import java.util.Arrays;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner scanner; //crio o objeto
        scanner = new Scanner(System.in); //crio o scanner

        String nome;
        String sobrenome;
        String inicial;

        System.out.println("Nome:");
        nome = scanner.next();
        System.out.println("Sobrenome:");
        sobrenome = scanner.next();

        inicial = scanner.nextLine();
        System.out.println("Iniciais: " + nome.charAt(0) + sobrenome.charAt(0));


    }
}