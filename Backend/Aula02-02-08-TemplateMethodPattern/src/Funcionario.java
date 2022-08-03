public abstract  class Funcionario {
    private String nome;
    private String sobrenome;
    private String numConta;

    public Funcionario(String nome, String sobrenome, String numConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numConta = numConta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public abstract double calcularSaldo();

    public abstract void imprimirRecibo(double quantia);

    public abstract void depositar(double quantia);

    public void pagamentoSalario(){
        double quantia = calcularSaldo();
        imprimirRecibo(quantia);
        depositar(quantia);

    }

}
