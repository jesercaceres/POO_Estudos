package lista4exercicio4;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao();

        String[] vetorOpcoes = {"Inserir Aluno", "Exibir Alunos", "Sair"};
        String opcaoSelecionada;
        do {
            opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione uma opção: ", "Menu",
                    JOptionPane.INFORMATION_MESSAGE, null, vetorOpcoes, vetorOpcoes[0]);

            switch (opcaoSelecionada) {

                case "Inserir Aluno":

                    String[] vetorEstudantes = {"Aluno Graduação", "Aluno pós-graduação"};

                    int selectedStudent = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Seleção de Aluno",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, vetorEstudantes, vetorEstudantes[0]);

                    if (vetorEstudantes[selectedStudent].equals("Aluno Graduação")) {
                        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                        String ra = JOptionPane.showInputDialog("Informe o RA: ");
                        String curso = JOptionPane.showInputDialog("Informe o curso: ");
                        String anoConclusaoEnsinoMedio = JOptionPane.showInputDialog("Ano de conclusão do ensino médio: ");

                        alunoGraduacao.setNome(nome);
                        alunoGraduacao.setRa(ra);
                        alunoGraduacao.setCurso(curso);
                        alunoGraduacao.setAnoConclusaoEnsinoMedio(anoConclusaoEnsinoMedio);

                    } else if (vetorEstudantes[selectedStudent].equals("Aluno pós-graduação")) {
                        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                        String ra = JOptionPane.showInputDialog("Informe o RA: ");
                        String curso = JOptionPane.showInputDialog("Informe o curso: ");
                        String anoConclusaoPos = JOptionPane.showInputDialog("Ano de conclusão Pós-graduação: ");

                        alunoPos.setNome(nome);
                        alunoPos.setRa(ra);
                        alunoPos.setCurso(curso);
                        alunoPos.setAnoConclusao(anoConclusaoPos);

                    } else {
                        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                        String ra = JOptionPane.showInputDialog("Informe o RA: ");
                        String curso = JOptionPane.showInputDialog("Informe o curso: ");
                        
                        aluno.setNome(nome);
                        aluno.setRa(ra);
                        aluno.setCurso(curso);
                    }

                    break;

                case "Exibir Alunos":

                    JOptionPane.showMessageDialog(null, alunoGraduacao.toString(), "Dados do Aluno Graduação: ", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, alunoPos.toString(), "Dados do Aluno Pós-Graduação: ", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, aluno.toString(), "Dados do Aluno: ", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Sair":
                    // Encerra o programa.
                    break;
            }

        } while (!opcaoSelecionada.equals("Sair"));
    }
}
