import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p144_Temperaturas extends JFrame implements ActionListener {

    private JTextField txtTemperatura;
    private JRadioButton rbtFahrenheit, rbtCelsius;
    private JButton btnConvertir, btnSalir;

    public _p144_Temperaturas() {
        super("Convertir Temperatura");

        setLayout(new FlowLayout());
        JLabel lblTemperatura = new JLabel("Temperatura:");
        txtTemperatura = new JTextField(10);

        rbtFahrenheit = new JRadioButton("Fahrenheit");
        rbtCelsius = new JRadioButton("Celsius");

        ButtonGroup grupoOpciones = new ButtonGroup();
        grupoOpciones.add(rbtFahrenheit);
        grupoOpciones.add(rbtCelsius);

        btnConvertir = new JButton("Convertir");
        btnSalir = new JButton("Salir");
        add(lblTemperatura);
        add(txtTemperatura);
        add(rbtFahrenheit);
        add(rbtCelsius);
        add(btnConvertir);
        add(btnSalir);
        btnConvertir.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConvertir) {
            convertirTemperatura();
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    private void convertirTemperatura() {
        try {
            double temperatura = Double.parseDouble(txtTemperatura.getText());

            if (rbtFahrenheit.isSelected()) {
                double celsius = (temperatura - 32) * 5 / 9;
                JOptionPane.showMessageDialog(this,
                        String.format("%.2f Fahrenheit es igual a %.2f Celsius", temperatura, celsius), "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (rbtCelsius.isSelected()) {
                double fahrenheit = (temperatura * 9 / 5) + 32;
                JOptionPane.showMessageDialog(this,
                        String.format("%.2f Celsius es igual a %.2f Fahrenheit", temperatura, fahrenheit), "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona una opción (Fahrenheit o Celsius)", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese una temperatura válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        _p144_Temperaturas app = new _p144_Temperaturas();
        app.setBounds(10, 10, 300, 160);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}