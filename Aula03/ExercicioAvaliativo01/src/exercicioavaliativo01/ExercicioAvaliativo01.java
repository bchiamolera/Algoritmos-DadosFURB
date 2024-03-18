package exercicioavaliativo01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Você foi contratado para desenvolver um sistema de gerenciamento de tarefas
 * para uma equipe de desenvolvimento de software na linguagem Java.
 * O sistema deve permitir que os membros da equipe adicionem tarefas, removam
 * tarefas concluídas e visualizem as próximas tarefas a serem realizadas.
 * O sistema deve ser capaz de lidar com as seguintes operações:
 * - Adicionar uma nova tarefa à lista.
 * - Concluir uma tarefa, removendo-a da lista.
 * - Visualizar a próxima tarefa a ser realizada.
 */

/**
 *
 * @author Bernardo Chiamolera
 */
public class ExercicioAvaliativo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Tarefa> lista = new LinkedList<>();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa atual");
            System.out.println("3. Visualizar tarefa atual");
            System.out.println("4. Finalizar");
            
            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");
            
            switch (op) {
                case 1 -> {
                    System.out.println("Informe o título da tarefa: ");
                    String titulo = in.nextLine().trim();
                    System.out.println("Informe a descrição da tarefa: ");
                    String descricao = in.nextLine().trim();
                    System.out.println("Informe o criador da tarefa: ");
                    String criador = in.nextLine().trim();
                    
                    Tarefa t = new Tarefa(titulo, descricao, criador);
                    if (!lista.contains(t)) {
                        lista.add(t);
                        System.out.println("Tarefa adicionada com sucesso!\n");
                    } else {
                        System.out.println("Tarefa já existe!\n");
                    }
                    break;
                }
                case 2 -> {
                    if (!lista.isEmpty()) {
                        Tarefa t = lista.poll();
                        System.out.println("Tarefa " + t.getTitulo() + " concluída com sucesso!\n");
                    } else {
                        System.out.println("Não há tarefas para serem removidas!\n");
                    }
                    break;
                }
                case 3 -> {
                    if (!lista.isEmpty()) {
                        Tarefa t = lista.peek();
                        System.out.println(t.getTitulo() + ":\nCriador: " + t.getCriador() + "\nDescrição: " + t.getDescricao() + "\n");
                    } else {
                        System.out.println("Não há mais tarefas!\n");
                    }
                    break;
                }
                case 4 -> {
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
