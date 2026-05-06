package Empresa_MEG.src.main.java.org.example;

public class Auto {
    String marca;
    String modelo;
    String color;
    Motor motor;
    double precio;

    public Auto(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void avanzar(int km){

    }

    @Override
    public boolean requiereCambioAceite(){

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