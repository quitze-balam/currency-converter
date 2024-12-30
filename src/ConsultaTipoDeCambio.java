import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTipoDeCambio {

    public Cambio convertir (String monedaLocal, String monedaForanea, double monto){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2d66d0803569bf6ef1977b9f/pair/"+monedaLocal+"/"+monedaForanea+"/"+monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);
        } catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }catch (Exception e){
            throw new RuntimeException("Ocurio un error, intentelo nuevamente.");
        }
    }
}
