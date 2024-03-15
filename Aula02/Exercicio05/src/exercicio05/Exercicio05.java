package exercicio05;

import java.util.HashMap;
import java.util.Map;
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
        Map<String, Carro> carros = new HashMap<>();
        boolean close = false;
        int op;

        while (!close) {
            op = 0;
            System.out.println("1. Cadastrar carro");
            System.out.println("2. Selecionar carros");
            System.out.println("3. Alterar carro");
            System.out.println("4. Remover carro");
            System.out.println("5. Estatísticas");
            System.out.println("6. Finalizar");

            System.out.print("Informe o número do comando: ");
            op = in.nextInt();
            in.nextLine();
            System.out.println("");

            switch (op) {
                case 1 -> {
                    System.out.println("Digite o modelo do carro: ");
                    String modelo = in.nextLine().trim();
                    System.out.println("Digite a marca do carro: ");
                    String marca = in.nextLine().trim();
                    System.out.println("Digite o ano do carro: ");
                    int ano = in.nextInt();
                    in.nextLine();
                    carros.put(modelo, new Carro(marca, modelo, ano));
                    System.out.println("Carro cadastrado com sucesso!");
                    break;
                }
                case 2 -> {
                    if (!carros.isEmpty()) {
                        System.out.println("Carros: ");
                        for (Map.Entry<String, Carro> c : carros.entrySet()) {
                            System.out.println("> " + c.getKey() + " " + c.getValue().getAno() + " - " + c.getValue().getMarca());
                        }
                    } else {
                        System.out.println("Não há carros cadastrados!");
                    }
                    break;
                }
                case 3 -> {
                    if (!carros.isEmpty()) {
                        System.out.println("Digite o modelo que deseja alterar: ");
                        String modelo = in.nextLine();
                        Carro carro = carros.get(modelo);
                        if (carro == null) {
                            System.out.println("Carro não encontrado!");
                        } else {
                            System.out.println("Digite a nova marca: ");
                            String novaMarca = in.nextLine();
                            carro.setMarca(novaMarca);
                            System.out.println("Digite o novo ano: ");
                            int novoAno = in.nextInt();
                            in.nextLine();
                            carro.setAno(novoAno);
                            
                            System.out.println("Carro alterado com sucesso!");
                        }
                    } else {
                        System.out.println("Não há carros cadastrados!");
                    }
                    break;
                }
                case 4 -> {
                    if (!carros.isEmpty()) {
                        System.out.println("Digite o modelo que deseja alterar: ");
                        String modelo = in.nextLine();
                        Carro carro = carros.get(modelo);
                        if (carro == null) {
                            System.out.println("Carro não encontrado!");
                        } else {
                            carros.remove(modelo);
                            System.out.println("Carro removido com sucesso!");
                        }
                    } else {
                        System.out.println("Não há carros cadastrados!");
                    }
                    break;
                }
                case 5 -> {
                    if (!carros.isEmpty()) {
                        Map<String, Integer> carrosPorMarca = new HashMap<>();
                        for (Carro c : carros.values()) {
                            String marca = c.getMarca();
                            carrosPorMarca.put(marca, carrosPorMarca.getOrDefault(marca, 0) + 1);
                        }
                        System.out.println("Estatísticas: ");
                        System.out.println("Total de carros: " + carros.size());
                        for (Map.Entry<String, Integer> m : carrosPorMarca.entrySet()) {
                            System.out.println("- " + m.getKey() + ": " + m.getValue());
                        }
                    } else {
                        System.out.println("Não há carros cadastrados!");
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
