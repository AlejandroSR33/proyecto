package vista.reservas;

import javax.swing.*;

public class Reserva {
    private JFrame ventanaReservas;
    private JPanel panelPrincipal;
    private JLabel labelPrueba;
    private JPanel panelInferior;
    private JButton botonSalir;
    private JButton botonCerrarSesion;
    private JPanel panelSuperior;
    private JTextField textoFecha;
    private JTextField textoDuracion;
    private JTextField textoHoraEntrada;
    private JTextField textoReserva;
    private JButton crearReservaButton;
    private JButton elimnarReservaButton;
    private JPanel panelDerecho;
    private JPanel panelCentral;
    private JButton Atras;
    private JButton Adelante;
    private JLabel campoNombre;

    public Reserva () {
        ventanaReservas = new JFrame("Aplicación reservas");
        ventanaReservas.setContentPane(panelPrincipal);
        ventanaReservas.setSize(500,400);
        ventanaReservas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaReservas.setLocationRelativeTo(null);
        // ventanaLogin.pack();
        ventanaReservas.setVisible(true);
    }

    public JFrame getVentanaReservas() {
        return ventanaReservas;
    }

    public JLabel getLabelPrueba() {
        return labelPrueba;
    }

    public static void main(String[] args) {
        new Reserva();
    }

    public JLabel getLabelNombre(){return campoNombre;}
}
