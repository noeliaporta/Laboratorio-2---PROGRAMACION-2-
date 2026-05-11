package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Auto> autos = new ArrayList<>();

        Motor motor1 = new Motor(80000, 1.6, 110);
        Motor motor2 = new Motor(60000, 2.0, 150);
        Motor motor3 = new Motor(95000, 1.8, 130);

        AutoFamiliar familiar = new AutoFamiliar("Toyota", "Corolla", "Blanco", motor1, 25000000, 4, 5);
        AutoUtilitario utilitario = new AutoUtilitario("Ford", "Focus", "Negro", motor2, 22000000, 1500, 12);
        AutoDeportivo deportivo = new AutoDeportivo("Ferrari", "F8", "Rojo", motor3, 37000000, 340, 2.9);

        /*Auto auto1 = new Auto("Toyota", "Corolla", "Blanco", motor1, 25000000);
        Auto auto2 = new Auto("Ford", "Focus", "Negro", motor2, 22000000);
        Auto auto3 = new Auto("Honda", "Civic", "Rojo", motor3, 27000000);*/

        autos.add(familiar);
        autos.add(utilitario);
        autos.add(deportivo);

        familiar.avanzar(30000);
        utilitario.avanzar(50000);
        deportivo.avanzar(25000);

        for (Auto auto : autos) {
            //JOptionPane.showMessageDialog(null, auto);
            auto.mostrarInfo();
            auto.avanzar(1000);
            System.out.println("-----------------------------------------\n");
        }
    }
}