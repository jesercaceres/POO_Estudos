package lista4exercicio3;

public class AlunoGraduacao implements Aluno {

    private String ra;
    private String nome;
    private String curso;
    private String anoConclusao;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusao) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.anoConclusao = anoConclusao;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularMedia() {

        return (getAc1() * 0.1) + (getAc2() * 0.3) + (getAg() * 0.2) + (getAf() * 0.4);

    }

    @Override
    public String verificarAprovacao() {

        if (calcularMedia() >= 5) {
            return "Aluno Aprovado!";
        }

        return "Aluno Reprovado.";

    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRA: " + getRa() + "\nCurso: " + getCurso()
                + "\nAno de conclusão: " + getAnoConclusao();

    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }

}
