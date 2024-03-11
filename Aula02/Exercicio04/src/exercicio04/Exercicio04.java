package exercicio04;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Utilizando LinkedList, implemente uma estrutura de nós. Haverá um laço de repetição com as funcionalidades:
 * - Cadastrar (cadastre um nome);
 * - Listar (liste todos os nomes informados);
 * -Finalizar (encerra o laço).
 */

/**
 *
 * @author Bernardo Chiamolera
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> nomes = new LinkedList<>();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar nome");
            System.out.println("2. Listar nomes");
            System.out.println("3. Finalizar");
            
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
