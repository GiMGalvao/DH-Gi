public class main {
    public static void main(String[] args) {
        SerieProxy proxy = new SerieProxy(new Serie());
        try{
            System.out.println(proxy.getSerie("Supernatural"));
            System.out.println(proxy.getSerie("Star Trek: Picard"));
            System.out.println(proxy.getSerie("Arrow"));
            System.out.println(proxy.getSerie("Star Trek: Picard"));
            System.out.println(proxy.getSerie("Star Trek"));
            System.out.println(proxy.getSerie("Lucifer"));
            System.out.println(proxy.getSerie("Arrow"));
            System.out.println(proxy.getSerie("Supergirl"));
            System.out.println(proxy.getSerie("Terra"));
            System.out.println(proxy.getSerie("Lua"));

        }
        catch (SerieNaoHabilitadaException e){
            System.out.println(e);
        }
    }
}
