package repository;
import entity.Barang;
import java.util.List;

public interface BarangRepository {
    void save(Barang barang);
    void insert(Barang barang);
    void update(Barang barang);
    void delete(String kode);
    List<Barang> getAll();
}