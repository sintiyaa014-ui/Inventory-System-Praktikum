package controller;

import entity.Barang;
import service.BarangService;
import view.BarangView;

public class BarangController {
    // Referensi ke View agar Controller bisa memerintahkan View menampilkan pesan
    private BarangView view;
    // Inisialisasi Service untuk memproses logika bisnis
    private BarangService service = new BarangService();

    // Konstruktor yang menghubungkan Controller dengan View
    public BarangController(BarangView view) {
        this.view = view;
    }

    // Method utama untuk tambah barang
    public void tambahBarang(String kode, String nama, int stok, double harga) {
        try {
            // 1. Membuat object entity
            Barang barang = new Barang(kode, nama, stok, harga);
            
            // 2. Memanggil layer service
            service.tambahBarang(barang);
            
            // 3. Memberikan feedback sukses ke View
            if (view != null) {
                view.showMessage("Data berhasil disimpan!");
            }
        } catch (Exception e) {
            // 4. Menangkap error agar aplikasi tidak crash
            if (view != null) {
                view.showMessage("Error: " + e.getMessage());
            } else {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}