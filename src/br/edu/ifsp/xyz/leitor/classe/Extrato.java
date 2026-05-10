package br.edu.ifsp.xyz.leitor.classe;

import java.util.ArrayList;

public class Extrato {
    private static Double comissaoTotal;
    private static String nomeVendedor;
    private static int idPedido;
    private static ArrayList<String> produtos;
    private static int qtVendidos;
    private static Double valorTotal;
    private static String dataCompra;

    public Extrato(Pedido pedido) {
        comissaoTotal = (double) 0;
        nomeVendedor = pedido.getNomeVendedor();
        idPedido = pedido.getIdPedido();
        qtVendidos = pedido.getQtItens();
        produtos = new ArrayList<>();
        valorTotal = pedido.getValorTotal();
        dataCompra = pedido.getDataCompra();

        for(int i =0; i<pedido.getQtItens(); i++) {
            Produto produto = pedido.getProduto(i);
            Double precoProduto = produto.getPreco();
            Categoria categoria = produto.getCategoria();
            Double percentualComissao = categoria.getPercentualComissao();
            comissaoTotal += ((percentualComissao/100)*precoProduto);
            produtos.add(String.valueOf(produto));
        }
    }

    @Override
    public String toString() {
        return "Vendedor: " + nomeVendedor + "\nPedido Nº" + idPedido + "\nData da Compra: " + dataCompra
                + "\n\nProdutos Vendidos: \nidProduto | nomeProduto | nomeCategoria | preco  | taxaImposto | valorImposto | percentualComissao | comissao | dataValidade/mesesGarantia\n"
                + printProdutos() + "\nQuantidade de Produtos Vendidos: "
                + qtVendidos + "\n\nValor total da compra: R$" + String.format("%.2f", valorTotal)
                + "\nComissão do vendedor: R$" + String.format("%.2f", comissaoTotal);

    }

    public Double getComissao() {
        return comissaoTotal;
    }

    public String printProdutos() {
        String resultado = "";

        for (int i = 0; i < produtos.size(); i++) {
            resultado += produtos.get(i);
        }

        return resultado;
    }
}
