import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable {

    private String cnpj;
    private String razaoSocial;
    ArrayList<Funcionarios> funcionarios;

    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}

