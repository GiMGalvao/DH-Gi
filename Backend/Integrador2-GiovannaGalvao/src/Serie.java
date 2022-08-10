public class Serie implements ISerie {

    private String nome;
    private String link;

    public Serie(String nome, String link) {
        this.nome = nome;
        this.link = link;
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
    public int getSerie(String nome) {



        switch (nome){
            case "Friends":
                serie = new Serie("Friends", "www.friends.com");
                break;
            case "Stranger Things":
                serie = new Serie("Stranger Things", "www.st.com");


                break;
        }

        return 0;
    }
}
