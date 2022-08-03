package checkpoint;

public class Cliente {
    private String nome;
    private String endereco;
    private String racapet;
    private String sexoPet;

    public Cliente(String nome, String endereco, String racapet, String sexoPet) {
        this.nome = nome;
        this.endereco = endereco;
        this.racapet = racapet;
        this.sexoPet = sexoPet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRacapet() {
        return racapet;
    }

    public void setRacapet(String racapet) {
        this.racapet = racapet;
    }

    public String getSexoPet() {
        return sexoPet;
    }

    public void setSexoPet(String sexoPet) {
        this.sexoPet = sexoPet;
    }

    public String cadastrarCliente() {

       return ("O cliente " + getNome() + " mora em " + getEndereco() + " tem o pet de raca: " +getRacapet() + " Sexo: " + getSexoPet() );
    }

    public void buscarCliente(){


    }

}

