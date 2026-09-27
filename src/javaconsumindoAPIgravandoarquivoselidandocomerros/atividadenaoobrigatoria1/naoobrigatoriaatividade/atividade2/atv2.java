package javaconsumindoAPIgravandoarquivoselidandocomerros.atividadenaoobrigatoria1.naoobrigatoriaatividade.atividade2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class atv2 {

    static void main(String[] args) throws IOException, InterruptedException {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Cript deseja converter: ");
        String criptConversao = "https://api.coingecko.com/api/v3/simple/price?ids=" +
                scanner.nextLine() + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(criptConversao)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
