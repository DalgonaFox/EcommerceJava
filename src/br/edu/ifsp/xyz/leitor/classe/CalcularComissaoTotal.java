package br.edu.ifsp.xyz.leitor.classe;

public class CalcularComissaoTotal {
    private static Double comissaoTotal;
    private static String nomeVendedor;
    public static String CalcularComissaoTotal(Vendedor vendedor) throws Exception {

        comissaoTotal = (double) 0;
        for(int i = 1; i <= 6; i++) {
            Pedido pedido = new Pedido("./src/Pedido.txt", 0, String.valueOf(i));
            if (pedido.getIdVendedor()==vendedor.getIdVendedor()) {
                Extrato extrato = new Extrato(pedido);
                comissaoTotal += extrato.getComissao();
            }
        }
        nomeVendedor = vendedor.getNome();

        return ExtratoTotal();
    }

    public static String ExtratoTotal() {
        return "Vendedor: " + nomeVendedor + "\nComissão Total: R$" + String.format("%.2f", comissaoTotal);
    }
}
