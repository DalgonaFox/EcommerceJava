package br.edu.ifsp.xyz.leitor.classe;

import java.util.ArrayList;

public class Produto {
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
        this.categoria = new Categoria("./src/Categoria.txt", 0, idCategoria);
        this.preco = Double.parseDouble(campos[3]);
 	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricaoProduto=" + descricaoProduto + ", idCategoria=" + categoria + ", preco=R$" + String.format("%.2f", preco) + "]";
	}

    public Double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {return categoria;}

    public String getNome() {return descricaoProduto;}
}
