package com.abstracaoBootcamp;

import java.util.ArrayList;
import java.util.List;

public abstract class Atividade {
    private String titulo;
    private String descricao;
    private int id;
    private static int ID_SEQUENCIAL = 1;

    private List<Curso> cursos;
    private  List<Mentoria> mentorias;

    public Atividade() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ID_SEQUENCIAL++;
    }

    public abstract double calcularXP();

}
