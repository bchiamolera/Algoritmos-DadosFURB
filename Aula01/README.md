# Estrutura de Dados
Essa disciplina tem a função de apresentar a maneira correta de **organizar, armazenar e gerenciar** dados em projetos, buscando **sempre escolher a melhor alternativa** de construção para permitir uma melhor **eficiência** na manipulação de dados.

Ela é importante para preparar os desenvolvedores a escolher a melhor alternativa de armazenamento de dados em seus projetos, garantido uma aplicação segura, eficiente e prática.

## Array
Uma array é uma coleção de elementos que permite o armazenamento de dados de um mesmo tipo. Existem dois tipos de array: Estática e dinâmica.
### Array Estática
Quando criada, determina-se o seu tamanho máximo de registros na própria instânica.
Ex.:
```java
public class exemplo {
    public static void main(String[] args) {
        char[] alfabeto = new char[26];
    }
}
```
### Array Dinâmica
Primeiro cria-se a Array, quando for necessário utilizá-la, determina-se o tamanho, podendo, posteriormente, realocá-lo.
Ex.:
```java
public class exemplo2 {
    String[] animais;
    public static void main(String[] args) {
        this.animais = new String[5];
    }
}
```
## Lista
Uma lista é uma coleção de elementos coordenados baseada em arrays simples, com sua ordem baseando-se em índices. No java, pode-se adicionar, encontrar, remover e modificar elementos facilmente com comandos da classe List.
Ex.:
```java
public class exemplo3 {
    public static void main(String[] args) {
        // Criando
        List<String> livros = new ArrayList<>();
        
        // Add elementos
        livros.add("Duna");
        livros.add("O Hobbit");
        livros.add("Harry Potter e a Pedra Filosofal");

        // Listagem
        System.out.println("Lista inicial: " + livros);

        // Remove elementos
        livros.remove(2);

        // Listagem
        System.out.println("Lista final: " + livros);
    }
}
```

## Fila
Uma fila é uma coleção de elementos que baseia-se no conceito FIFO ("First In, First Out"), ou seja, o primeiro elemento adicionado, será o primeiro a ser removido, e assim por diante. Ele não permite elementos duplicados.
Ex.:
```java
public class exemplo3 {
    public static void main(String[] args) {
        // Criando
        Queue<String> pacientes = new LinkedList<>();
        
        // Add elementos
        livros.add("Robson");
        livros.add("Cleiton");
        livros.add("Maria");

        // Listagem*
        System.out.println("Lista inicial: " + pacientes);

        // Remove elementos
        String pacienteRemovido = livros.remove();
        System.out.println("Paciente removido: " + pacienteRemovido);

        // Listagem
        System.out.println("Lista final: " + pacientes);
    }
}
```
## Pilha
Uma pilha é uma coleção de elementos baseada no conceito LIFO ("Last In, First Out"), ou seja, o último elemento adicionado será o primeiro a ser removido.
Ex.:
```java
public class exemplo3 {
    public static void main(String[] args) {
        // Criando
        Stack<int> numeros = new Stack<>();
        
        // Add elementos
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);

        // Topo da pilha
        System.out.println("Topo da pilha: " + numeros.peek());

        // Remove elementos
        while (!numeros.isEmpty()) {
            int numRemovido = numeros.pop();
            System.out.println("Número removido: " + numRemovido);
        }

        // Topo da pilha
        System.out.println("Topo da pilha: " + numeros.peek());
    }
}
```
