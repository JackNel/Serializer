import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;

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
        movie.chooseDirector();
        movie.chooseCountry();
        movie.chooseYear();
        movie.chooseMinutes();

        saveGame();


    }//main method

    static void saveGame() {
        File f = new File("save.json");
        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(movie);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(contentToSave);
            fw.close();
        } catch (Exception e) {

        }
    }
}//class Movies


