import java.util.Date;

public class ServicoVacinarProxy implements  Vacinar{
    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        if(dataVacina.before(new Date())){
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg, dataVacina, tipoVacina);
            System.out.println("CIdadao vacinado");
        }else{
            System.out.println("Nao pode vacinar!");

        }
    }
}
