public class ControlaArticulos {

    public static void main(String[] args) {

        CheckQuality processo = new CheckQuality();
        processo.verificar(new Artigo("carne", 1100,1300, "saudável"));
        processo.verificar(new Artigo("queijo", 100,1300, "saudável"));
        processo.verificar(new Artigo("verdura", 1100,2300, "quase saudável"));
        processo.verificar(new Artigo("massas", 1100,1300, "amassada"));

    }


}
