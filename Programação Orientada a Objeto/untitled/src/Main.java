import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int [2];
        int [] vetorB = new int [vetorA.length];


        for(int i=0; i < vetorA.length; i++){
            System.out.println("Digite numero");
            vetorA[i] = scanner.nextInt();

        }

        System.out.println("Vetor A : ");
        for(int i=0; i < vetorA.length; i++){
            System.out.println( vetorA[i]);
        }

        System.out.println("Vetor B : ");
        for(int i=0; i < vetorB.length; i++){
            System.out.println( vetorB[i] = vetorA[i]* vetorA[i]);

        }

    }


}