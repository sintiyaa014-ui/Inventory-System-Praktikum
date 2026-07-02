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
        setLayout(new FlowLayout());
        add(new JLabel("Kode:")); add(txtKode);
        add(new JLabel("Nama:")); add(txtNama);
        add(btnSimpan);

        btnSimpan.addActionListener(e -> {
            controller.tambahBarang(txtKode.getText(), txtNama.getText(), 0, 0.0);
        });
        pack(); setVisible(true);
    }

    public void showMessage(String msg) { JOptionPane.showMessageDialog(this, msg); }
    public void refreshTable() { /* Logic refresh */ }
}