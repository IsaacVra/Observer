package app;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JPanel panel;
    private SujetoColor sujeto;

    public VentanaPrincipal() {
        setTitle("Colores");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        sujeto = new SujetoColor();
        sujeto.agregarObservador(new ObservadorConsola());

        panel = new JPanel();
        add(panel);

        JButton rojo = new JButton("Rojo");
        JButton verde = new JButton("Verde");
        JButton azul = new JButton("Azul");

        rojo.addActionListener(e -> cambiarFondo(Color.RED));
        verde.addActionListener(e -> cambiarFondo(Color.GREEN));
        azul.addActionListener(e -> cambiarFondo(Color.BLUE));

        panel.add(rojo);
        panel.add(verde);
        panel.add(azul);

        setVisible(true);
    }

    private void cambiarFondo(Color c) {
        panel.setBackground(c);
        sujeto.setColor(c);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaPrincipal::new);
    }
}
