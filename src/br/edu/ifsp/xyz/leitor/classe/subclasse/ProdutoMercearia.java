package br.edu.ifsp.xyz.leitor.classe.subclasse;

import br.edu.ifsp.xyz.leitor.classe.Produto;

public class ProdutoMercearia extends Produto {
    public ProdutoMercearia(String caminho, int chave, String valorChave) throws Exception {
        super(caminho, chave, valorChave);
    }

    @Override
    public Float taxaImposto() {
        return 5.33F;
    }

    @Override
    public Double calcularImpostos() {
        return getPreco()*(taxaImposto()/100);
    }
}
