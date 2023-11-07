package lista4exercicio3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao();

        int opcaoSelecionada;
        do {
            String[] vetorOpcoes = {"Inserir Aluno", "Exibir Aluno", "Sair"};

            opcaoSelecionada = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.INFORMATION_MESSAGE, null, vetorOpcoes, vetorOpcoes[0]);

            switch (opcaoSelecionada) {

                case 0:
                    String studentSelected;
                    String[] vetorAlunos = {"Inserir Aluno Graduação", "Inserir Aluno Pós-Graduação"};
                    studentSelected = (String) JOptionPane.showInputDialog(null, "Selecione o Aluno a ser inserido:", "Selecione uma opção: ", JOptionPane.INFORMATION_MESSAGE, null, vetorAlunos, vetorAlunos[0]);

                    if (studentSelected.equals("Inserir Aluno Graduação")) {
                        String ra = JOptionPane.showInputDialog("Informe o RA: ");
                        String nome = JOptionPane.showInputDialog("Nome: ");
                        String curso = JOptionPane.showInputDialog("Informe o Curso: ");
                        String anoConclusao = JOptionPane.showInputDialog("Informe o ano de conclusão: ");

                        alunoGraduacao.setRa(ra);
                        alunoGraduacao.setNome(nome);
                        alunoGraduacao.setCurso(curso);
                        alunoGraduacao.setAnoConclusao(anoConclusao);

                        double ac1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da AC1: "));
                        double ac2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da AC2: "));
                        double af = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da AF"));
                        double ag = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da AG"));

                        alunoGraduacao.setAc1(ac1);
                        alunoGraduacao.setAc2(ac2);
                        alunoGraduacao.setAf(af);
                        alunoGraduacao.setAg(ag);

                        break;

                    } else if (studentSelected.equals("Inserir Aluno Pós-Graduação")) {

                        String ra = JOptionPane.showInputDialog("Informe o RA: ");
                        String nome = JOptionPane.showInputDialog("Nome: ");
                        String curso = JOptionPane.showInputDialog("Informe o Curso: ");
                        String anoConclusaoGraduacao = JOptionPane.showInputDialog("Informe o ano de Graduação: ");

                        alunoPosGraduacao.setRa(ra);
                        alunoPosGraduacao.setNome(nome);
                        alunoPosGraduacao.setCurso(curso);
                        alunoPosGraduacao.setAnoConclusao(anoConclusaoGraduacao);

                        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
                        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota:"));

                        alunoPosGraduacao.setNota1(nota1);
                        alunoPosGraduacao.setNota2(nota2);

                    }

                case 1:

                    JOptionPane.showMessageDialog(null, alunoGraduacao.toString(), "Dados do Aluno Graduação: ", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, alunoGraduacao.calcularMedia(), "Média: ", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, alunoGraduacao.verificarAprovacao(), "Situação: ", JOptionPane.INFORMATION_MESSAGE);

                    JOptionPane.showMessageDialog(null, alunoPosGraduacao.toString(), "Dados do Aluno Pós-Graduação: ", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, alunoPosGraduacao.calcularMedia(), "Média: ", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, alunoPosGraduacao.verificarAprovacao(), "Situação: ", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (opcaoSelecionada != 2);

    }

}
