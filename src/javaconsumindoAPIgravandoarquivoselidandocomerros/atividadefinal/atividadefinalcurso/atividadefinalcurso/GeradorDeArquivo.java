package javaconsumindoAPIgravandoarquivoselidandocomerros.atividadefinal.atividadefinalcurso.atividadefinalcurso;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {


    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void geraArquivo(Endereco endereco) throws IOException {

        FileWriter escrita = new FileWriter("src/javaconsumindoAPIgravandoarquivoselidandocomerros/atividadefinal/atividadefinalcurso/atividadefinalcurso/" + endereco.cep() + ".json");

        escrita.write(gson.toJson(endereco));
        escrita.close();


    }

}
