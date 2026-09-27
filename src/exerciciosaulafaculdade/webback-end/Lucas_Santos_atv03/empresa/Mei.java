package exerciciosaulafaculdade.webback_end.Lucas_Santos_atv03.empresa;

import exerciciosaulafaculdade.webback_end.Lucas_Santos_atv03.pessoa.Contador;
import exerciciosaulafaculdade.webback_end.Lucas_Santos_atv03.pessoa.Socio;

import java.util.List;

public class Mei extends Empresa {

    public Mei(String nome, String cnpj, String end, long faturamento, List<Socio> socios, Contador contador) {
        super(nome, cnpj, end, faturamento, socios, contador);

    }

    @Override
    public long pagamentoImposto() {
        return 8700;
    }

}
