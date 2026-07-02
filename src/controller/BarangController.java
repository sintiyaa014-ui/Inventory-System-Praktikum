package controller;

import entity.Barang;
import service.BarangService;
import view.BarangView;

public class BarangController {
    private BarangView view;
    private BarangService service = new BarangService(); // Pastikan inisialisasi ini ada

    public BarangController(BarangView view) {
        this.view = view;
    }

    public void tambahBarang(String kode, String nama, int stok, double harga) {
        if (service != null) {
            Barang barang = new Barang(kode, nama, stok, harga);
            service.tambahBarang(barang);
        } else {
            System.err.println("Error: Service tidak terhubung!");
        }
    }
}