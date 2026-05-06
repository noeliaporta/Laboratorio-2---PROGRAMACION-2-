package Empresa_MEG.src.main.java.org.example;

/*Crear un ArrayList<Auto> con al menos 3 autos distintos.
Simular el avance de los autos con distintos valores de kilómetros (por ejemplo: 30.000, 50.000, 25.000).
Mostrar la información de cada auto (puede ser por consola o usando JOptionPane).*/


public class Main {
    public static void main(String[] args) {
        Motor M = new Motor(double kilometrosRecorridos, float cilindrada, int caballosFuerza);
        Auto A1 = new Auto(String marca, String modelo, String color, double precio, double kilometrosRecorridos);

        ArrayList<Auto> listaAutos = new ArrayList<>();

        Auto auto1 = new Auto("Toyota", "Corolla", 2022);
        Auto auto2 = new Auto("Ford", "Mustang", 2023);
        Auto auto3 = new Auto("Honda", "Civic", 2021);

        // Añadir los autos a la lista usando el método .add()
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);

        // Mostrar la lista
        for (Auto a : listaAutos) {
            System.out.println(a);
        }

    }
}