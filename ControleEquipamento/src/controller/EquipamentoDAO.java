package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Equipamento;

/**
 *
 * @author karen
 */
public class EquipamentoDAO {
    
    Connection conexao = Conexao.getConexao();
    
     public void CadastrarEquipamento(Equipamento equipamento) throws SQLException {
       // Connection conexao = Conexao.getConexao();

        String sql = "INSERT INTO tbl_equipamentos(nome,descricao,quantidade,marca,sala,estadoConservacao,patrimonio)VALUES(?,?,?,?,?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setString(1, equipamento.getNome());
        ps.setString(2, equipamento.getDescricao());
        ps.setInt(3, equipamento.getQuantidade());
        ps.setString(4, equipamento.getMarca());
        ps.setInt(5, equipamento.getSala());
        ps.setString(6, equipamento.getEstadoConservacao());
        ps.setString(7,equipamento.getPatrimonio());
    
        ps.execute();
    }
     
     public void pesquisar(Equipamento equipamento) throws SQLException {
        Connection con = null;
        //Connection conexao = Conexao.getConexao();
        String sql = "SELECT * FROM tbl_equipamentos where patrimonio=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, equipamento.getPatrimonio());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            equipamento.setNome(rs.getString(2));
            equipamento.setDescricao(rs.getString(3));
            equipamento.setMarca(rs.getString(4));
        }
    
     }
     
  public void excluir(Equipamento equipamento) throws SQLException {
    String sql = "DELETE FROM tbl_equipamentos WHERE patrimonio = ?";
    try (PreparedStatement ps = conexao.prepareStatement(sql)) {
        ps.setString(1, equipamento.getPatrimonio().trim());
        int linhasAfetadas = ps.executeUpdate();
        System.out.println("Linhas removidas: " + linhasAfetadas);
    }

}

       
    public void alterar(Equipamento equipamento) throws SQLException {
       // Connection conexao = Conexao.getConexao();

        String sql = "UPDATE INTO tbl_equipamentos(nome,descricao,quantidade,marca,sala,estadoConservacao,patrimonio)VALUES(?,?,?,?,?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setString(1, equipamento.getNome());
        ps.setString(2, equipamento.getDescricao());
        ps.setInt(3, equipamento.getQuantidade());
        ps.setString(4, equipamento.getMarca());
        ps.setInt(5, equipamento.getSala());
        ps.setString(6, equipamento.getEstadoConservacao());
        ps.setString(7,equipamento.getPatrimonio());
    
        ps.execute();
    }
    
    public void pesquisarSala(Equipamento equipamento) throws SQLException {
        Connection con = null;
        //Connection conexao = Conexao.getConexao();
        String sql = "SELECT * FROM tbl_equipamentos where sala=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setInt(1, equipamento.getSala());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            equipamento.setNome(rs.getString(2));
            equipamento.setDescricao(rs.getString(3));
            equipamento.setMarca(rs.getString(4));
        }
    }
    
}