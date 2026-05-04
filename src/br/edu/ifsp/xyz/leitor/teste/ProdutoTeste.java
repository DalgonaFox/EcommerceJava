package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Produto;
import br.edu.ifsp.xyz.leitor.classe.subclasse.ProdutoEletronico;

public class ProdutoTeste {

	public static void main(String[] args) throws Exception {
		Produto produto = new ProdutoEletronico("src/Produto.txt", 2, "1");
		System.out.println("--->" + produto);
	}

}
