package br.edu.ifsp.xyz.leitor.classe;

public class CalcularComissaoTotal {
    private static double comissaoTotal;
    private static String extratos;
    public static String CalcularComissaoTotal(Vendedor vendedor) throws Exception {

        extratos = "";
        comissaoTotal = 0;
        for(int i = 1; i <= 6; i++) {
            Pedido pedido = new Pedido("src/Pedido.txt", 0, String.valueOf(i));
            if (pedido.getIdVendedor()==vendedor.getIdVendedor()) {
                Extrato extrato = new Extrato(pedido);
                extratos += extrato + "\n\n------------------------------------------\n\n";
                comissaoTotal += extrato.getComissao();
            }
        }

        return ExtratoTotal();
    }

    public static String ExtratoTotal() {
        return extratos + "\nComissão Total: R$" + String.format("%.2f", comissaoTotal);
    }
}
