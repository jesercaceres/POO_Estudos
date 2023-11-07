package com.mycompany.exercicio3deoutubro;


public class Aluno extends Pessoa {
    
    private String ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String ra, String curso, String nome, String cpf) {
       
        super(nome, cpf);
      
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        
        return super.toString() + "\nRA: " + getRa() + "\nCurso: " + getCurso() + "\n";
        
    }
}
