/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.produtoDAO;

import com.mycompany.projeto.usuarios.Usuario;
import com.mycompany.projeto.conxexaoDB.ConexaoDB;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    // SQL base com JOIN para trazer login do usuário e nome da categoria
    private static final String SELECT_BASE =
        "SELECT p.id, p.nome, p.quantidade, p.preco, p.usuario_id, " +
        "       u.login AS usuario_login, p.categoria_id, c.nome AS categoria_nome, p.criado_em " +
        "FROM produtos p " +
        "JOIN usuarios u    ON u.id = p.usuario_id " +
        "JOIN categorias c  ON c.id = p.categoria_id ";

    // --- Inserir ---
    public boolean inserir(Produto p) {
        String sql = "INSERT INTO produtos (nome, quantidade, preco, usuario_id, categoria_id) VALUES (?,?,?,?,?)";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, p.getNome());
            ps.setInt(2, p.getQuantidade());
            ps.setBigDecimal(3, p.getPreco());
            ps.setInt(4, p.getUsuarioId());
            ps.setInt(5, p.getCategoriaId());
            ps.executeUpdate();

            ResultSet ks = ps.getGeneratedKeys();
            if (ks.next()) p.setId(ks.getInt(1));
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // --- Atualizar ---
    public boolean atualizar(Produto p) {
        String sql = "UPDATE produtos SET nome=?, quantidade=?, preco=?, categoria_id=? WHERE id=?";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNome());
            ps.setInt(2, p.getQuantidade());
            ps.setBigDecimal(3, p.getPreco());
            ps.setInt(4, p.getCategoriaId());
            ps.setInt(5, p.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // --- Remover ---
    public boolean remover(int id) {
        String sql = "DELETE FROM produtos WHERE id=?";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // --- Listar todos ---
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        String sql = SELECT_BASE + "ORDER BY p.nome";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) lista.add(mapear(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // --- Buscar por nome (LIKE) ---
    public List<Produto> buscarPorNome(String nome) {
        List<Produto> lista = new ArrayList<>();
        String sql = SELECT_BASE + "WHERE p.nome LIKE ? ORDER BY p.nome";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) lista.add(mapear(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // --- Buscar por ID ---
    public Produto buscarPorId(int id) {
        String sql = SELECT_BASE + "WHERE p.id = ?";
        try (Connection con = ConexaoDB.getConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return mapear(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // --- Mapear ResultSet -> Produto ---
    private Produto mapear(ResultSet rs) throws SQLException {
        Produto p = new Produto();
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("nome"));
        p.setQuantidade(rs.getInt("quantidade"));
        p.setPreco(rs.getBigDecimal("preco"));
        p.setUsuarioId(rs.getInt("usuario_id"));
        p.setUsuarioLogin(rs.getString("usuario_login"));
        p.setCategoriaId(rs.getInt("categoria_id"));
        p.setCategoriaNome(rs.getString("categoria_nome"));
        p.setCriadoEm(rs.getTimestamp("criado_em"));
        return p;
    }
}