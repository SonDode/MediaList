package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgMain {
    public static void main(String[] args) {
        System.out.println("This is MediaList, your CLI logger for your favorite movies, shows and anime!!");
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

            System.out.println("Enter the release date: ");
            media.setReleaseDate(sc.nextLine());


        }
        return media;
    }//end createItem func
}
