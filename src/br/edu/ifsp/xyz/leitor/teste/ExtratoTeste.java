package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Extrato;
import br.edu.ifsp.xyz.leitor.classe.Pedido;

public class ExtratoTeste {

    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido("src/Pedido.txt", 0, "4");
        Extrato comissao = new Extrato(pedido);

        System.out.println("\n--------------Extrato--------------\n\n" + comissao);
    }


//    ArrayList<String> pedidos = new ArrayList<>();
//    int idVendedor = 2;
//
//        for(int i = 1; i <= 6; i++) {
//        Pedido pedido = new Pedido("../src/Pedido.txt", 0, String.valueOf(i));
//        if (pedido.getIdVendedor() == idVendedor) pedidos.add(String.valueOf(pedido));
//    }
//
//    float comissao = CalcularComissao(pedidos);
//        System.out.println("Comissão: " + comissao);

}
