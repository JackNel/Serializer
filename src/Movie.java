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
        System.out.println("What is the title of the movie you wish to add to catalog?");
        Scanner scanner = new Scanner(System.in);
        String newTitle = scanner.nextLine();
        title = newTitle;
    }

    void chooseDirector() {
        System.out.println(String.format("OK, the title of the movie is %s. Next, enter the name of the director of %s.", title, title));
        Scanner scanner = new Scanner(System.in);
        String newDirector = scanner.nextLine();
        director = newDirector;
    }

    void chooseCountry() {
        System.out.println(String.format("So, %s was directed by %s.  What is the country of origin?", title, director));
        Scanner scanner = new Scanner(System.in);
        String newCountry = scanner.nextLine();
        country = newCountry;
    }

    void chooseYear() {
        System.out.println(String.format("%s was directed by %s and was originally released in %s.  What year was %s made?", title, director, country, title));
        Scanner scanner = new Scanner(System.in);
        String newYear = scanner.nextLine();
        int newYearNum = Integer.valueOf(newYear);
        year = newYearNum;
    }

    void chooseMinutes() {
        System.out.println(String.format("%s, directed by %s, was released in %s in the year %d.  How long (in minutes) is %s?", title, director, country, year, title));
        Scanner scanner = new Scanner(System.in);
        String newMin = scanner.nextLine();
        int newMinNum = Integer.valueOf(newMin);
        minutes = newMinNum;
    }

    void askQuestions() {
        chooseTitle() ;
        chooseDirector();
        chooseCountry();
        chooseYear();
        chooseMinutes();
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getMinutes() {
        return minutes;
    }
}//class Movie