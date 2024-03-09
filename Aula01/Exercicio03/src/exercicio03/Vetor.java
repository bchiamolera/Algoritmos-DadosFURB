package exercicio03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Bernardo Chiamolera
 */
public class Vetor {

    String[] produtos;

    public Vetor() {
        this.produtos = new String[0];
    }

    public String cadastrar(String produto) {
        for (String p : this.getProdutos()) {
            if (p.toLowerCase().equals(produto.toLowerCase())) {
                return "Produto já cadastrado!\n";
            }
        }
        int tamanho = this.getProdutos().length;
        tamanho++;

        String[] temp = new String[tamanho];
        for (int i = 0; i < this.getProdutos().length; i++) {
            temp[i] = this.getProdutos()[i];
        }
        temp[tamanho - 1] = produto.trim();

        this.setProdutos(temp);
        return "Produto cadastrado com sucesso!\n";
    }

    public String listar() {
        if (this.getProdutos().length == 0) {
            return "Nenhum produto cadastrado.\n";
        }
        String lista = "";
        for (int i = 0; i < this.getProdutos().length; i++) {
            lista += (i + 1) + ". " + this.getProdutos()[i] + "\n";
        }
        return lista;
    }

    public String pesquisarTermo(String termo) {
        String results = "";
        int numRes = 0;
        for (String p : this.getProdutos()) {
            if (p.trim().toLowerCase().contains(termo)) {
                numRes++;
                results += numRes + ". " + p + "\n";
            }
        }
        if (numRes == 0) {
            return "Nenhum produto encontrado.\n";
        }
        return results;
    }

    public int encontrarProduto(String produto) {
        for (int i = 0; i < this.getProdutos().length; i++) {
            if (this.getProdutos()[i].trim().toLowerCase().equals(produto)) {
                return i;
            }
        }
        return -1;
    }

    public String alterarProduto(int index, String nome) {
        try {
            this.getProdutos()[index] = nome;
        } catch (Exception e) {
            return "Não foi possível alterar o produto.\n";
        }
        return "Produto alterado com sucesso!\n";
    }

    public String removerProduto(int index) {
        try {
            produtos[index] = null;
            String[] temp = new String[this.getProdutos().length - 1];
            for (int i = 0, j = 0; i < this.getProdutos().length; i++) {
                if (i != index) {
                    temp[j++] = this.getProdutos()[i];
                }
            }
            this.setProdutos(temp);
        } catch (Exception e) {
            return "Não foi possível alterar o produto.\n";
        }
        return "Produto alterado com sucesso!\n";
    }

    public String[] getProdutos() {
        return produtos;
    }

    public void setProdutos(String[] produtos) {
        this.produtos = produtos;
    }
}
