package br.com.davi.doacoes;

import br.com.davi.doacoes.model.Doacao;
import br.com.davi.doacoes.model.Doador;
import br.com.davi.doacoes.model.Endereco;
import br.com.davi.doacoes.model.Familia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        Doador doador = null;
        Familia familia = null;
        Doacao doacao = null;

        do {
            System.out.println("============================");
            System.out.println("\n=== Sistema de Doações ===");
            System.out.println("1 - Cadastrar doador");
            System.out.println("2 - Cadastrar família");
            System.out.println("3 - Cadastrar doação");
            System.out.println("4 - Mostrar doador cadastrado");
            System.out.println("5 - Mostrar família cadastrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("--- Cadastro de Doador ---");

                    doador = new Doador();

                    System.out.print("Nome completo: ");
                    doador.setNomeCompleto(scanner.nextLine());

                    System.out.print("CPF: ");
                    doador.setCpf(scanner.nextLine());

                    System.out.print("Email: ");
                    doador.setEmail(scanner.nextLine());

                    System.out.print("Telefone: ");
                    doador.setTelefone(scanner.nextLine());

                    System.out.print("Profissão: ");
                    doador.setProfissao(scanner.nextLine());

                    System.out.print("Categoria da doação: ");
                    doador.setCategoriaDoacao(scanner.nextLine());

                    System.out.print("Sobre você: ");
                    doador.setSobreVoce(scanner.nextLine());

                    Endereco endereco = new Endereco();

                    System.out.print("Endereço (Rua): ");
                    endereco.setRua(scanner.nextLine());

                    System.out.print("Número: ");
                    endereco.setNumero(scanner.nextLine());

                    System.out.print("Cidade: ");
                    endereco.setCidade(scanner.nextLine());

                    System.out.print("Estado: ");
                    endereco.setEstado(scanner.nextLine());

                    doador.setEndereco(endereco);

                    System.out.println("Doador cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("--- Cadastro da Família ---");

                    familia = new Familia();

                    System.out.print("Nome do responsável: ");
                    familia.setNomeResponsavel(scanner.nextLine());

                    System.out.print("CPF do responsável: ");
                    familia.setCpfResponsavel(scanner.nextLine());

                    System.out.print("Quantidade de pessoas na família: ");
                    familia.setQuantidadeMembros(scanner.nextInt());
                    scanner.nextLine();

                    Endereco endereco1 = new Endereco();

                    System.out.print("Cidade: ");
                    endereco1.setCidade(scanner.nextLine());

                    System.out.print("Estado: ");
                    endereco1.setEstado(scanner.nextLine());

                    System.out.print("Rua: ");
                    endereco1.setRua(scanner.nextLine());

                    System.out.print("Número: ");
                    endereco1.setNumero(scanner.nextLine());

                    familia.setEndereco(endereco1);

                    System.out.println("Família cadastrada com sucesso!");
                    break;
                case 3:
                    System.out.println("--- Cadastrar Doação ---");

                    if (doador == null) {
                        System.out.println("Nenhum doador cadastrado. Cadastre um doador primeiro.");
                        break;
                    }

                    if (familia == null) {
                        System.out.println("Nenhuma família cadastrada. Cadastre uma família primeiro.");
                        break;
                    }

                    doacao = new Doacao();

                    System.out.print("Categoria da doação (Ex: Alimento, Roupa, Dinheiro): ");
                    doacao.setCategoria(scanner.nextLine());

                    System.out.print("Descrição da doação: ");
                    doacao.setDescricao(scanner.nextLine());

                    System.out.print("Data da doação: ");
                    doacao.setData(scanner.nextLine());

                    doacao.setDoador(doador);
                    doacao.setFamilia(familia);

                    System.out.println("Doação cadastrada com sucesso!");
                    break;
                case 4:
                    if (doador == null) {
                        System.out.println("Nenhum doador cadastrado ainda.");
                    } else {
                        System.out.println("\n--- Doador Cadastrado ---");
                        System.out.println("Nome: " + doador.getNomeCompleto());
                        System.out.println("CPF: " + doador.getCpf());
                        System.out.println("Email: " + doador.getEmail());
                        System.out.println("Telefone: " + doador.getTelefone());
                        System.out.println("Profissão: " + doador.getProfissao());
                        System.out.println("Categoria da doação: " + doador.getCategoriaDoacao());
                        System.out.println("Sobre você: " + doador.getSobreVoce());

                        System.out.println("\n--- Endereço ---");
                        System.out.println("Rua: " + doador.getEndereco().getRua());
                        System.out.println("Número: " + doador.getEndereco().getNumero());
                        System.out.println("Cidade: " + doador.getEndereco().getCidade());
                        System.out.println("Estado: " + doador.getEndereco().getEstado());
                    }
                    break;
                case 5:
                    if (familia == null) {
                        System.out.println("Nenhuma família cadastrada ainda.");
                    } else {
                        System.out.println("--- Família Cadastrada ---");
                        System.out.println("Responsável: " + familia.getNomeResponsavel());
                        System.out.println("Quantidade de membros: " + familia.getQuantidadeMembros());
                        System.out.println("--- Endereço ---");
                        System.out.println("Rua: " + familia.getEndereco().getRua());
                        System.out.println("Número: " + familia.getEndereco().getNumero());
                        System.out.println("Cidade: " + familia.getEndereco().getCidade());
                        System.out.println("Estado: " + familia.getEndereco().getEstado());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}