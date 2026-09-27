package javaconsumindoAPIgravandoarquivoselidandocomerros.atividadefinal.atividadefinalcurso.atividadefinalcurso;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestCEP {

    public static HttpResponse<String> sendRequest(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            return client.send(request, HttpResponse.BodyHandlers.ofString());


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}



