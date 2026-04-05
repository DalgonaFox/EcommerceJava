package br.edu.ifsp.xyz.leitor.classe;

import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
	private int idPedido;
	private Cliente cliente;
    private Vendedor vendedor;
    private String dataPedido;
	private Item[] itens;
    private double valorTotal;
    private int qtItens;
    private static ArrayList<String> pedidos;

	public Pedido(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		pedidos = leitor.conteudo();
		String pedido = pedidos.get(0);
		String[] campos = pedido.split(";");
        this.idPedido = Integer.parseInt(campos[0]);
        String idCliente = campos[1];
		String idVendedor = campos[2];
        this.cliente = new Cliente("./src/Cliente.txt", 0, idCliente);
		this.vendedor = new Vendedor("./src/Vendedor.txt", 0, idVendedor);
        this.dataPedido = campos[3];

        leitor = new Leitor("./src/Item.txt", 1, this.idPedido+"");
        
        ArrayList<String> itens = leitor.conteudo();
		qtItens = itens.size();
		this.itens = new Item[qtItens];

		int indice = 0;
		for (String item : itens) {
			campos = item.split(";");
			int idItem = Integer.parseInt(campos[0]);
			int idPedido = Integer.parseInt(campos[1]);
			String idProduto = campos[2];
    		Produto produto = new Produto("./src/Produto.txt", 0, idProduto);
			int qtVenda = Integer.parseInt(campos[3]);
            valorTotal += produto.getPreco();
			this.itens[indice] = new Item(idItem,idPedido,produto, qtVenda);
			indice++;
		}
    }

    @Override
    public String toString() {
        return idPedido + ";\n" + cliente + ";\n" + vendedor + ";\ndataPedido=" + dataPedido + ";\n"
                + Arrays.toString(itens) + ";\nqtItens=" + qtItens + ";\nvalorTotal=" + valorTotal;
    }

    public int getIdVendedor() {
        return vendedor.getIdVendedor();
    }

    public String getNomeVendedor() {
        return vendedor.getNome();
    }

    public Produto getProduto(int indice) {
        return itens[indice].getProduto();
    }

    public int getQtItens() {
        return qtItens;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public String getDataCompra() {
        return dataPedido;
    }
}
