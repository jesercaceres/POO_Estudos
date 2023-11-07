package com.mycompany.exercicio3deoutubro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        List<Disciplina> disciplinasCriadas = new ArrayList<Disciplina>();

        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Atendente atendente = new Atendente();

        String[] itens = {"Inserir Disciplina", "Inserir Professor", "Inserir Atendente",
            "Inserir Aluno", "Adicionar Disciplina ao Professor", "Mostrar Pessoas", "Sair"};

        String opcaoSelecionada;

        do {
            Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um item", "Menu",
                    JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

            if (selectedValue != null) {
                opcaoSelecionada = (String) selectedValue;

                switch (opcaoSelecionada) {

                    case "Inserir Disciplina":
                        Disciplina disciplina = new Disciplina();

                        int codigoDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da disciplina"));
                        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina");

                        disciplina.setCodigo(codigoDisciplina);
                        disciplina.setNome(nomeDisciplina);

                        disciplinasCriadas.add(disciplina);

                        break;

                    case "Inserir Professor":
                        if (disciplinasCriadas.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Impossível cadastrar professor pois não possuí disciplinas cadastradas.");
                            continue;
                        }

                        //Professor professor = new Professor();
                        String nome = JOptionPane.showInputDialog("Informe o nome do Professor: ");
                        String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
                        String urlCurriculoLattes = JOptionPane.showInputDialog("URL Currículo Lattes: ");
                        int numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Número do crachá: "));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Professor: "));

                        professor = new Professor(urlCurriculoLattes, nome, cpf, numeroCracha, salario);

                        break;

                    case "Inserir Atendente":
                        String nomeAtendente = JOptionPane.showInputDialog("Informe o nome: ");
                        String cpfAtendente = JOptionPane.showInputDialog("CPF: ");
                        int numeroCrachaAtendente = Integer.parseInt(JOptionPane.showInputDialog("Numero do Crachá: "));
                        double salarioAtendente = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário: "));
                        String setorAtendente = JOptionPane.showInputDialog("Setor: ");
                        String funcaoAtendente = JOptionPane.showInputDialog("Funcão: ");

                        atendente = new Atendente(nomeAtendente, cpfAtendente, numeroCrachaAtendente, salarioAtendente, setorAtendente, funcaoAtendente);

                        break;

                    case "Inserir Aluno":
                        String nomeAluno = JOptionPane.showInputDialog("Informe o nome do Aluno:");
                        String alunoRA = JOptionPane.showInputDialog("Informe o RA:");
                        String cursoAluno = JOptionPane.showInputDialog("Curso: ");
                        String AlunoCPF = JOptionPane.showInputDialog("CPF do Aluno: ");

                        aluno = new Aluno(alunoRA, cursoAluno, nomeAluno, AlunoCPF);
                        break;

                    case "Adicionar Disciplina ao Professor":
                        //Convertendo o ArrayList DisciplnasCriadas para vetor, pois o Joptionpane abaixo só aceita vetor e não List.
                        Disciplina[] discVector = disciplinasCriadas.toArray(new Disciplina[disciplinasCriadas.size()]);

                        int continuar = 0;

                        do {
                            Disciplina selectedDisc = (Disciplina) JOptionPane.showInputDialog(null, "Selecione as disciplinas: ", "Menu",
                                    JOptionPane.INFORMATION_MESSAGE, null, discVector, discVector[0]);

                            professor.addDisciplina(selectedDisc);

                            //continuar = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais alguma disciplina?");
                            continuar = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais alguma disciplina?", "Escolha", continuar);
                            JOptionPane.showMessageDialog(null, professor.toString());
                        } while (continuar == 0);

                        break;

                    case "Mostrar Pessoas":
                        JOptionPane.showMessageDialog(null, professor.toString(), "Dados do Professor", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, atendente.toString(), "Dados da Atendente", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, aluno.toString(), "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Sair":
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                }
            } else {
                opcaoSelecionada = "Sair"; // Se o usuário clicar em Cancelar ou fechar a janela, sair do loop
            }

        } while (!opcaoSelecionada.equals("Sair"));

    }

}
