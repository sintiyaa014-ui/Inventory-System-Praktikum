package controller;

import entity.Barang;
import service.BarangService;
import view.BarangView;

public class BarangController {
    private BarangView view;
    private BarangService service = new BarangService();

    public BarangController(BarangView view) {
        this.view = view;
    }

    public void tambahBarang(String kode, String nama, int stok, double harga) {
        try {
            Barang barang = new Barang(kode, nama, stok, harga);
            service.tambahBarang(barang);
            view.showMessage("Data berhasil disimpan!");
        } catch (Exception e) {
            view.showMessage("Error: " + e.getMessage());
        }
    }
}