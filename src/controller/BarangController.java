package controller;

import entity.Barang;
import service.BarangService;

public class BarangController {
    private final BarangService service = new BarangService();

    public void tambahBarang(String kode, String nama, int stok, double harga) {
        try {
            Barang barang = new Barang(kode, nama, stok, harga);
            service.tambahBarang(barang);
        } catch (Exception e) {
            System.err.println("Error di Controller: " + e.getMessage());
        }
    }
}