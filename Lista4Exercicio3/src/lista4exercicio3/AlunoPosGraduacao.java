package lista4exercicio3;

public class AlunoPosGraduacao extends AlunoGraduacao implements Aluno {

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

    private double nota1;
    private double nota2;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusao) {
        super(ra, nome, curso, anoConclusao);
    }

    @Override
    public double calcularMedia() {
        return (getNota1() + getNota2()) / 2;
    }

    @Override
    public String verificarAprovacao() {

        return super.verificarAprovacao();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
