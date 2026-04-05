package br.edu.ifsp.xyz.leitor.classe;

import java.util.ArrayList;

public class Extrato {
    private static Double comissao;
    private static String nomeVendedor;
    private static int idPedido;
    private static ArrayList<String> produtos;
    private static int qtVendidos;
    private static Double valorTotal;
    private static String dataCompra;

    public Extrato(Pedido pedido) {
        comissao = (double) 0;
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
            comissao += ((percentualComissao/100)*precoProduto);
            produtos.add(produto.getNome());
        }
    }

@Override
    public String toString() {
        return "Vendedor: " + nomeVendedor + "\nPedido Nº" + idPedido + "\nData da Compra: " + dataCompra
                + "\nProdutos Vendidos: " + produtos + "\nQuantidade de Produtos Vendidos: "
                + qtVendidos + "\n\nValor total da compra: R$" + String.format("%.2f", valorTotal)
                + "\nComissão do vendedor: R$" + String.format("%.2f", comissao);
    }

    public Double getComissao() {
        return comissao;
    }


    //calcular comissão -> preço prod 1 x percentual categoria 1 + ...

    //Extrato
    //Vendedor: maria madalena
    //pedido num
    //lista dos produtos vendidos
    //quantidade de produtos vendidos
    //comissao do vendedor: abc


//    codigo antigo
//    for(int i =0; i < pedidos.size(); i++) {
//        String pedido = pedidos.get(i);
//        String[] campos = pedido.split(";");
//        //comissao += Float.parseFloat(campos[2]);
//    }
//        return comissao;
}
