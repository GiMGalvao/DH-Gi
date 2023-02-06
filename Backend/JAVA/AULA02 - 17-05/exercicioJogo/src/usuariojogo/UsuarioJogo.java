package usuariojogo;

public class UsuarioJogo {
    private String nome;
    private String nickName;
    private int pontuacao = 0;
    private int nivel;

    public UsuarioJogo(String nome, String nickName){
        this.nome = nome;
        this.nickName = nickName;
    }

    public void aumentarPontuacao(){
        this.pontuacao =+ 1;
    }

    public void subirNivel(){
        this.pontuacao =+ 1;
    }

    public void bonus(){
        this.pontuacao =+ 1;
    }
};


