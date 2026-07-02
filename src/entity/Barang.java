package entity;

public class Barang extends BaseEntity {
    private String kodeBarang;
    private String namaBarang;
    private int stok;
    private double harga;

    // Constructor
    public Barang(String kodeBarang, String namaBarang, int stok, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    // Getter
    public String getKodeBarang() { return kodeBarang; }
    public String getNamaBarang() { return namaBarang; }
    public int getStok() { return stok; }
    public double getHarga() { return harga; }

    // Implementasi Method Abstrak dari BaseEntity
    @Override
    public String getInfo() {
        return "Barang: " + this.namaBarang + " (Stok: " + this.stok + ")";
    }
}