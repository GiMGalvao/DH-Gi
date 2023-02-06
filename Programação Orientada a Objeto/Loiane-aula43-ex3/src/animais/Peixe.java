package animais;

public class Peixe extends Animal{

    public Peixe(int patas, String cor, String ambiente) {
        super(patas, cor, ambiente);
    }

    public String caracteristicas(){
       setPatas(0);
       setCor("Cinza");
       setAmbiente("Mar");



    }


}
