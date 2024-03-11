package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

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
        ArrayList<String> produtos = new ArrayList<>();
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
                    break;
                }
                case 2 -> {
                    break;
                }
                case 3 -> {
                    break;
                }
                case 4 -> {
                    break;
                }
                case 5 -> {
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
