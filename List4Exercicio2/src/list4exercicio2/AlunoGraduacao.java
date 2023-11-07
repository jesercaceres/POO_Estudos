package list4exercicio2;

public class AlunoGraduacao extends Aluno {
    
    private String anoConclusaoEnsinoMedio;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao( String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
    

    @Override
    public double calcularMedia() {
        
        return (getAc1() * 0.1) + (getAc2() * 0.3) + (getAg() * 0.2) + (getAf() * 0.4);
        
    }

    @Override
    public String verificarAprovacao() {
        
        if(calcularMedia() >= 5){
            return "Aluno Aprovado!";
        }
        
        
        return "Aluno Reprovado.";
        
    }
    
    public String toString(){
        return super.toString() + "\nAno de conclusão Ensino médio: " + getAnoConclusaoEnsinoMedio();
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
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
