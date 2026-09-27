package javaconsumindoAPIgravandoarquivoselidandocomerros.atividadefinal.atividadefinalcurso.atividadefinalcurso;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static java.net.http.HttpClient.newHttpClient;

public class atividadefinal {

    static void main() throws IOException {

        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        ConsultaCEP consultaCEP = new ConsultaCEP();
        System.out.println(consultaCEP.retornaCEP("49142232"));
        geradorDeArquivo.geraArquivo(consultaCEP.retornaCEP("49142232"));

    }
//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        Scanner sc = new Scanner(System.in);
//
//        String cep = "";
//
//        while (true) {
//            System.out.println("Qual cep consultar? ");
//            cep = sc.nextLine().replace(" ", "") ;
//
//            if (cep.equalsIgnoreCase("sair")) break;
//
//            String url = "https://viacep.com.br/ws/" + cep + "/json/";
//
//            try {
//                HttpClient client = HttpClient.newHttpClient();
//                HttpRequest request = HttpRequest.newBuilder()
//                        .uri(URI.create(url))
//                        .GET()
//                        .build();
//
//                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//
//                Endereco endereco = gson.fromJson(response.body(), Endereco.class);
//
//                System.out.println(gson.toJson(endereco));
//
//                System.out.println();
//            } catch (IOException | InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//
//        sc.close();
//    }

}
