package view;

import controller.BarangController;
import javax.swing.*;
import java.awt.*;

public class BarangView extends JFrame {
    private final BarangController controller = new BarangController();
    
    // Komponen UI
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

        btnSimpan.addActionListener(e -> {
            // Memanggil controller, bukan database langsung
            controller.tambahBarang(txtKode.getText(), txtNama.getText(), 0, 0.0);
            JOptionPane.showMessageDialog(this, "Berhasil disimpan!");
        });

        pack();
        setVisible(true);
    }
}