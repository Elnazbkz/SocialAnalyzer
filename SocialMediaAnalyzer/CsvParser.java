package SocialMediaAnalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//// Define a class to read the data from the csv file
public class CsvParser {
    private static final String CSV_FILE_NAME = "posts.csv"; // the csv file to load
    private static final String CSV_FILE_PATH = System.getProperty("user.dir") + File.separator + CSV_FILE_NAME; // Define csv file path on the system
    //// Define a method to retreive list of posts from csv file
    public static List<Post> parsePostsFromCsv() throws IOException {
        List<Post> posts = new ArrayList<>(); // degine post as Arraylist
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) { // try catch to get file data and shows message on error
            String line; // define line as string
            br.readLine(); // Skip header row
            while ((line = br.readLine()) != null) { // reading rest of lines
                String[] values = line.split(","); // split values of each line by , and put into array
                int id = Integer.parseInt(values[0].trim()); // get id of post
                String content = values[1].trim();
                String author = values[2].trim();
                int likes = Integer.parseInt(values[3].trim());
                int shares = Integer.parseInt(values[4].trim());
                LocalDateTime dateTime = LocalDateTime.parse(values[5].trim(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); // format date and time
                Post post = new Post(id, content, author, likes, shares, dateTime); // create an instance of post class using constractor
                posts.add(post); // add values to posts list
            }
        }
        return posts;
    }
}