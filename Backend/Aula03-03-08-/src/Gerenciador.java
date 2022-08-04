public abstract class Gerenciador {

    private Gerenciador gerenciadorSeguinte;

    //get para falar qual é o próximo gerenciador
    public Gerenciador getGerenciadorSeguinte() {
        return gerenciadorSeguinte;
    }
    //set para definir
    public void setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
    }

    public abstract void verificar(Email email);

}
