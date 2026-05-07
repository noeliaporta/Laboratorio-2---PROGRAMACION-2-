package Empresa_MEG.src.main.java.org.example;
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

    public Auto(String marca, String modelo, String color, Motor motor, double cil, int hp) {
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

        float cil = JOptionPane.showInputDialog(null, "Ingrese la cilindrada: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE, cilAux );
        int hp = JOptionPane.showInputDialog(null, "Ingrese los caballos de fuerza: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE, cabAux );
        double km = Double.parseDouble(JOptionPane.showInputDialog("Ingrese KM iniciales:"));

        this.motor = new Motor(km, cil, hp);
    }

    public void avanzar(int km){
        this.motor.sumarKilometros(km); // primero incrementa
        if(this.motor.requiereCambioAceite(km)){ // luego verifico
            JOptionPane.showMessageDialog("El auto necesita cambio de aceite.");
        }else{
            JOptionPane.showMessageDialog("Usted avanzo " + km +  " kilometros. ");
        }
    }

    @Override
    public String toString() {
        return "Auto: " + marca + " " + modelo + " | KM: " + motor.getKilometrosRecorridos();
    }

}
/*
Clase Auto
Atributos:
marca
modelo
color
Motor motor (composición)
precio
Métodos:
avanzar(int km):
Incrementa los kilómetros recorridos del motor.
Invoca el método requiereCambioAceite() del motor.
Si devuelve true, mostrar un mensaje con JOptionPane.showMessageDialog indicando que el auto necesita cambio de aceite.
 */