CREATE DATABASE inventory_db;
USE inventory_db;

CREATE TABLE admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE supplier (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama_supplier VARCHAR(100) NOT NULL,
    kontak VARCHAR(50),
    alamat TEXT
);

CREATE TABLE barang (
    kode_barang VARCHAR(20) PRIMARY KEY,
    nama_barang VARCHAR(100) NOT NULL,
    stok INT DEFAULT 0,
    harga DECIMAL(10, 2)
);