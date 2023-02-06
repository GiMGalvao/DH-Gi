public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Email email) {
        if(email.getDestino().equalsIgnoreCase("tecnico@colmeia.com") ||
        email.getAssunto().equalsIgnoreCase("Técnico") ||
        email.getAssunto().equalsIgnoreCase("Tecnico")){
        System.out.println("Enviado para o departamento Tecnico");
    } else{
           if (this.getGerenciadorSeguinte() != null) {
               this.getGerenciadorSeguinte().verificar(email);
           }
        }

    }

}
