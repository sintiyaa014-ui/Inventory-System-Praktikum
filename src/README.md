# Inventory Management System

Aplikasi sistem inventaris sederhana yang dibangun untuk memenuhi tugas praktikum dengan prinsip **Layered Architecture**.

## Fitur Utama
- **Login Admin**: Sistem autentikasi untuk akses admin.
- **CRUD Barang**: Kelola data barang (Tambah, Lihat, Ubah, Hapus).
- **CRUD Supplier**: Kelola data supplier barang.
- **Laporan Stok**: Fitur untuk memantau ketersediaan barang.

## Persyaratan Sistem
- Java JDK 8 atau lebih baru.
- MySQL Server (XAMPP/WAMP/Laragon).
- MySQL Connector/J (JDBC).

## Cara Menjalankan
1. **Setup Database**:
   - Buka MySQL (melalui XAMPP/sejenisnya).
   - Buat database baru dengan nama `inventory_db`.
   - Impor file `database.sql` yang tersedia di repository ini ke dalam database tersebut.
2. **Konfigurasi**:
   - Pastikan MySQL Connector sudah terdaftar di *Build Path* proyek kamu.
3. **Run**:
   - Jalankan file `Main.java` melalui Visual Studio Code.

## Arsitektur Proyek
Aplikasi ini menggunakan pola *Layered Architecture*:
- `entity`: Representasi data.
- `repository`: Akses database.
- `service`: Logika bisnis.
- `controller`: Jembatan antara view dan service.
- `view`: Antarmuka pengguna (JFrame).
