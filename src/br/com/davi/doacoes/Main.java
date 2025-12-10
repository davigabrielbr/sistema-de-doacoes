package br.com.davi.doacoes;

import br.com.davi.doacoes.model.Doador;
import br.com.davi.doacoes.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Doador doador = new Doador();
        doador.setNomeCompleto("Doador01");
        doador.setCpf("123.456.789-13");
        doador.setEmail("doador_teste01@hotmail.com");
        doador.setTelefone("81912345678");
        doador.setCategoriaDoacao("Roupas");
        doador.setSobreVoce("Quero ajudar!");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua doação");
        endereco.setNumero("123");
        endereco.setCidade("Recife");
        endereco.setEstado("PE");

        doador.setEndereco(endereco);

        System.out.println("Doador cadastrado:");
        System.out.println("Nome: " + doador.getNomeCompleto());
        System.out.println("CPF: " + doador.getCpf());
        System.out.println("Categoria de doação: " + doador.getCategoriaDoacao());
        System.out.println("Cidade: " + doador.getEndereco().getCidade());
    }
}