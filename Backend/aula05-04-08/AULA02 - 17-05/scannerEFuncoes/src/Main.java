import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

       public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           String nome;
           String sobrenome;
           String dtNasc;

           System.out.println("Digite seu nome:");
           nome = scanner.nextLine();
           System.out.println("Digite seu sobrenome:");
           sobrenome = scanner.nextLine();
           System.out.println("Digite sua data de nascimento:");
           dtNasc = scanner.next();
           System.out.println("Meu nome é: " + nome + " " + sobrenome + ". Minhas iniciais são: " + nome.charAt(0) + sobrenome.charAt(0) + ". Minha data de nascimento é: " + dtNasc);

       ;
    }
}