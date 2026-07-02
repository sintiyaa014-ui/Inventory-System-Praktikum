package service;

import entity.Barang;
import repository.BarangRepository;
import repository.BarangRepositoryImpl;
import java.util.List;

public class BarangService {
    private final BarangRepository repository = new BarangRepositoryImpl();

    public void tambahBarang(Barang barang) {
        // Contoh validasi (Logika Bisnis)
        if (barang.getNamaBarang() == null || barang.getNamaBarang().isEmpty()) {
            throw new IllegalArgumentException("Nama barang tidak boleh kosong!");
        }
        
        repository.insert(barang);
        System.out.println("Barang berhasil ditambahkan.");
    }

    public List<Barang> ambilSemuaBarang() {
        return repository.getAll();
    }
}