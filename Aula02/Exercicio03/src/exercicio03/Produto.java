package exercicio03;

/**
 *
 * @author Bernardo Chiamolera
 */
public class Produto {
    private String nome;
    private String segmento;

    public Produto(String nome, String segmento) {
        this.setNome(nome);
        this.setSegmento(segmento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
    
    
}
