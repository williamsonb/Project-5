public class TvShows extends ServiceCommunicator {

    /*public static void main(String[] args) {
        System.out.println(new TvShows("Friends").get());
    }*/

    public TvShows(String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

}