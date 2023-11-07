package lista4exercicio4;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusao;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String anoConclusao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusao = anoConclusao;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
    
        return super.toString() +"\nAno de conclusão Pós graduação: " + getAnoConclusao();
    
    }
    
}
