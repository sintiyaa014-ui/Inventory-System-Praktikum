package repository;

import entity.Barang;
import java.util.List;

public interface BarangRepository {
    void insert(Barang barang);
    void update(Barang barang);
    void delete(String kode);
    List<Barang> getAll();
}