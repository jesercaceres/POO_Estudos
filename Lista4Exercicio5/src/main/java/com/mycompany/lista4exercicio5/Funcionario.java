package com.mycompany.lista4exercicio5;


public class Funcionario {
    
    private static int qtdFuncionarios;
    private final int matriculaFuncionarios;

    public Funcionario() {
        Funcionario.qtdFuncionarios++;
        this.matriculaFuncionarios = Funcionario.qtdFuncionarios;
    }
    
    public static int getQtdFuncionarios(){
        return qtdFuncionarios;
    }
    
    public static void setQtdFuncionarios(int qtdFuncionarios){
       Funcionario.qtdFuncionarios = qtdFuncionarios;
    }
    public int getMatriculaFuncionarios(){
        return this.matriculaFuncionarios;
    }
}
