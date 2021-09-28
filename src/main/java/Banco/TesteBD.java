package Banco;

import java.sql.*;

public class TesteBD {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_261a2d63dd4af43";
        String user = "ba7d29a5157c64";
        String password = "59e18a4a";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM `Usuarios`";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getLong("id_usuario"));
                System.out.println(result.getString("nome"));
            }
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

