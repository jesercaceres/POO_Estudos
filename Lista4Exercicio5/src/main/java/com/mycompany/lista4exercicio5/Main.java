/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista4exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        JOptionPane.showMessageDialog(null,"Matricula funcionario 1: " + funcionario.getMatriculaFuncionarios());
       
        Funcionario funcionario2 = new Funcionario();
        JOptionPane.showMessageDialog(null,"Matricula funcionario 2: " + funcionario2.getMatriculaFuncionarios());
        
        Funcionario funcionario3 = new Funcionario();
        JOptionPane.showMessageDialog(null,"Matricula funcionario 3: " + funcionario3.getMatriculaFuncionarios());
        
        JOptionPane.showMessageDialog(null,"Quantidade de funcionarios: " + Funcionario.getQtdFuncionarios());
                
        
    }
}
