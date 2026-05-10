package br.edu.ifsp.xyz.leitor.classe.subclasse;

import br.edu.ifsp.xyz.leitor.classe.Leitor;
import br.edu.ifsp.xyz.leitor.classe.Produto;

import java.util.ArrayList;

public class ProdutoEletronico extends Produto {
    private int mesesGarantia;
    public ProdutoEletronico(String caminho, int chave, String valorChave) throws Exception {
        super(caminho, chave, valorChave);
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> pedidos = leitor.conteudo();
        String produto = pedidos.get(0);
        String[] campos = produto.split(";");
        this.mesesGarantia = Integer.parseInt(campos[4]);
    }

    @Override
    public Float taxaImposto() {
        return 10.5F;
    }

    @Override
    public Double calcularImpostos() {
        return getPreco()*(taxaImposto()/100);
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    @Override
    public String imprimir() {
        String impressao = super.imprimir();
        return impressao + "   | "
                + getMesesGarantia() + " meses \n";
    }
}
