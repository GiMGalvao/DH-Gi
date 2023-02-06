package numeromaior;

//        Escreva uma função que receba três números e retorne o maior
//        valor entre os três números.
//        Em seguida, faça um programa que permita a entrada de
//        3 valores pelo usuário, use a função e exiba o resultado.


import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static int maiorNumero (int n1, int n2, int n3) {

        int max = n1;

            if(n2 > n1 && n2 > n3){
                max = n2;

            }if (n3 > n2 && n3 > n1){
                max = n3;
        }


        return max;

    }

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
            int num1;
            int num2;
            int num3;


        System.out.println("Digite o 1º numero:");
        num1 = scanner1.nextInt();
        System.out.println("Digite o 2º numero:");
        num2 = scanner1.nextInt();
        System.out.println("Digite o 3º numero:");
        num3 = scanner1.nextInt();

        System.out.println("O maior número é: " + maiorNumero(num1, num2, num3));

    }
}



