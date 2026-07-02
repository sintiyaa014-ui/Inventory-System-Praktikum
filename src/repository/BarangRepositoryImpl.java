package repository;

import entity.Barang;
import java.util.List;

public class BarangRepositoryImpl implements BarangRepository {

    @Override
    public void save(Barang barang) {
        // Logika untuk menyimpan
    }

    @Override
    public void insert(Barang barang) {
        // Logika untuk insert ke database
        System.out.println("Data berhasil di-insert");
    }

    @Override
    public void update(Barang barang) {
        // Logika untuk update
    }

    @Override
    public void delete(String kode) {
        // Logika untuk delete
    }

    @Override
    public List<Barang> getAll() {
        return null; // Sementara biarkan null
    }
}