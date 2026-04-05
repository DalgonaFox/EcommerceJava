package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Cliente;

public class ClienteTeste {

	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente("./src/Cliente.txt", 0, "2");
		System.out.println("--->" + cliente);
	}

}
