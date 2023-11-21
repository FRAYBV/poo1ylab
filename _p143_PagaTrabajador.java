import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p143_PagaTrabajador extends JFrame implements ActionListener {

    private JTextField txtNombre, txtHoras, txtPaga;
    private JButton btnCalcularPaga, btnSalir;

    public _p143_PagaTrabajador() {
        super("Calculadora de Paga de Trabajador");

        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre del Trabajador:");
        lblNombre.setBounds(15, 25, 200, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(220, 20, 150, 30);
        add(txtNombre);

        JLabel lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(10, 60, 200, 30);
        add(lblHoras);

        txtHoras = new JTextField();
        txtHoras.setBounds(220, 60, 150, 30);
        add(txtHoras);

        JLabel lblPaga = new JLabel("Paga por hora:");
        lblPaga.setBounds(10, 100, 200, 30);
        add(lblPaga);

        txtPaga = new JTextField();
        txtPaga.setBounds(220, 100, 150, 30);
        add(txtPaga);

        btnCalcularPaga = new JButton("Calcular Paga");
        btnCalcularPaga.setBounds(10, 140, 150, 40);
        add(btnCalcularPaga);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(10, 190, 150, 40);
        add(btnSalir);

        btnCalcularPaga.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcularPaga) {
            calcularPagaTrabajador();
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    private void calcularPagaTrabajador() {
        String nombre = txtNombre.getText();
        int horas = Integer.parseInt(txtHoras.getText());
        double paga = Double.parseDouble(txtPaga.getText());
        double tasa = 0.03;

        double pagabruta = horas * paga;
        double impuesto = pagabruta * tasa;
        double paganeta = pagabruta - impuesto;

        String resultado = String.format("El trabajador %s trabajó %d horas, a una paga de %.2f pesos la hora, con una tasa de impuestos de %.2f\n" +
                        "Paga bruta = %.2f\nImpuestos = %.2f\nPaga Neta = %.2f",
                nombre, horas, paga, tasa, pagabruta, impuesto, paganeta);

        JOptionPane.showMessageDialog(this, resultado, "Resumen de Pago", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        _p143_PagaTrabajador app = new _p143_PagaTrabajador();
        app.setBounds(10, 10, 400, 280);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}