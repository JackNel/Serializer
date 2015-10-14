/**
 * Created by Jack on 10/14/15.
 */
public class Movies {
    static Movie movie;

    public static void main(String[] args) {
        System.out.println("Welcome to the movie catalog.");
        System.out.println("Let's begin!");
        movie = new Movie();
        movie.chooseTitle();
    }
}
