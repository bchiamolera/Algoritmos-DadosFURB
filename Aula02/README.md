# Aula 11/03/2024
## Vector
Em Java, a classe **Vector** implementa um array dinâmico de objetos, onde novos registros são adicionados ao final da lista.
Com o índice de um objeto, é possível manipulá-lo É considerada uma classe legado, já não muito utilizada, podendo ser
substituída pelo ArrayList.

> **Características:**
> - Funciona como um array dinâmico;
> - Permite manipular registros através de índices;
> - É sincronizado.

```java
// Inicializando vetor
Vector<String> vetor = new Vector<>();

// Populando vetor
vetor.add("Bernardo");
vetor.add("Ricardo");
vetor.add("Yuri");
        
// Imprimindo vetor
System.out.println("Vetor:");
System.out.println(vetor);
        
// Manipulando vetor
vetor.set(0,"Vincius");
vetor.remove(2);
        
// Imprimindo o novo vetor
System.out.println("Novo vetor: ");
System.out.println(vetor);
```

## ArrayList
**ArrayList**, assim como Vector, implementa um array dinâmico de objetos. A principal diferença entre ArrayList e Vector se encontra na performance.
ArrayList é mais performática e mais rápida do que Vector.

> **Características:**
> - Funciona como um array dinâmico;
> - Permite manipular registros através de índices;
> - Alta performance;
> - Alta velocidade;
> - "Vector 2.0";
> - Não é sincronizado.

```java
// Inicializando a lista
ArrayList<String> lista = new ArrayList<>();

// Populando vetor
lista.add("Nova York");
lista.add("São Paulo");
lista.add("Xangai");

// Imprimindo vetor
System.out.println("ArrayList:");
System.out.println(lista);
        
// Manipulando a lista
lista.set(1, "Dubai");
lista.remove(0);
        
// Imprimindo vetor
System.out.println("Novo ArrayList:");
System.out.println(lista);
```

## LinkedList
**LinkedList** é uma lista ligada, onde se guarda também a referência para o próximo elemento e/ou o anterior. A LinkedList não usa array, mas sim "nós" (nodes).
Os nós armazenam 3 coisas: o valor do elemento, o endereço de memória do item anterior e o endereço de memória do próximo item.

> **Características:**
> - Funciona como uma lista dinâmica;
> - Trabalha com nós;
> - Objetos linkados; 

```java
// Criando a LinkedList
LinkedList<String> lista = new LinkedList<>();
        
// Populando a LinkedList
lista.add("Sanduíche");
lista.add("Arroz");
lista.add("Suco de laranja");
        
// Imprimindo a LinkedList
System.out.println("LinkedList:");
System.out.println(lista);
        
// Manipulando a LinkedList
lista.set(0,"Carbonara");
lista.remove(1);
        
// Imprimindo a nova LinkedList
System.out.println("Nova LinkedList:");
System.out.println(lista);
```

## HashMap
**HashMap** é uma estrutura de dados baseada em conjuntos de pares de chave-valor. A **chave única** serve como identificador do valor, sendo assim,
o valor pode ser acessado a partir de sua respectiva chave. É uma estrutura muito usada quando precisa-se armazenar muitos dados grandes.

> **Características:**
> - Conjuto de pares de chave-valor;
> - Chave única que funciona como índice de cada valor;
> - Elementos não são ordenados;

```java
// Inicializando a lista
HashMap<String, String> mapa = new HashMap<>();

// Populando o HashMap
System.out.println("HashMap:");
mapa.put("Foo Fighters","Under You");
mapa.put("Lady Gaga","Poker Face");
mapa.put("Vitor e Leo","Borboletas");
mapa.put("Fleetwood Mac","Dreams");
mapa.put("Katy Perry","Teenage Dream");
mapa.put("Ana Castela","Lua");
        
// Imprimindo HashMap
for (String key : mapa.keySet()) {
        System.out.println(key + ": "+ mapa.get(key));
}
        
// Manipulando a HashMap
mapa.put("Foo Fighters", "The Pretender");
mapa.remove("Katy Perry");
        
// Imprimindo o novo HashMap
System.out.println("\nNovo Hashmap: ");
for (String key : mapa.keySet()) {
        System.out.println(key + ": "+ mapa.get(key));
}
```
