/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioavaliativo01;

/**
 *
 * @author Bernardo Chiamolera
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private String criador;

    public Tarefa(String titulo, String descricao, String criador) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setCriador(criador);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }
    
    
}
