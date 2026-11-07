package main;

import java.util.Locale;

public class MediaItem {
    private long id;
    private long userId;
    private MediaType type;
    protected String name;
    protected String releaseDate;
    protected String director;


    public MediaItem() {}
     public void setType (MediaType type) {
         this.type = type;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void displayItem(){
        System.out.println("The " + type.toString().toLowerCase() + " you entered: \n"+ name +"\nThe release date is: \n" + releaseDate);
    }
}
