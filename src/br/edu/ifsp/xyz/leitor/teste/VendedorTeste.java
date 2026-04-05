package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Vendedor;

public class VendedorTeste {
    public static void main(String[] args) throws Exception {
        Vendedor vendedor = new Vendedor("./src/Vendedor.txt", 2, "Amazon");
        System.out.println("--->" + vendedor);
    }
}