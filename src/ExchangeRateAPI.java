import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateAPI {
    public static void main(String[] args) {
        String apiKey = "30473298a0451e861107e1cf"; // Tu clave de API
        String baseCurrency = "USD"; // Moneda base
        String urlString = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency;

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Respuesta JSON: " + response.toString());
        } catch (Exception e) {
            System.out.println("Error al obtener tasas de cambio: " + e.getMessage());
        }
    }
}
