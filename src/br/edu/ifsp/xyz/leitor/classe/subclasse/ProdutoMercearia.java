package br.edu.ifsp.xyz.leitor.classe.subclasse;

import br.edu.ifsp.xyz.leitor.classe.Leitor;
import br.edu.ifsp.xyz.leitor.classe.Produto;

import java.util.ArrayList;
import java.util.Date;

public class ProdutoMercearia extends Produto {
    private String dataValidade;
    public ProdutoMercearia(String caminho, int chave, String valorChave) throws Exception {
        super(caminho, chave, valorChave);
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> pedidos = leitor.conteudo();
        String produto = pedidos.get(0);
        String[] campos = produto.split(";");
        this.dataValidade = campos[4];
    }

    @Override
    public Float taxaImposto() {
        return 5.33F;
    }

    @Override
    public Double calcularImpostos() {
        return getPreco()*(taxaImposto()/100);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String imprimir() {
        String impressao = super.imprimir();
        return impressao + "   | "
                + getDataValidade() + "\n";
    }
}
