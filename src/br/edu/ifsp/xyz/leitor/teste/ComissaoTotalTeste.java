package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.CalcularComissaoTotal;
import br.edu.ifsp.xyz.leitor.classe.Vendedor;

public class ComissaoTotalTeste {
    public static void main(String[] args) throws Exception {

        Vendedor vendedor = new Vendedor("src/Vendedor.txt", 0, "1");
        String comissaoTotal = CalcularComissaoTotal.CalcularComissaoTotal(vendedor);

        System.out.println("\n--------------Comissão total--------------\n\n" + comissaoTotal);
    }
}
