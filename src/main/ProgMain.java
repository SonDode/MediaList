package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgMain {
    public static void main(String[] args) {
        displayBanner();
        Scanner sc = new Scanner(System.in);
        ArrayList<MediaItem> mediaList = new ArrayList<>();
        MediaItem media =  createMediaItem(sc);
        mediaList.add(media);
        media.displayItem();
        sc.close();
    }//end void main


    public static MediaItem createMediaItem(Scanner sc) {
        MediaType type = null;
        boolean contor = true;

        MediaItem media = null;
        while (contor) {
            System.out.println("Enter media type(MOVIE, ANIME, TVSHOW, CARTOON): ");

            try {
                type = MediaType.valueOf(sc.nextLine().trim().toUpperCase());
                contor = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid type! Try again: ");
            }

            switch (type) {
                case ANIME -> {
                    media = new Anime();
                    break;
                }
                case MOVIE -> {
                    media = new Movie();
                    break;
                }
                case TVSHOW -> {
                    media = new TvShow();
                    break;
                }
                case CARTOON -> {
                    media = new Cartoon();
                    break;
                }
                default -> throw new IllegalArgumentException("Invalid type!");
            }

            media.setType(type);

            System.out.println("Enter your " + type.toString().toLowerCase() + ": ");
            media.setName(sc.nextLine());

            System.out.println("Enter the release year: ");
            media.setYear(Integer.parseInt(sc.nextLine()));


        }
        return media;
    }//end createItem func


    public static void displayBanner() {
        System.out.println("""
    
    __  __          _ _         _     _     _
    |  \\/  | ___  __| (_) __ _  | |   (_)___| |_
    | |\\/| |/ _ \\/ _` | |/ _` | | |   | / __| __|
    | |  | |  __/ (_| | | (_| | | |___| \\__ \\ |_
    |_|  |_|\\___|\\__,_|_|\\__,_| |_____|_|___/\\__|
    
    +------------------------------------------------------------+
    |                                                            |
    |                  YOUR PERSONAL MEDIA HUB                   |
    |                                                            |
    |              MOVIES  |  ANIME  |  TV SHOWS                  |
    |                         CARTOONS                           |
    |                                                            |
    +------------------------------------------------------------+
    |                                                            |
    |                  WELCOME TO MEDIALIST!                     |
    |                                                            |
    |          Keep track of everything you watch.               |
    |       Organize your favorites. Build your collection.      |
    |                                                            |
    |             YOUR COLLECTION. YOUR STORY.                   |
    |                                                            |
    +------------------------------------------------------------+
    
    """);
    }//end displayfunction
}
