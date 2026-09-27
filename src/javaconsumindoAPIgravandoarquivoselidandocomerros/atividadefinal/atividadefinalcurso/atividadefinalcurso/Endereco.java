package javaconsumindoAPIgravandoarquivoselidandocomerros.atividadefinal.atividadefinalcurso.atividadefinalcurso;

import java.io.Serializable;

public record Endereco(String cep, String logradouro, String complemento,
                       String bairro, String localidade, String uf, String estado,
                       String regiao, String ibge, String ddd , String siafi) implements Serializable {
}
