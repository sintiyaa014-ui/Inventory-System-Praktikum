package repository;
import entity.Barang;
import java.util.List;

public class BarangRepositoryImpl implements BarangRepository {
    @Override public void save(Barang barang) { /* Logic SQL Save */ }
    @Override public void insert(Barang barang) { /* Logic SQL Insert */ }
    @Override public void update(Barang barang) { /* Logic SQL Update */ }
    @Override public void delete(String kode) { /* Logic SQL Delete */ }
    @Override public List<Barang> getAll() { return null; }
}