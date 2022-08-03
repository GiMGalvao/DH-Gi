package lutador;

public class LutadorCadastro {


    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public LutadorCadastro(String nome, String nacionalidade, int idade, double altura,
                           double peso, int vitorias, int derrotas, int empates){

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;


    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
      this.peso = peso;
     this.setCategoria();

        }
    private void setCategoria(){

        if(this.peso<52.2){

            this.categoria = "invalido";
        }else if(this.peso<=70.3){
            this.categoria = "leve";
        }else if (this.peso<=83.9){
            this.categoria = "medio";
        }else if(this.peso<=120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }

    }


     public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    public void apresentar(){

        System.out.println("O " + this.nome + " mora na " + this.nacionalidade + ", tem " + this.idade + " anos. Pesa " + this.peso + "kg. Tem " + this.altura +
                "m de altura. " +  ". Ele tem: " + this.vitorias + " vitorias, " + this.derrotas + " derrotas, " + this.empates + " empates.");


    }

    public void status() {

        System.out.println( nome + " eh um peso " + this.categoria + " Ele tem: " + vitorias + " vitorias, " + derrotas + " derrotas, " + empates + " empates.");
            }

    public void ganharLuta(){

        setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }


}

