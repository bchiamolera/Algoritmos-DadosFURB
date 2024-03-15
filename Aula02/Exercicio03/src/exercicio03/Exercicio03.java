package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Utilizando um ArrayList, crie um algoritmo com as seguintes funcionalidades:
 * - Cadastrar (Deverá cadastrar o nome de um produto e o segmento, pode adicionar mais características, caso queira).
 * - Selecionar todos os registros.
 * - Quantidade de segmentos: Exiba o nome e a quantidade de produtos em cada segmento.
 * - Alterar dados (Realize uma validação para garantir que será alterado).
 * - Remoção (Realize uma validação para garantir que será removido).
 * Essa estrutura ficará em uma estrutura de repetição e poderão ser registradas inúmeras informações.
 */
/**
 *
 * @author Bernardo Chiamolera
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Selecionar produtos");
            System.out.println("3. Quantidade de segmentos");
            System.out.println("4. Alterar dados");
            System.out.println("5. Remover produto");
            System.out.println("6. Finalizar");

            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");

            switch (op) {
                case 1 -> {
                    System.out.println("Digite o nome do produto: ");
                    String nome = in.nextLine().trim();
                    System.out.println("Digite o segmento do produto: ");
                    String segmento = in.nextLine().trim();
                    produtos.add(new Produto(nome, segmento));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                }
                case 2 -> {
                    if (produtos.size() > 0) {
                        System.out.println("Produtos: ");
                        for (int i = 0; i < produtos.size(); i++) {
                            Produto p = produtos.get(i);
                            System.out.println((i + 1) + ". " + p.getNome() + " - " + p.getSegmento());
                        }
                    } else {
                        System.out.println("Não há produtos cadastrados!");
                    }
                    break;
                }
                case 3 -> {
                    if (!produtos.isEmpty()) {
                        ArrayList<String> segmentos = new ArrayList<>();
                        for (Produto p : produtos) {
                            String segmento = p.getSegmento();
                            if (!segmentos.contains(segmento.toLowerCase())) {
                                segmentos.add(segmento.toLowerCase());
                            }
                        }
                        System.out.println("Segmento(s):");
                        for (int i = 0; i < segmentos.size(); i++) {
                            int qtd = 0;
                            for (Produto p : produtos) {
                                if (p.getSegmento().toLowerCase().equals(segmentos.get(i))) {
                                    qtd++;
                                }
                            }
                            System.out.println((i + 1) + ". " + segmentos.get(i) + " - Qtd. produtos: " + qtd);
                        }
                    } else {
                        System.out.println("Não há produtos cadastrados!");
                    }
                    break;
                }
                case 4 -> {
                    if (!produtos.isEmpty()) {
                        System.out.println("Digite a posição do produto (0 para sair)");
                        int index = in.nextInt();
                        in.nextLine();
                        if (index == 0) {
                            break;
                        } else if (index - 1 < produtos.size()) {
                            Produto p = produtos.get(index - 1);
                            System.out.println("Novo nome: ");
                            String nome = in.nextLine().trim();
                            p.setNome(nome);
                            System.out.println("Novo segmento: ");
                            String segmento = in.nextLine().trim();
                            p.setSegmento(segmento);
                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado!");
                        }
                    } else {
                        System.out.println("Não há produtos cadastrados!");
                    }
                    break;
                }
                case 5 -> {
                    if (!produtos.isEmpty()) {
                        System.out.println("Digite a posição do produto (0 para sair)");
                        int index = in.nextInt();
                        in.nextLine();
                        if (index == 0) {
                            break;
                        } else if (index - 1 < produtos.size()) {
                            produtos.remove(index - 1);
                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado!");
                        }
                    } else {
                        System.out.println("Não há produtos cadastrados!");
                    }
                    break;
                }
                case 6 -> {
                    close = true;
                    break;
                }
                default -> {
                    System.out.println("Comando inválido!\n");
                }
            }

            System.out.println("");
        }
        in.close();
    }

}
