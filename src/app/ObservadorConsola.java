package app;

import java.awt.Color;

public class ObservadorConsola implements ObservadorColor {

    @Override
    public void actualizar(Color nuevoColor) {
        System.out.println("Color actualizado a: " + colorHex(nuevoColor));
    }

    private String colorHex(Color c) {
        return String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue()).toUpperCase();
    }
}
