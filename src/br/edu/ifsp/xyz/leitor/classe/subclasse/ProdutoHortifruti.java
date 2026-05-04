package br.edu.ifsp.xyz.leitor.classe.subclasse;

import br.edu.ifsp.xyz.leitor.classe.Produto;

public class ProdutoHortifruti extends Produto {
    public ProdutoHortifruti(String caminho, int chave, String valorChave) throws Exception {
        super(caminho, chave, valorChave);
    }

    @Override
    public Float taxaImposto() {
        return 15.0F;
    }

    @Override
    public Double calcularImpostos() {
        return getPreco()*(taxaImposto()/100);
    }
}
