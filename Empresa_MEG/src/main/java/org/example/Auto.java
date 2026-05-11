package org.example;

import javax.swing.*;

public abstract class Auto {

    private String marca;
    private String modelo;
    private String color;
    private Motor motor;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, Motor motor, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void avanzar(int km) {
        motor.setKilometrosRecorridos(
                motor.getKilometrosRecorridos() + km
        );

        if (motor.requiereCambioAceite()) {
            JOptionPane.showMessageDialog(null, "El auto " + marca + " " + modelo + " necesita cambio de aceite.");
        }
    }

    public void mostrarInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nAuto { " + "Marca: " + marca +
                " Modelo: " + modelo +
                " Color: " + color +
                " Precio: $" + precio +
                " " + motor + " }";
    }
}