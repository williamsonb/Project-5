import java.util.Scanner;

public class MyApp {
    public static void main(String[] argv) {

//TODO: account for errors with a prompt
//TODO: implement JSON for cleaner output

        System.out.println("Would you like to complete a search for info by zip code, tv show, "
                + "song artist or song title ?\n" + "\tTo search by: \n"
                + "\tZip code enter '1'\n"
                + "\tTelevision show enter '2'\n"
                + "\tSong artist or song title enter '3'\n"
                + "\tTo exit program enter 'Q'.\n");

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Command: ");
            String cmd = input.next();

            if (cmd.equals("1")) {

                System.out.println("Please enter a zip code: ");
                String zipCode = input.next();
                System.out.println(new ZipCode(zipCode).get());

            } else if (cmd.equals("2")) {

                //TODO: Automatically insert hyphen in between words for user
                System.out.println("Please enter a tv show title (with hyphens between words if title is longer than a single word): ");
                String tvShow = input.next();
                System.out.println(new TvShows(tvShow).get());

            } else if (cmd.equals("3")){

                //TODO: Automatically insert hyphen in between words for user
                System.out.println("Please enter a song title or artist name " +
                        "(with hyphens between words if title is longer than a single word): ");
                String songArtistOrTitle  = input.next();
                System.out.println(new Music(songArtistOrTitle).get());

            } else if (cmd.equalsIgnoreCase("Q")) { //string match

                break; //terminates program

            } else
                //Instructs user to enter a valid command for any entry other than listed commands
                System.out.println("Invalid entry. Please try again.");

        }
    }
}