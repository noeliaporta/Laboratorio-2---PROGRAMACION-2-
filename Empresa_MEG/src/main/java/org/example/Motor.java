package org.example;

public class Motor {

    private int kilometrosRecorridos;
    private double cilindrada;
    private int caballosFuerza;

    public Motor(int kilometrosRecorridos, double cilindrada, int caballosFuerza) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
        this.caballosFuerza = caballosFuerza;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public boolean requiereCambioAceite() {
        return kilometrosRecorridos > 100000;
    }

    @Override
    public String toString() {
        return "Motor: <br>" +
                "Kilómetros: " + kilometrosRecorridos + "<br>" +
                "Cilindrada: " + cilindrada + "<br>" +
                "Caballos de fuerza: " + caballosFuerza +
                "<br>------------------------------" ;
    }
}