package exercicio03;

import java.util.Scanner;

/*
 * Utilizando um array dinâmico, desenvolva um algoritmo para gerenciar produtos, contendo as seguintes funcionalidades:
 * - Cadastro: Informar nome do produto e valor.
 * - Listagem: Listar todos os produtos (nome e valor).
 * - Pesquisa: Será pedido um termo, localize os produtos que contenham aquele termo no seu nome.
 * - Alterar: Será pedido o nome do produto que será alterado. Informe um novo nome e o valor.
 * - Remover: Através do nome do produto, realize a exclusão.
 * - Finalizar: Encerra o sistema.
 */

/**
 * @author Bernardo Chiamolera
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vetor produtos = new Vetor();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Pesquisar produto");
            System.out.println("4. Alterar produtos");
            System.out.println("5. Remover produtos");
            System.out.println("6. Finalizar");
            
            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");
            
            switch (op) {
                case 1 -> {
                    System.out.println("Informe o nome do produto: ");
                    String produto = in.nextLine();
                    System.out.println(produtos.cadastrar(produto.trim()));
                    break;
                }
                case 2 -> {
                    System.out.println(produtos.listar());
                    break;
                }
                case 3 -> {
                    System.out.print("Informe o termo a ser pesquisado: ");
                    String termo = in.next().trim().toLowerCase();
                    System.out.println(produtos.pesquisarTermo(termo));
                    break;
                }
                case 4 -> {
                    System.out.println("Informe o nome do produto a ser alterado: ");
                    String nome = in.next().trim().toLowerCase();
                    int index = produtos.encontrarProduto(nome);
                    if (index != -1) {
                        System.out.println("Informe o novo produto: ");
                        String novoNome = in.next();
                        System.out.println(produtos.alterarProduto(index, novoNome));
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                }
                case 5 -> {
                    System.out.println("Informe o nome do produto a ser removido: ");
                    String nome = in.next().trim().toLowerCase();
                    int index = produtos.encontrarProduto(nome);
                    if (index != -1) {
                        System.out.println(produtos.removerProduto(index));
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                }
                case 6 -> {
                    close = true;
                    break;
                }
                default -> {
                    System.out.println("Comando inválido.");
                }
            }
        }
        in.close();
    }
    
}
