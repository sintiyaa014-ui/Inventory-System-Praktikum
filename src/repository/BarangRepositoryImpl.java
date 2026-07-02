package repository;

import entity.Barang;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            // Baris debug diletakkan di sini, di dalam try block setelah eksekusi
            System.out.println("DEBUG: Query INSERT dijalankan!"); 
            System.out.println("Data berhasil disimpan ke database!");
        } catch (SQLException e) {
            System.err.println("Gagal menyimpan data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void update(Barang barang) {
        String sql = "UPDATE barang SET nama_barang = ?, stok = ?, harga = ? WHERE kode_barang = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, barang.getNamaBarang());
            ps.setInt(2, barang.getStok());
            ps.setDouble(3, barang.getHarga());
            ps.setString(4, barang.getKodeBarang());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String kode) {
        String sql = "DELETE FROM barang WHERE kode_barang = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, kode);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Barang> getAll() {
        List<Barang> list = new ArrayList<>();
        String sql = "SELECT * FROM barang";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Barang(
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getInt("stok"),
                    rs.getDouble("harga")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}