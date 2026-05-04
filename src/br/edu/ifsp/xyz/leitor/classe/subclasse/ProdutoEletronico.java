package br.edu.ifsp.xyz.leitor.classe.subclasse;

import br.edu.ifsp.xyz.leitor.classe.Produto;

public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String caminho, int chave, String valorChave) throws Exception {
        super(caminho, chave, valorChave);
    }

    @Override
    public Float taxaImposto() {
        return 10.5F;
    }

    @Override
    public Double calcularImpostos() {
        return getPreco()*(taxaImposto()/100);
    }
}
