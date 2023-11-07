package list4exercicio2;

public class AlunoPosGraduacao extends Aluno {

    private String anoConclusaoGraduacao;
    private double nota1;
    private double nota2;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String anoConclusaoGraduacao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    @Override
    public double calcularMedia() {
        return (nota1 + nota2)/2;
    }

    @Override
    public String verificarAprovacao() {
        if(calcularMedia() >= 5){
            return "Aprovado";
        }
        return "Reprovado";
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
            return super.toString() + "\nAno de conclusão Graduação: " + getAnoConclusaoGraduacao();
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
}
