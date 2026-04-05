package br.edu.ifsp.xyz.leitor.teste;

import br.edu.ifsp.xyz.leitor.classe.Categoria;

public class CategoriaTeste {
    public static void main(String[] args) throws Exception {
        Categoria categoria = new Categoria("./src/Categoria.txt", 0, "2");
        System.out.println("--->" + categoria);
    }
}
