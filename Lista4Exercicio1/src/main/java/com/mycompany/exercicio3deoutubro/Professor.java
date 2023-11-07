package com.mycompany.exercicio3deoutubro;

import java.util.List;
import java.util.ArrayList;

public class Professor extends Funcionario {

    private String urlCurriculoLattes;
    private List<Disciplina> disciplinas;

    public Professor() {
        disciplinas = new ArrayList<>();
    }

    public Professor(String urlCurriculoLattes, String nome, String cpf, int numeroCracha, double salario) {
        super(nome, cpf, numeroCracha, salario);
        this.urlCurriculoLattes = urlCurriculoLattes;
        disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public boolean removeDisciplina(int index) {
        if (index >= 0 && index < disciplinas.size()) {
            disciplinas.remove(index);
            return true;
        } else {
            return false; // Índice inválido
        }
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nUrl do curriculo Lattes: ").append(getUrlCurriculoLattes()).append("\n");
        sb.append("Disciplinas ministradas: ").append("\n");
        for (Disciplina disciplina : disciplinas) {
            sb.append(disciplina.toString()).append("\n");
        }

        return super.toString() + sb.toString();
    }
}
