public class Music extends ServiceCommunicator {

    /*public static void main(String[] args) {
        System.out.println(new Music("Ribbon-in-the-Sky").get());
        System.out.println(new Music("Beyonce").get());
    }*/

    public Music(String music) {
        super("https://itunes.apple.com/search?term="
        + music + "&limit=1");
    }
}

