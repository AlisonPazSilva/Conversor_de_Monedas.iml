import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateJsonParser {
    public static void main(String[] args) {
        String apiKey = "30473298a0451e861107e1cf"; // Tu clave de API
        String baseCurrency = "USD"; // Moneda base
        String urlString = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency;

        try {
            // Crear instancia de HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Crear solicitud HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .GET()
                    .build();

            // Enviar solicitud y obtener respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertir la respuesta JSON en un objeto JsonObject
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            // Extraer tasas de cambio específicas
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
            double tasaUsdToEur = conversionRates.get("EUR").getAsDouble();
            double tasaUsdToClp = conversionRates.get("CLP").getAsDouble();

            // Imprimir tasas de cambio
            System.out.println("Tasa de cambio USD a EUR: " + tasaUsdToEur);
            System.out.println("Tasa de cambio USD a CLP: " + tasaUsdToClp);
        } catch (Exception e) {
            System.out.println("Error al obtener tasas de cambio: " + e.getMessage());
        }
    }
}