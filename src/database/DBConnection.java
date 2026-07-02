package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Pastikan library MySQL Connector sudah terinstall
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi ke Database Berhasil!");
            } catch (SQLException e) {
                System.err.println("Gagal koneksi ke database: " + e.getMessage());
            }
        }
        return connection;
    }
}