package entity;

public class Barang extends BaseEntity {
    private String namaBarang;
    private int stok;
    private double harga;

    public Barang(String kode, String nama, int stok, double harga) {
        super(kode); // Mengirim 'kode' ke constructor BaseEntity (sebagai id)
        this.namaBarang = nama;
        this.stok = stok;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getKodeBarang() { return id; } // Menggunakan 'id' dari BaseEntity
    public String getNamaBarang() { return namaBarang; }
    public int getStok() { return stok; }
    public double getHarga() { return harga; }
}