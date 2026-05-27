/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.usuarioDAO;

import com.mycompany.projeto.usuarios.Usuario;
import com.mycompany.projeto.conxexaoDB.ConexaoDB;

import java.security.MessageDigest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {

    // --- Utilitário SHA-256 ---
    public static String sha256(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(texto.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar hash", e);
        }
    }

    // --- Autenticar ---
    public Usuario autenticar(String login, String senha) {
        String sql = "SELECT id, login, senha, criado_em FROM usuarios WHERE login = ? AND senha = ?";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, login);
            ps.setString(2, sha256(senha));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return mapear(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // --- Cadastrar ---
    public boolean cadastrar(Usuario u) {
        if (loginExiste(u.getLogin())) return false;

        String sql = "INSERT INTO usuarios (login, senha) VALUES (?, ?)";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, u.getLogin());
            ps.setString(2, sha256(u.getSenha()));
            ps.executeUpdate();

            ResultSet ks = ps.getGeneratedKeys();
            if (ks.next()) u.setId(ks.getInt(1));
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // --- Verificar unicidade do login ---
    public boolean loginExiste(String login) {
        String sql = "SELECT id FROM usuarios WHERE login = ?";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, login);
            return ps.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // --- Listar todos ---
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT id, login, senha, criado_em FROM usuarios ORDER BY login";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) lista.add(mapear(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Usuario mapear(ResultSet rs) throws SQLException {
        return new Usuario(
            rs.getInt("id"),
            rs.getString("login"),
            rs.getString("senha"),
            rs.getTimestamp("criado_em")
        );
    }
}