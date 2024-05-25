package br.com.duarte.ordenacao.model;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Titulo tituloComparar) {
        return this.getNome().compareTo(tituloComparar.nome);
    }

    @Override
    public String toString() {
        return getNome();
    }
}
