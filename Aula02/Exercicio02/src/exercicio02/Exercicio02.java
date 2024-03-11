package exercicio02;

import java.util.Scanner;
import java.util.Vector;

/*
 * Utilizando um Vector, crie um algoritmo com as seguintes funcionalidades:
 * - Cadastrar (Não poderá haver registros iguais).
 * - Selecionar todos os registros.
 * - Realizar uma pesquisa através de um termo (Se o nome possui A, por exemplo).
 * - Alterar dados (Realize uma validação para garantir que será alterado).
 * - Remoção (Realize uma validação para garantir que será removido).
 * Essa estrutura ficará em uma estrutura de repetição e poderão ser registradas inúmeras informações. 
 */
/**
 *
 * @author Bernardo Chiamolera
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<String> nomes = new Vector<>();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar nome");
            System.out.println("2. Selecionar nomes");
            System.out.println("3. Pesquisar nomes");
            System.out.println("4. Alterar nomes");
            System.out.println("5. Remover nomes");
            System.out.println("6. Finalizar");

            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");

            switch (op) {
                case 1 -> {
                    System.out.print("Informe o nome: ");
                    String nome = in.nextLine().trim();
                    boolean nomeExiste = false;

                    for (String s : nomes) {
                        if (s.toLowerCase().equals(nome.toLowerCase())) {
                            nomeExiste = true;
                            break;
                        }
                    }
                    if (nomeExiste) {
                        System.out.println("Nome já existe!\n");
                    } else {
                        nomes.add(nome);
                        System.out.println("Cadastro realizado com sucesso!\n");
                    }
                    break;
                }
                case 2 -> {
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println((i + 1) + ". " + nomes.get(i));
                    }
                    System.out.println("");
                    break;
                }
                case 3 -> {
                    System.out.println("Informe o termo que deseja pesquisar: ");
                    String termo = in.nextLine().trim().toLowerCase();
                    int j = 0;
                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).toLowerCase().contains(termo)) {
                            System.out.println((j + 1) + ". " + nomes.get(i));
                            j++;
                        }
                    }
                    if (j == 0) {
                        System.out.println("Não há nomes que contenham '" + termo + "'");
                    }
                    System.out.println("");
                    break;
                }
                case 4 -> {
                    System.out.println("Informe a posição do nome: (0 para sair)");
                    int index = in.nextInt() - 1;
                    in.nextLine();
                    if (index == -1) {
                        break;
                    } else if (index < nomes.size()) {
                        System.out.println("Informe o novo nome: ");
                        String novoNome = in.nextLine();
                        boolean nomeExiste = false;

                        for (String s : nomes) {
                            if (s.toLowerCase().equals(novoNome.toLowerCase())) {
                                nomeExiste = true;
                                break;
                            }
                        }
                        
                        if (nomeExiste) {
                            System.out.println("Nome já existe!");
                        } else {
                            nomes.set(index, novoNome);
                            System.out.println("Nome alterado com sucesso!");
                        }
                        
                        
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    System.out.println("");
                    break;
                }
                case 5 -> {
                    System.out.println("Informe a posição do nome: (0 para sair)");
                    int index = in.nextInt() - 1;
                    in.nextLine();
                    if (index == -1) {
                        break;
                    } else if (index < nomes.size()) {
                        nomes.remove(index);
                        System.out.println("Nome deletado com sucesso!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    System.out.println("");
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
        }
        in.close();
    }

}
