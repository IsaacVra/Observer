package app;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class SujetoColor {

    private List<ObservadorColor> observadores = new ArrayList<>();
    private Color colorActual;

    public void agregarObservador(ObservadorColor observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorColor observador) {
        observadores.remove(observador);
    }

    public void setColor(Color nuevoColor) {
        this.colorActual = nuevoColor;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorColor observador : observadores) {
            observador.actualizar(colorActual);
        }
    }
}
