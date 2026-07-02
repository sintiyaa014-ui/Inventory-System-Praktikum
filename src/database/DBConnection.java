package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Pengaturan koneksi
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    
    private static Connection connection = null;

    public static Connection getConnection() {
        // Cek apakah koneksi belum ada atau sudah tertutup
        try {
            if (connection == null || connection.isClosed()) {
                // Memuat driver (opsional di Java modern, tapi bagus untuk keamanan)
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Membuka koneksi baru
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi ke Database Berhasil!");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Gagal koneksi ke database: " + e.getMessage());
        }
        return connection;
    }
}