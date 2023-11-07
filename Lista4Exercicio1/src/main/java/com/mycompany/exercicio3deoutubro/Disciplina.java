package com.mycompany.exercicio3deoutubro;

public class Disciplina {
    
    private int codigo;
    private String nome;

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome) {
        
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
    
        return "Codigo " + getCodigo() + ":" + " " + getNome();
    
    }
    
}
