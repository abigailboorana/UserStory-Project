import java.util.Scanner;

public class UserStory {
    private Song[] songs; // 1D array of song objects

    // Reads the data from the files to initialize songs
    public UserStory(String nameFile, String genreFile, String popularityFile, String durationFile) {
        songs = createSongs(nameFile, genreFile, popularityFile, durationFile);
    }

    // Returns a 1D array of song objects using the data from the files
    public Song[] createSongs(String nameFile, String genreFile, String popularityFile, String durationFile) {
        String[] nameData = FileReader.toStringArray(nameFile);
        String[] genreData = FileReader.toStringArray(genreFile);
        int[] popularityData = FileReader.toIntArray(popularityFile);
        int[] durationData = FileReader.toIntArray(durationFile);

        Song[] tempSongs = new Song[nameData.length];

        for (int index = 0; index < tempSongs.length; index++) {
            tempSongs[index] = new Song(nameData[index], genreData[index], popularityData[index], durationData[index]);
        }

        return tempSongs;
    }

    // Finds the genre with the most popular songs
    public String findMostPopularGenre() {
        int maxPopularity = 0;
        String mostPopularGenre = "";

        for (Song song : songs) {
            if (song.getPopularity() > maxPopularity) {
                maxPopularity = song.getPopularity();
                mostPopularGenre = song.getGenre();
            }
        }

        return mostPopularGenre;
    }

    // Returns a String containing each song's information
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Song song : songs) {
            result.append(song).append("\n");
        }

        return result.toString();
    }
}
