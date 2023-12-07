package _p148_ExamenExtraordinario;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;


public class App extends JFrame implements ActionListener {
    ArrayList<Producto> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla,pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblTipoPago,lblClave,lblCantidad,lblUnidadMedida,lblDescripcion,lblPrecio;
    JTextField txtTipoPago,txtClave,txtCantidad,txtUnidadMedida,txtDescripcion,txtPrecio;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    public App() {
        super("Datos Productos");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
        jdlAcercaDe = new JDialog(this,"Acerca de ..");
        jdlAcercaDe.setSize(300,250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Tienda<br>AYFR</html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla,BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.green);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"TipoPago","Clave","Cantidad","UnidadMedida","Descripcion","Precio"});
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 8, 0, 0));
        lblTipoPago = new JLabel("TipoPago");
        lblTipoPago.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTipoPago = new JTextField();
        pnlDatos.add(lblTipoPago);
        pnlDatos.add(txtTipoPago);
        lblClave = new JLabel("Clave");
        lblClave.setHorizontalAlignment(SwingConstants.RIGHT);
        txtClave = new JTextField();
        pnlDatos.add(lblClave);
        pnlDatos.add(txtClave);
        lblCantidad = new JLabel("Cantidad");
        lblCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad = new JTextField();
        pnlDatos.add(lblCantidad);
        pnlDatos.add(txtCantidad);
        lblUnidadMedida = new JLabel("UnidadMedida");
        lblUnidadMedida.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadMedida = new JTextField();
        pnlDatos.add(lblUnidadMedida);
        pnlDatos.add(txtUnidadMedida);
        lblDescripcion = new JLabel("Descripcion");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblPrecio = new JLabel("Precio");
        lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecio = new JTextField();
        pnlDatos.add(lblPrecio);
        pnlDatos.add(txtPrecio);
        JPanel pnlBotones = new JPanel();

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if(e.getSource()== smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.desSerializarDatos(arch.getName());
                    this.cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if(e.getSource()== smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.serializarDatos(arch.getName(),datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                    arch.getName(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if(e.getSource()==btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if(e.getSource()==btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        while(dm.getRowCount()>0) dm.removeRow(0);
        Object[] obj = new Object[6];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getTipoPago();
            obj[1] = datos.get(i).getClave();
            obj[2] = datos.get(i).getCantidad();
            obj[3] = datos.get(i).getUnidadMedida();
            obj[4] = datos.get(i).getDescripcion();
            obj[5] = datos.get(i).getPrecio();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {
        txtTipoPago.setText(datos.get(ren).getTipoPago());
        txtClave.setText(Integer.toString((datos.get(ren).getClave())));
        txtCantidad.setText(Float.toString((datos.get(ren).getCantidad())));
        txtUnidadMedida.setText(datos.get(ren).getUnidadMedida());
        txtDescripcion.setText(datos.get(ren).getDescripcion());
        txtPrecio.setText(Float.toString((datos.get(ren).getPrecio())));
    }
    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
        if(cp instanceof JTextField)
        cp.setEnabled(actdes);
    }
    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
        if(cp instanceof JTextField)
        ((JTextField)cp).setText("");
    }
    public void guardarCampos() {
        Producto est = new Producto();
        est.setTipoPago( txtTipoPago.getText() );
        est.setClave( Integer.parseInt(txtClave.getText() ));
        est.setCantidad( Float.parseFloat(txtCantidad.getText()) );
        est.setUnidadMedida( txtUnidadMedida.getText() );
        est.setDescripcion( txtDescripcion.getText() );
        est.setPrecio( Float.parseFloat(txtPrecio.getText()) );
        datos.add(est);
        cargarDatos();
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);
    }
}