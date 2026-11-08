# MediaList

Using Java with JDK 27 and SQLite as my database
I will start writing the README.md once I start to develop some functionalities


## The main idea of the app:
The main idea of the app is that you will first decide what type of media you want to add to your mediaList, if it's an anime or a tv show or what you decide. After that, you write the name of your media, and the app will automatically find the shows from the APIs and map the name to the shows that have the same name, and when you find the show that you want to add to the database, you will add it.

I have yet to think about how will the CLI interface look, and how you will add your media to the list, but we'll see!

## What I've Implemented So Far
### First day
- Created the main `MediaItem` class, which serves as the base class for all media items.
- Added child classes for each media type: `Anime`, `Movie`, `TvShow`, and `Cartoon`.
- Implemented the logic for creating each media object based on its selected type (Anime, Movie, TV Show, or Cartoon) and collecting the user's input through the console.
- Stored all created media objects in an `ArrayList` called `mediaList`, which keeps track of the user's media entries.

### Second day
- Made the connection with the SQLite database (`sample.db`, `DatabaseConnection`) and created the table which will store the data of the media.
- Added new functionalities, like: `status`, `rating`, `director`, `description`, which right are just database fields/columns, and will be added in the future.



### What I'll do next (this bullet is always for the next time I'm working on the project, so I don't forget what to do!!)

-implement the APIs so that I can get the data of the movies and map the name given by the user with the database.

