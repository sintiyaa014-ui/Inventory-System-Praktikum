package controller;
import entity.Barang;
import service.BarangService;
import view.BarangView;

public class BarangController {
    private final BarangService service = new BarangService();
    private BarangView view;

    public BarangController(BarangView view) {
        this.view = view;
    }

    public void tambahBarang(String kode, String nama, int stok, double harga) {
        Barang barang = new Barang(kode, nama, stok, harga);
        service.tambahBarang(barang);
        view.showMessage("Data berhasil disimpan!");
    }
}