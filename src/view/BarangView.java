package view;

import controller.BarangController;
import javax.swing.*;
import java.awt.*;

public class BarangView extends JFrame {
    private BarangController controller = new BarangController(this);
    private JTextField txtKode = new JTextField(10);
    private JTextField txtNama = new JTextField(10);
    private JButton btnSimpan = new JButton("Simpan");

    public BarangView() {
        setTitle("Inventory Barang");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Kode:")); add(txtKode);
        add(new JLabel("Nama:")); add(txtNama);
        add(btnSimpan);

        // Aksi tombol simpan dengan pesan debug
        btnSimpan.addActionListener(e -> {
    System.out.println("Tombol Simpan telah diklik!"); // TANDA 1
    String kode = txtKode.getText();
    String nama = txtNama.getText();
    
    // ... sisa kode ...
            
            // Validasi input
            if (kode.isEmpty() || nama.isEmpty()) {
                showMessage("Error: Kode dan Nama harus diisi!");
                return;
            }

            // Panggil Controller
            controller.tambahBarang(kode, nama, 0, 0.0);
            
            // Reset field
            txtKode.setText("");
            txtNama.setText("");
            
            // Feedback
            showMessage("Data barang berhasil disimpan!");
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void showMessage(String msg) { 
        JOptionPane.showMessageDialog(this, msg); 
    }
}