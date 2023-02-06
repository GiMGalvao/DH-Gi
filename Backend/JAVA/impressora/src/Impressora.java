import java.text.SimpleDateFormat;
import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private SimpleDateFormat dataFabricacao;
    private int folhasDisponiveis;


    //construtor:

    public Impressora (String modelo, String tipoConexao){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.folhasDisponiveis = 0;
        this.dataFabricacao = new SimpleDateFormat("25-05-2022");
    };

    public boolean Impressora(String modelo, String tipoConexao, int folhasDisponiveis, SimpleDateFormat date){

        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.folhasDisponiveis = 0;
        this.dataFabricacao = new SimpleDateFormat("25-05-2022");
        return false;
    }

    public boolean temPapel(){

      return this.folhasDisponiveis > 0; //true or false

    }

    public void imprimir (String texto){

        if(temPapel()){

            System.out.println(texto);
            this.folhasDisponiveis --; //ou =-1
        }else{

            System.out.println("Nao tem papel");
        }

    }

    public int getFolhas (){

        return this.folhasDisponiveis;
    }


}
