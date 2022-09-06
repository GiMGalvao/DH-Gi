import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


    Funcionarios func01 = new Funcionarios("Giovanna", "Galvao", "447854444", 50000.00);
    Funcionarios func02 = new Funcionarios("Cristiane", "Rodrigues", "3215789545", 70000.00);
    Funcionarios func03 = new Funcionarios("Eliane", "Silva", "447854444", 85495.00);
    Funcionarios func04 = new Funcionarios("Roberto", "Pedroso", "447854444", 54874.00);

    Empresa emp01 = new Empresa("4587454878", "DH@ Ltda");

    ArrayList<Funcionarios> funcArray = new ArrayList<>();
    funcArray.add(func01);
    funcArray.add(func02);
    funcArray.add(func03);
    funcArray.add(func04);

    emp01.setFuncionarios(funcArray);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("DH@Ltda.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(funcArray);

            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("DH@Ltda.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Funcionarios> funcionarios;
            funcionarios = (ArrayList<Funcionarios>) objectInputStream.readObject();

            System.out.println("A " + emp01.getRazaoSocial() + " cujo CNPJ é " + emp01.getCnpj() + " contratou os :" + funcionarios);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}