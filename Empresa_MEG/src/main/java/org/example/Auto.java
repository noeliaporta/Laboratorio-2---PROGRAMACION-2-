package Empresa_MEG.src.main.java.org.example;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private double kilometrosRecorridos;

    public Auto(){
        cargarAutos();
    }

    public Auto(String marca, String modelo, String color, double cil, int hp) {
        this.marca = marca;
        this.color = color;
        motor = new Motor(cil , hp);
    }

    public void cargarAutos(){
        String cilAux, cabAux;
        double cil;
        int hp;

        this.marca = JOptionPane.showInputDialog(null, "Ingrese la marca: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        this.modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        this.color = JOptionPane.showInputDialog(null, "Ingrese el color: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        this.precio = JOptionPane.showInputDialog(null, "Ingrese el precio: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE );
        cil = JOptionPane.showInputDialog(null, "Ingrese la cilindrada: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE, cilAux );
        hp = JOptionPane.showInputDialog(null, "Ingrese los caballos de fuerza: ", "-------- AutoMG ---------", JOptionPane.QUESTION_MESSAGE, cabAux );
    }

    public void avanzar(int km){
        if(motor.requiereCambioAceite(km)){
            JOptionPane.showMessageDialog("El auto necesita cambio de aceite.");
        }else{
            JOptionPane.showMessageDialog("Usted avanzo " + km + " kilometros. ");
        }
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