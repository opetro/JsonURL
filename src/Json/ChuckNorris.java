package Json;

import java.net.MalformedURLException;
import java.net.URL;

public class ChuckNorris {
    public static void main(String[] args) {
        try {
            URL url= new URL("https://api.chucknorris.io/jokes/random");
        } catch (MalformedURLException e) {
            System.out.println("URL has a problem!");
        }
    }
}
