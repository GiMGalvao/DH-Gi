public class GerenciadorGerencia extends Gerenciador{


    @Override
    public void verificar(Email email) {
        if(email.getDestino().equalsIgnoreCase("gerencia@colmeia.com") ||
        email.getAssunto().equalsIgnoreCase("Gerencia") ||
        email.getAssunto().equalsIgnoreCase("Gerencia")){
        System.out.println("Enviado para o departamento Gerencial");
    } else{
           if (this.getGerenciadorSeguinte() != null) {
               this.getGerenciadorSeguinte().verificar(email);
           }
        }

    }

}
