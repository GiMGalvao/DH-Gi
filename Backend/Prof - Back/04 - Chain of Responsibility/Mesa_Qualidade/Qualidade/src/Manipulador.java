public abstract class Manipulador
{
    protected Manipulador manipuladorSeguinte;
    // ----------------------------------------
    public Manipulador getSeguinte() {
        return this.manipuladorSeguinte;
    }
    // ----------------------------------------
    public void setSeguinte(Manipulador m) {
        this.manipuladorSeguinte = m;
    }
    // ----------------------------------------
    public abstract void verificar(Artigo arti);
}