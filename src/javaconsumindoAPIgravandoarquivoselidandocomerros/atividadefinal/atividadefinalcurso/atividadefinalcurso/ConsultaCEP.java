package javaconsumindoAPIgravandoarquivoselidandocomerros.atividadefinal.atividadefinalcurso.atividadefinalcurso;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaCEP {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public Endereco retornaCEP(String cep) {



        return gson.fromJson(RequestCEP.sendRequest(cep).body(), Endereco.class);

    };

}
