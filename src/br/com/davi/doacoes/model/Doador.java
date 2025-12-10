package br.com.davi.doacoes.model;

public class Doador extends Pessoa {
    private String profissao;
    private String categoriaDoacao;
    private String sobreVoce;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCategoriaDoacao() {
        return categoriaDoacao;
    }

    public void setCategoriaDoacao(String categoriaDoacao) {
        this.categoriaDoacao = categoriaDoacao;
    }

    public String getSobreVoce() {
        return sobreVoce;
    }

    public void setSobreVoce(String sobreVoce) {
        this.sobreVoce = sobreVoce;
    }
}