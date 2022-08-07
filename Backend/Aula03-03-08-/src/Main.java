public class Main {
    public static void main(String[] args) {

        CheckEmail checkemail = new CheckEmail();
        checkemail.verificar(new Email("gi@gi.com", "id@id.com", "Oi"));
        checkemail.verificar(new Email("gi@gi.com", "comercial@colmeia.com", "Oi"));
        checkemail.verificar(new Email("gi@gi.com", "id@id.com", "Gerencia"));
        checkemail.verificar(new Email("gi@gi.com", "id@id.com", "Técnico"));

    }
}