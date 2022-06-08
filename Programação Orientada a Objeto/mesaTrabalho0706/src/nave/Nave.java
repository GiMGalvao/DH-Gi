package nave;

public class Nave extends Objeto{

    private double velocidade;
    private int vida;

    public Nave(int posx, int posy, char direcao, double velocidade) {
        super(posx, posy, direcao);
        this.velocidade = velocidade;

    }

    public void irA(int posx, int posy, char direcao){

    }

    public char girar(char direcao){

        return direcao;
    }

    public int restaVida(int vida){

        return vida;
    }

}
