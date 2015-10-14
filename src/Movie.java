import java.util.Scanner;

/**
 * Created by Jack on 10/14/15.
 */
public class Movie {
    public String title;
    public String director;
    public String country;
    public int year;
    public int minutes;

    public Movie() {  // Default constructor

    }

    public Movie(String title, String director, String country, int year, int minutes) { //Class constructor
        this.title = title;
        this.director = director;
        this.country = country;
        this.year = year;
        this.minutes = minutes;
    }

    void chooseTitle() {
        System.out.println("What is the title of the movie you wish to catalog?");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
    }

}//class Movie
