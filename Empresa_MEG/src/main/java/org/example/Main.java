package org.example;
import java.util.ArrayList;
/*Crear un ArrayList<Auto> con al menos 3 autos distintos.
Simular el avance de los autos con distintos valores de kilómetros (por ejemplo: 30.000, 50.000, 25.000).
Mostrar la información de cada auto (puede ser por consola o usando JOptionPane).*/


public class Main {
    public static void main(String[] args) {
        //Motor M = new Motor(double kilometrosRecorridos, float cilindrada, int caballosFuerza);
        //Auto A1 = new Auto(String marca, String modelo, String color, double precio, double kilometrosRecorridos);

        ArrayList<Auto> listaAutos = new ArrayList<>();

        Motor motor1 = new Motor(0, 1.6f, 1000); // se le escribe f para que java no lo confunda con un double
        Motor motor2 = new Motor(15000, 2.0f, 2500);
        Motor motor3 = new Motor(20000, 1.4f, 500);

        Auto auto1 = new Auto("Toyota", "Corolla", "Azul",25000.0, motor1);
        Auto auto2 = new Auto("Ford", "Mustang","Negro",45000.0, motor2);
        Auto auto3 = new Auto("Honda", "Civic","Blanco", 30000.0, motor3);

        // Añadir los autos a la lista usando el método .add()
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);

        // simular el avance
        auto1.avanzar(3000); // Superará los 100k y saltará el aviso
        auto2.avanzar(50000);
        auto3.avanzar(25000);

        for (Auto a : listaAutos) {
            System.out.println(a);
        }

    }
}