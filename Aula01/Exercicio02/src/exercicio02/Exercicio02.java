package exercicio02;

import java.util.Scanner;

/* Utilizando um array estático de dez posições, desenvolva um algoritmo com as
 * seguintes funcionalidades:
 * - Cadastrar;
 * - Listar todos os nomes;
 * - Alterar;
 * - Remover;
 * - Finalizar.
 * Essa estrutura ficará em um laço de repetição.
 */

/**
 * @author Bernardo Chiamolera
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[10];
        boolean close = false;
        int numNomes = 0;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar nome");
            System.out.println("2. Listar nomes");
            System.out.println("3. Alterar nome");
            System.out.println("4. Remover nome");
            System.out.println("5. Encerrar");
            
            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");

            switch (op) {
                // Cadastrar nome
                case 1 -> {
                    if (numNomes < 10) {
                        System.out.println("Informe o nome: ");
                        nomes[numNomes] = in.next();
                        numNomes++;
                        System.out.println("Nome cadastrado!\n");
                    } else {
                        System.out.println("Máximo de nomes cadastrados (10)\n");
                    }
                    break;
                }
                // Listar nomes
                case 2 -> {
                    for (int i = 0; i < numNomes; i++) {
                        System.out.println((i + 1) + ". " + nomes[i]);
                    }
                    if (numNomes == 0) {
                        System.out.println("Lista vazia.");
                    }
                    if (numNomes < 10) {
                        System.out.println(10 - numNomes + " entradas restantes.\n");
                    }
                }
                // Alterar nome
                case 3 -> {
                    if (numNomes == 0) {
                        System.out.println("Não há nomes cadastrados\n");
                    } else {
                        System.out.println("Informe a posição do nome: (0 para sair)");
                        int posicao = in.nextInt();
                        if (posicao == 0) {
                            System.out.println("");
                            break;
                        }
                        if (posicao > 0 && posicao <= numNomes) {
                            System.out.println("Informe o novo nome: ");
                            nomes[posicao - 1] = in.next();
                            System.out.println("Alteração realizada com sucesso!\n");
                        } else {
                            System.out.println("Posição inválida!\n");
                        }
                    }
                    break;
                }
                // Remover nome
                case 4 -> {
                    if (numNomes == 0) {
                        System.out.println("Não há nomes cadastrados.\n");
                    } else {
                        System.out.println("Informe a posição do nome: (0 para sair)");
                        int posicao = in.nextInt();
                        if (posicao == 0) {
                            System.out.println("");
                            break;
                        }
                        if (posicao > 0 && posicao <= numNomes) {
                            numNomes--;
                            nomes[posicao - 1] = null;
                            String[] tempNomes = new String[10];
                            for (int i = 0, j = 0; i < 10; i++) {
                                if (i != posicao - 1) {
                                    tempNomes[j++] = nomes[i];
                                }
                            }
                            nomes = tempNomes;
                        } else {
                            System.out.println("Posição inválida.\n");
                        }
                    }
                    break;
                }
                // Encerrar
                case 5 -> {
                    close = true;
                    break;
                }
                // Default
                default -> {
                    System.out.println("Comando inválido.\n");
                }
            }
        }
        in.close();
    }

}
