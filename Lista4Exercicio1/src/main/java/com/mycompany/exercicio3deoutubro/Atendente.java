package com.mycompany.exercicio3deoutubro;

public class Atendente extends Funcionario {
 
    private String setor;
    private String funcao;

    public Atendente() {
    }

    public Atendente(String nome, String cpf, int numeroCracha, double salario, String setor, String funcao) {
        super(nome, cpf, numeroCracha, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nSetor: " + getSetor() + "\nFunção: " + getFuncao();
    }
}
