package org.example;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        //ArrayList<Auto> autos = new ArrayList<>();

        ArrayList<Auto> autosStock = new ArrayList<>();
        ArrayList<Auto> autosVendidos = new ArrayList<>();

        ArrayList<Administrativo> administrativos = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        Gerente gerente = new Gerente("Noelia", "Porta", "12345678", "noe@empresa.com", 1001, 80000.0, 15000.0);

        Motor motor1 = new Motor(80000, 1.6, 110);
        Motor motor2 = new Motor(60000, 2.0, 150);
        Motor motor3 = new Motor(95000, 1.8, 130);

        AutoFamiliar familiar = new AutoFamiliar("Toyota", "Corolla", "Blanco", motor1, 25000000, 4, 5);
        AutoUtilitario utilitario = new AutoUtilitario("Ford", "Focus", "Negro", motor2, 22000000, 1500, 12);
        AutoDeportivo deportivo = new AutoDeportivo("Ferrari", "F8", "Rojo", motor3, 37000000, 340, 2.9);

        Administrativo admin = new Administrativo("Naty", "Lopez", "33444555", "naty@meg.com", 2002, 60000.0, 5);

        admin.cargarAuto(autosStock, familiar);
        admin.cargarAuto(autosStock, utilitario);
        admin.cargarAuto(autosStock, deportivo);

        Vendedor vendedor = new Vendedor("Emiliano", "Gomez", "40123456", "emiliano@ventas.com", 2003, 50000.0);
        vendedores.add(vendedor);

        System.out.println("\n--- Simulando Ventas ---");
        vendedor.venderAuto(autosStock, autosVendidos, "Corolla");

        System.out.println("\n--- AUTOS EN STOCK ---");
        // isEmpty
        if (autosStock.isEmpty()) {
            System.out.println("No hay autos en stock.");
        } else {
            for (Auto a : autosStock) {
                a.mostrarInfo();
            }
        }

        System.out.println("\n--- AUTOS VENDIDOS ---");
        for (Auto a : autosVendidos) {
            a.mostrarInfo();
        }

        System.out.println("\n--- DATOS DE LOS EMPLEADOS ---");
        gerente.mostrarInformacion();

        administrativos.add(admin);
        for (Administrativo ad : administrativos) {
            ad.mostrarInformacion();
        }
        for (Vendedor v : vendedores) {
            v.mostrarInformacion();
        }

        System.out.println("--- Simulando Avance ---");
        familiar.avanzar(30000);
        utilitario.avanzar(10000);
        deportivo.avanzar(10000);

        System.out.println("\n--- Informacion de la Flota ---");
        for (Auto auto : autosStock) {
            JOptionPane.showMessageDialog(null, auto.toString(), "Información del Vehículo", JOptionPane.INFORMATION_MESSAGE);

            // para verlo también en la terminal
            auto.mostrarInfo();
            System.out.println("-----------------------------------------");
        }

    }
}

/*
En el main:
Crear 2 listas de autos:
ArrayList<Auto> autosStock para representar el stock de autos.
ArrayList<Auto> autosVendidos para representar los autos vendidos.
Crear un objeto Gerente gerente para agregar empleados.
Crear 2 listas de empleados:
ArrayList<Administrativo> administrativos para representar al personal administrativo.
ArrayList<Vendedor> vendedores para representar al personal de ventas.

Simular la carga de autos nuevos mediante un objeto Administrativo.
Simular la venta de autos mediante un objeto Vendedor.
Simular el avance de algunos autos.
Mostrar por consola los datos de los autos en stock y los autos vendidos.
Mostrar por consola los datos de los empleados.
 */