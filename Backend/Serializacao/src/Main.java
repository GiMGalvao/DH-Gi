import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cachorro cao1 = new Cachorro("Mel", "Labradora", 5, "DIr 5");
        Cachorro cao2 = new Cachorro("Milly", "Poodle", 15, "DIr 5");
        Cachorro cao3 = new Cachorro("Meg", "Vira LAta", 3, "DIr 5");
        Cachorro cao4 = new Cachorro("Kalli", "Pitbull", 1, "DIr 5");

        ArrayList<Cachorro> segunda = new ArrayList<>();
        ArrayList<Cachorro> terca = new ArrayList<>();
        ArrayList<Cachorro> quarta = new ArrayList<>();
        ArrayList<Cachorro> quinta = new ArrayList<>();
        ArrayList<Cachorro> sexta = new ArrayList<>();

        segunda.add(cao1);
        segunda.add(cao2);
        segunda.add(cao4);

        terca.add(cao2);
        terca.add(cao4);

        quarta.add(cao1);
        quarta.add(cao2);
        quarta.add(cao3);
        quarta.add(cao4);

        quinta.add(cao2);
        quinta.add(cao3);
        quinta.add(cao4);

        sexta.add(cao1);
        sexta.add(cao3);
        sexta.add(cao4);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("cachorros.datas");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(segunda);
            objectOutputStream.writeObject(terca);
            objectOutputStream.writeObject(quarta);
            objectOutputStream.writeObject(quinta);
            objectOutputStream.writeObject(sexta);

            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("cachorros.datas");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Cachorro> dias;

            for(int i = 0; i< 5; i++){
                System.out.println("Dia: " + (i+1));
                System.out.println("================");

                dias = (ArrayList<Cachorro>) objectInputStream.readObject();

                for(Cachorro c: dias){

                    System.out.println(c);
                }

            }

            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}