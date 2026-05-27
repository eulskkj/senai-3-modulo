/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.conxexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Gerenciador de conexão com o MySQL — padrão Singleton.
 * Altere URL, USER e PASSWORD conforme seu ambiente.
 */
public class ConexaoDB {

    private static final String URL    = "jdbc:mysql://localhost:3306/estoque_db?useSSL=false&serverTimezone=America/Fortaleza";
    private static final String USER   = "root";
    private static final String PASS   = "";          // altere aqui se o seu banco tiver senha

    private static Connection conexao = null;

    // Construtor privado corrigido para o padrão PascalCase
    private ConexaoDB() {}

    public static Connection getConexao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                "Driver MySQL não encontrado!\nAdicione o conector JDBC ao projeto.",
                "Erro de Driver", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Erro ao conectar ao banco de dados:\n" + e.getMessage(),
                "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        }
        return conexao;
    }

    public static void fecharConexao() {
        if (conexao != null) {
            try { 
                if (!conexao.isClosed()) {
                    conexao.close(); 
                }
            } catch (SQLException e) { 
                e.printStackTrace(); 
            }
        }
    }
}