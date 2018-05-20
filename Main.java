
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.lang.InterruptedException;

public class Main {

    public static void main(String[] args) {
        String URL = "https://api.telegram.org/bot491323662:AAG3oSakEcfpARS3_E2gY0VSHcCB-_hBa-4/sendMessage?chat_id=-239664461&text=Кіньте дз";

        while (true){
            Date date = new Date();
            System.out.println(date.getHours());
            System.out.println(date.getMinutes());
            if (date.getHours()==15 && date.getMinutes()==15){
              System.out.println("in");
                try {
                    java.net.URL url = new URL(URL);
                    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                    conn.setRequestMethod("GET");
                    conn.setConnectTimeout(250);
                    conn.getInputStream();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try{
              Thread.sleep(60000);
            }catch (InterruptedException e) {
              e.printStackTrace();
            }
        }

    }
}
