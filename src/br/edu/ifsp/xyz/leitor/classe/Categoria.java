package br.edu.ifsp.xyz.leitor.classe;

import java.util.ArrayList;

public class Categoria {
    private int idCategoria;
    private double percentualComissao;
    private String nomeCategoria;
    public Categoria(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> categorias = leitor.conteudo();
        String categoria = categorias.getFirst();
        String[] campos = categoria.split(";");

        this.idCategoria = Integer.parseInt(campos[0]);
        this.percentualComissao = Double.parseDouble(campos[1]);
        this.nomeCategoria = campos[2];

    }
    @Override
    public String toString() {return "Categoria [idCategoria=" + idCategoria + ", percentualComissao=" + percentualComissao + ", nomeCategoria=" + nomeCategoria + "]";}

    public int getIdCategoria() {return idCategoria;}

    public double getPercentualComissao() {return percentualComissao;}

    public String getNomeCategoria() {return nomeCategoria;}
}
