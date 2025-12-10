package br.com.davi.doacoes.model;

public class Familia extends Pessoa {
    private String nomesMembros;
    private int quantidadeMembros;
    private String necessidades;

    public void receberDoacao() {

    }

    public String getNomesMembros() {
        return nomesMembros;
    }

    public void setNomesMembros(String nomesMembros) {
        this.nomesMembros = nomesMembros;
    }

    public int getQuantidadeMembros() {
        return quantidadeMembros;
    }

    public void setQuantidadeMembros(int quantidadeMembros) {
        this.quantidadeMembros = quantidadeMembros;
    }

    public String getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(String necessidades) {
        this.necessidades = necessidades;
    }
}