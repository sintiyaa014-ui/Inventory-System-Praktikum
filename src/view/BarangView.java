package view;

import controller.BarangController;
import javax.swing.*;
import java.awt.*;

public class BarangView extends JFrame {
    private BarangController controller = new BarangController(this);
    
    // Komponen UI
    private JTextField txtKode = new JTextField(10);
    private JTextField txtNama = new JTextField(10);
    private JTextField txtStok = new JTextField(10);
    private JTextField txtHarga = new JTextField(10);
    private JButton btnSimpan = new JButton("Simpan");

    public BarangView() {
        setTitle("Inventory Barang");
        setLayout(new GridLayout(5, 2, 5, 5)); // Menggunakan GridLayout agar lebih rapi
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Kode:")); add(txtKode);
        add(new JLabel("Nama:")); add(txtNama);
        add(new JLabel("Stok:")); add(txtStok);
        add(new JLabel("Harga:")); add(txtHarga);
        add(btnSimpan);

        // Aksi tombol simpan
        btnSimpan.addActionListener(e -> prosesSimpan());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void prosesSimpan() {
        String kode = txtKode.getText().trim();
        String nama = txtNama.getText().trim();
        
        try {
            // Validasi Input
            if (kode.isEmpty() || nama.isEmpty()) {
                showMessage("Error: Kode dan Nama harus diisi!");
                return;
            }

            int stok = Integer.parseInt(txtStok.getText());
            double harga = Double.parseDouble(txtHarga.getText());

            // Panggil Controller
            controller.tambahBarang(kode, nama, stok, harga);
            
            // Reset form
            txtKode.setText("");
            txtNama.setText("");
            txtStok.setText("");
            txtHarga.setText("");
            
        } catch (NumberFormatException ex) {
            showMessage("Error: Stok dan Harga harus berupa angka!");
        }
    }

    public void showMessage(String msg) { 
        JOptionPane.showMessageDialog(this, msg); 
    }
}