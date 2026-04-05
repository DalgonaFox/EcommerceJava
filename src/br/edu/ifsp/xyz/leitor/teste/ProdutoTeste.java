package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Produto;

public class ProdutoTeste {

	public static void main(String[] args) throws Exception {
		Produto produto = new Produto("./src/Produto.txt", 0, "2");
		System.out.println("--->" + produto);
	}

}
