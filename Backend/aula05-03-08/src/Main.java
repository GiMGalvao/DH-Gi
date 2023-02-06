import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Batata", "FR", "558887455", new Date(), "Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(pessoa.getRg(), pessoa.getDataVacina(), pessoa.getNomeVacina());


    }
}