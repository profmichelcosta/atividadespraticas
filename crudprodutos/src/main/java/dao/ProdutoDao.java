/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDao {

    private static final String URL = "jdbc:mysql://localhost:3306/venda";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    
    Connection connection;
    public Connection conexao(){
        try {    
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void fecharConexao(){
        try {    
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
     /*public static void main(String[] args) {
       try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            insertProduto(connection, "Batata", "Batava Inglesa granel", 11.99);
            insertProduto(connection, "Pepino", "granel", 9.99);
            insertProduto(connection, "Laranja", "granel", 8.99);
            selectProduto(connection);
            updateProduto(connection, 1, "Achocolatado em pó solúvel", 16.99);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    public void insertProduto(Connection connection, String nome, String descricao, double preco) 
            throws SQLException {
        String insertQuery = "INSERT INTO produtos (nome, descricao, preco) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
            statement.setString(1, nome);
            statement.setString(2, descricao);
            statement.setDouble(3, preco);
            statement.executeUpdate();
        }
    }

    public void selectProduto(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM produtos";
        try (PreparedStatement statement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                double preco = resultSet.getDouble("preco");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Descrição: " + descricao + ", "
                        + "Preço: " + preco);
            }
        }
    }

    public void updateProduto(Connection connection, int productId, String nome, double preco) 
            throws SQLException {
        String updateQuery = "UPDATE produtos SET nome = ?, preco = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setString(1, nome);
            statement.setDouble(2, preco);
            statement.setInt(3, productId);
            statement.executeUpdate();
        }
    }

    public void deleteProduto(Connection connection, int productId) throws SQLException {
        String deleteQuery = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
            statement.setInt(1, productId);
            statement.executeUpdate();
        }
    }
}
