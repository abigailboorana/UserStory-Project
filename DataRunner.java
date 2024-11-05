import java.util.Scanner;

public class DataRunner {
    public static void main(String[] args) {
        UserStory musicLibrary = new UserStory("Name.txt", "genre.txt", "popularity.txt", "duration.txt");
        System.out.println(musicLibrary);

        String mostPopularGenre = musicLibrary.findMostPopularGenre();
        System.out.println("The genre with the most popular songs is: " + mostPopularGenre);
    }
}
