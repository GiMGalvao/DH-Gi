public class Serie implements ISerie{

    private String nome;
    private String link;


    public Serie(String nome) {
    }

    public Serie() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadoException {

        System.out.println("www." + nome + ".com.br");
        return nome;
    }

}
