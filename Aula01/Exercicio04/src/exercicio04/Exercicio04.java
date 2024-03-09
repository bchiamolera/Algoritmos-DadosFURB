package exercicio04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Escolha uma das opções de estrutura de dados: Array, Fila, Lista ou Pilha.
 * Desenvolva um sistema para atendimento (ficará em uma estrutura de repetição), este projeto terá as seguintes funcionalidades:
 * - Cadastrar atendimento (informe o nome da pessoa).
 * - Remover (deverá remover em ordem de chegada).
 * - Finalizar (encerrar o sistema).
 * No cabeçalho do projeto, utilizando comentários, explique o motivo de ter utilizado determinada estrutura de dado. 
 */

/*
 * Escolhi utilizar fila, pois segue o padrão FIFO ('Firs In, First Out'), visto que o primeiro paciente a chegar deverá ser
 * o primeiro a ser atendido, o segundo logo em sequência, e assim sucessivamente.
 */

/**
 * @author Bernardo Chiamolera
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<String> atendimentos = new LinkedList<>();
        boolean close = false;
        int op;
        
        while(!close) {
            System.out.println("1. Cadastrar atendimento");
            System.out.println("2. Remover atendimento");
            System.out.println("3. Finalizar");
            
            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");
            
            switch (op) {
                case 1 -> {
                    System.out.println("Informe o nome do paciente: ");
                    atendimentos.add(in.nextLine().trim());
                    System.out.println("");
                    break;
                }
                case 2 -> {
                    if (atendimentos.isEmpty()) {
                        System.out.println("Não há atendimentos\n");
                        break;
                    }
                    String paciente = atendimentos.remove();
                    System.out.println("Paciente " + paciente + " removido.\n");
                    break;
                }
                case 3 -> {
                    close = true;
                    break;
                }
                default -> {
                    System.out.println("Comando inválido.\n");
                }
            }
        }
        in.close();
    }
    
}
