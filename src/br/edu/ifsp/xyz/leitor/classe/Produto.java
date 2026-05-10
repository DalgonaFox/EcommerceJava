package br.edu.ifsp.xyz.leitor.classe;

import br.edu.ifsp.xyz.leitor.interfaces.IContabil;
import br.edu.ifsp.xyz.leitor.interfaces.IImprimir;

import java.util.ArrayList;

public abstract class Produto implements IContabil, IImprimir {
    private int idProduto;
    private String descricaoProduto;
    private Categoria categoria;
    private double preco;

    public Produto(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> pedidos = leitor.conteudo();
        String produto = pedidos.get(0);
        String[] campos = produto.split(";");
        this.idProduto = Integer.parseInt(campos[0]);
        this.descricaoProduto = campos[1];
        String idCategoria = campos[2];
        this.categoria = new Categoria("src/Categoria.txt", 0, idCategoria);
        this.preco = Double.parseDouble(campos[3]);
    }

    @Override
    public String toString() {
        return imprimir();
    }

    @Override
    public String imprimir() {
        return idProduto + "         | "
                + descricaoProduto + "      | "
                + categoria.getNomeCategoria() + "    | R$"
                + String.format("%.2f", preco) + " | "
                + taxaImposto() + "%       | R$"
                + String.format("%.2f", calcularImpostos()) + "       | "
                + categoria.getPercentualComissao() + "%              | R$"
                + String.format("%.2f", calcularComissao());
    }

    public int getIdProduto() {return idProduto;}

    public Double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {return categoria;}

    public String getNome() {return descricaoProduto;}

    public abstract Float taxaImposto();

    @Override
    public abstract Double calcularImpostos();

    @Override
    public Double calcularComissao() {
        return (categoria.getPercentualComissao() / 100) * getPreco();
    }
}
