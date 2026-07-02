package repository;

import database.DBConnection;
import entity.Barang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BarangRepositoryImpl implements BarangRepository {
    
    @Override
    public void insert(Barang barang) {
        String sql = "INSERT INTO barang (kode_barang, nama_barang, stok, harga) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, barang.getKodeBarang());
            ps.setString(2, barang.getNamaBarang());
            ps.setInt(3, barang.getStok());
            ps.setDouble(4, barang.getHarga());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Nanti kita ganti dengan Exception Handling yang lebih baik
        }
    }

    // Kamu akan menambahkan method update, delete, dan getAll di sini nanti
    @Override
    public void update(Barang barang) {}
    @Override
    public void delete(String kodeBarang) {}
    @Override
    public List<Barang> getAll() { return new ArrayList<>(); }
}