package exercicio05;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Tema livre, utilizando HashMap. Além das funcionalidades padrões de um CRUD:
 * - Cadastro.
 * - Seleção.
 * - Alteração.
 * - Exclusão.
 * Implemente uma opção de estatísticas, retornando alguns contadores, exemplo:
 * - 30 alunos registros
 * - 20 aprovados
 * - 10 reprovados
 */

/**
 *
 * @author Bernardo Chiamolera
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> alunos = new HashMap<>();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Selecionar alunos");
            System.out.println("3. Alterar alunos");
            System.out.println("4. Remover nomes");
            System.out.println("5. Finalizar");
            
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
                    close = true;
                    break;
                }
                default -> {
                    System.out.println("Comando inválido!\n");
                }
            }
        }
    }
    
}
