package academiaDh;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado (String nome, String numAssociado, String atividade, double valorMensal, double custoPiscina){
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
        this.habilitado = false;
    }

  public void fazExame(boolean aprovado){

        this.habilitado = aprovado;
  }

    @Override
    public double custoMensal(){
        if(this.habilitado){
            return super.custoMensal() + this.custoPiscina;

        }else{

        }

    }

}
