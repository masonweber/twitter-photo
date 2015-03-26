/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterphoto;

// google http client imports
import com.google.api.client.http.*;
import com.google.api.client.auth.oauth2.*;
import com.google.api.client.http.javanet.DefaultConnectionFactory;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Mason
 */
public class TwitterPhoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // args[0] contains filename

        // HTTP Client
        //HttpTransport ht = new HttpTransport();
        BasicAuthentication step1 = new BasicAuthentication("test", "yes");
        DefaultConnectionFactory dcf = new DefaultConnectionFactory();
        try {
            //HttpURLConnection conn = new HttpURLConnection();
            URL endpoint = new URL("https://api.twitter.com/1.1/statuses/user_timeline.json");
            System.out.println("1");
            HttpURLConnection conn = dcf.openConnection(endpoint);
            System.out.println("2");
            conn.setRequestMethod("GET");
            String basicAuth = "";
            conn.setRequestProperty("Authorization", basicAuth);
            System.out.println(conn);
            conn.addRequestProperty("screen_name", "twitterapi");
            conn.addRequestProperty("count", "2");
            //conn.addRequestProperty("oauth_consumer_key", "\"TmPuYr9ugMbE4A19Da70A7Btp\"");
            //conn.addRequestProperty("oauth_nonce", "\"0892064862ada712a0cf8a795cef371f\"");
            //conn.addRequestProperty("oauth_signature", "\"%2BkJtcKr7CS0CtqcQD5GLzqNY0nU%3D\"");
            //conn.addRequestProperty("oauth_signature_method", "\"HMAC-SHA1\"");
            //conn.addRequestProperty("oauth_timestamp", "\"1427342024\"");
            //conn.addRequestProperty("oauth_token", "\"517026482-2uF0z4xiWMKWIC3GBkbPfrTXk1SzWxcfk0GtdtjY\"");
            //conn.addRequestProperty("oauth_version", "\"1.0\"");
            conn.connect();
            System.out.println("3");
            InputStream feedback = conn.getInputStream();
            
            System.out.println(feedback);
            System.out.println("4");
            //HttpRequest req = new HttpRequest();
            //GenericUrl url = new GenericUrl(endpoint);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //System.out.println(e.);
        }

        // OAuth
        // GET timeline
    }

}
