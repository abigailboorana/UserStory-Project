public class Song {
    private String name;        // Name of the song
    private String genre;       // Genre of the song
    private int popularity;     // Popularity score of the song
    private int duration;       // Duration of the song in milliseconds

    // Sets name, genre, popularity, and duration to the specified values
    public Song(String name, String genre, int popularity, int duration) {
        this.name = name;
        this.genre = genre;
        this.popularity = popularity;
        this.duration = duration;
    }

    // Returns the name of the song
    public String getName() {
        return name;
    }

    // Returns the genre of the song
    public String getGenre() {
        return genre;
    }

    // Returns the popularity of the song
    public int getPopularity() {
        return popularity;
    }

    // Returns the duration of the song
    public int getDuration() {
        return duration;
    }

    // Returns a String containing the song's information
    public String toString() {
        return name + " (Genre: " + genre + ", Popularity: " + popularity + ", Duration: " + duration + " ms)";
    }
}
