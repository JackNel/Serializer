import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Jack on 10/14/15.
 */
public class Movies {
    static Movie movie;

    public static void main(String[] args) {
        movie = loadEntry();

        System.out.println("Welcome to the movie catalog.");
        System.out.println("Let's begin!");

        if (movie == null) {
        movie = new Movie();
        movie.askQuestions();
        }

        else {
        System.out.println("Current Entry:");
        System.out.println(String.format("Title: %s", movie.title));
        System.out.println(String.format("Director: %s", movie.director));
        System.out.println(String.format("Origin: %s", movie.country));
        System.out.println(String.format("Year: %d", movie.year));
        System.out.println(String.format("Length: %d minutes", movie.minutes));

        while (true) {
            System.out.println("Would you like to make changes to this entry? [y/n]");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (s.equals("y")) {
                System.out.println("Which category would you like to update?  Title, Director, Origin, Year, or Length.");
                Scanner scan = new Scanner(System.in);
                String s1 = scan.nextLine().toLowerCase();
                if (s1.equals("title")) {
                    movie.chooseTitle();
                } else if (s1.equals("director")) {
                    movie.chooseDirector();
                } else if (s1.equals("origin")) {
                    movie.chooseCountry();
                } else if (s1.equals("year")) {
                    movie.chooseYear();
                } else if (s1.equals("length")) {
                    movie.chooseMinutes();
                }
            } else {
                break;
            }
        }//while loop
        }

        saveEntry();
        System.out.println("Entry Saved!");
    }//main method

    static void saveEntry() {
        File f = new File("save.json");
        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(movie);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(contentToSave);
            fw.close();
        } catch (Exception e) {
            System.out.println("Save Failed!");
        }
    }//static method save entry

    static Movie loadEntry() {
        try {
            File f = new File("save.json");
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char[] contents = new char[fileSize];
            fr.read(contents);
            String fileContents = new String(contents);
            JsonParser parser = new JsonParser();
            return parser.parse(fileContents, Movie.class);
        } catch (Exception e) {
            System.out.println("Parse failed or File not found.");
            return null;
        }
    }//static method load entry
}//class Movies


