package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Pedido;

public class PedidoTeste {

	public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido("./src/Pedido.txt", 0, "2");
        System.out.println("---> Pedido [\nidPedido=" + pedido + "\n]");
	}

}
