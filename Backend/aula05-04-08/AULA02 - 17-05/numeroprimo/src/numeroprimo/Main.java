package numeroprimo;

import java.util.Arrays;

public class Main {

    public static int ehPrimo (int num){

        int primo = num%2;


        if(primo == 1){

            System.out.println("O número é primo");
        }else{
            System.out.println("O número NÃO é primo");

        }

        return (primo);

    }

    public static void main(String[] args) {

             System.out.println(ehPrimo(20));

    }
}