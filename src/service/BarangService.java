package service;

import entity.Barang;
import repository.BarangRepository;
import repository.BarangRepositoryImpl;

public class BarangService {
    private BarangRepository repository = new BarangRepositoryImpl();

    public void tambahBarang(Barang barang) {
        repository.insert(barang); // Pastikan memanggil insert
    }
} // Tanda kurung ini menutup class BarangService