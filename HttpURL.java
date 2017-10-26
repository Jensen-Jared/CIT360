package HTTPURLConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by SFerrel on 7/6/2017.
 */
public class HttpURL {
    public static void main (String[] args) {

        String URLInfo = getURLHTMLinfo("http://www.google.com/");

        System.out.println(URLInfo); // this prints all the info to the webpage's HTML
    }

    private static String getURLHTMLinfo(String URLString) {

        StringBuilder content = new StringBuilder();

            try {
            URL url = new URL(URLString);
            URLConnection urlConnection = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String lineReader;

            while((lineReader = bufferedReader.readLine()) != null) {
                content.append(lineReader + "\n");
            }
            bufferedReader.close();
            } catch(Exception e)
            {
            e.printStackTrace();
            }
        return content.toString();
    }
}