package entity;

public class Barang extends BaseEntity {
    // 1. Tambahkan atribut kembali
    private String kodeBarang;
    private String namaBarang;
    private int stok;
    private double harga;

    // 2. Tambahkan Constructor (penting untuk Controller)
    public Barang(String kodeBarang, String namaBarang, int stok, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    // 3. Tambahkan Getter agar error "undefined" hilang
    public String getKodeBarang() { return kodeBarang; }
    public String getNamaBarang() { return namaBarang; }
    public int getStok() { return stok; }
    public double getHarga() { return harga; }

    @Override
    public String getInfo() {
        return "Barang: " + this.namaBarang;
    }
}