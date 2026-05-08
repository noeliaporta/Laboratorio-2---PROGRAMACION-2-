package org.example;
import javax.swing.JOptionPane;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private Motor motor;

    public Auto(){
        cargarAutos();
    }

    public Auto(String marca, String modelo, String color, double precio, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
    }

    public void cargarAutos(){
        this.marca = JOptionPane.showInputDialog(null, "Ingrese la marca: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        this.modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        this.color = JOptionPane.showInputDialog(null, "Ingrese el color: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        this.precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:")); // para double

        float cil = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cilindrada:"));
        int hp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese HP:"));
        double km = Double.parseDouble(JOptionPane.showInputDialog("Ingrese KM iniciales:"));

        this.motor = new Motor(km, cil, hp);
    }

    public void avanzar(int km){
        this.motor.sumarKilometros(km); // primero incrementa los km
        if (this.motor.requiereCambioAceite()) { // Luego verifica
            JOptionPane.showMessageDialog(null, "El auto " + marca + " necesita cambio de aceite.");
        } else {
            JOptionPane.showMessageDialog(null, "Avanzó " + km + " km. Total: " + motor.getKilometrosRecorridos());
        }
    }

    @Override
    public String toString() {
        return "Auto: " + marca + " " + modelo + " | KM: " + motor.getKilometrosRecorridos();
    }

}
