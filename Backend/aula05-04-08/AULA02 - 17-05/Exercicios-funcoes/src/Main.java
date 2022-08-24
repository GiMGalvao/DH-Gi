public class Main{

        public static boolean resultado(int num1, int num2){
            int resposta = num1%num2;
            boolean t = true;
            boolean f = false;

            if(resposta == 0) {

                System.out.println("yes, it is " + t);

            }else{

                System.out.println("no its not" + f);
            }

            return t; //<<precisa ser boolean


        };


        public static void main(String[] args) {


            System.out.println(resultado(10,50));
        }
    }


