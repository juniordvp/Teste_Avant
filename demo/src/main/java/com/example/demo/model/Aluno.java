package com.example.demo.model;

public class Aluno {
    private String nome;
    private int id;
    private double nota;

    public Aluno(String nome, int id, double nota) {
        this.nome = nome;
        this.id = id;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString(String nome, int id, double nota) {

        return "Aluno{" +
                "nota=" + nota +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                '}';

    }

}
