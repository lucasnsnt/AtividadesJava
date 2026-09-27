package exerciciosaulafaculdade.webback_end.Lucas_Santos_atv03.empresa;

import exerciciosaulafaculdade.webback_end.Lucas_Santos_atv03.pessoa.Socio;

import java.util.List;

public class Simples extends Empresa {

    public Simples(String nome, String cnpj, String end, long faturamento, List<Socio> socios, exerciciosaulafaculdade.webback_end.Lucas_Santos_atv03.pessoa.Contador contador) {
        super(nome, cnpj, end, faturamento, socios, contador);

    }

    @Override
    public long pagamentoImposto() {
        return getFaturamento() * 10 / 100 ;
    }

}
