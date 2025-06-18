/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class Conexao {

    public static Connection getConexao() {

        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipamentos","root", "");
            // JOptionPane.showMessageDialog(null, "Deu certo ");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexao;
    }
}