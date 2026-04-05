package br.edu.ifsp.xyz.leitor.classe;

import java.util.ArrayList;

public class Vendedor {
    private int idVendedor;
    private String cnpj;
    private String nome;
    private String endereco;
    private String setor;
    public Vendedor(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> vendedores = leitor.conteudo();
        String vendedor = vendedores.getFirst();
        String[] campos = vendedor.split(";");
        this.idVendedor = Integer.parseInt(campos[0]);
        this.cnpj = campos[1];
        this.nome = campos[2];
        this.endereco = campos[3];
        this.setor = campos[4];

    }

    @Override
    public String toString() {
        return "Vendedor [idVendedor=" + idVendedor + ", cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco + ", setor=" + setor + "]";
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() { return endereco; }

    public String getSetor() { return setor; }
}