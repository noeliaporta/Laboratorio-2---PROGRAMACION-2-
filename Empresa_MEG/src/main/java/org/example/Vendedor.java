package org.example;
import java.util.ArrayList;

public class Vendedor extends Empleado {
    private int cantidadVentas;
    private double comisionPorVenta = 0.002;

    public Vendedor(String nombre, String apellido, String dni, String email, int codigo, double sueldoBasico) {
        // 'super' pasa los datos a la clase base Empleado
        super(nombre, apellido, dni, email, codigo, sueldoBasico);
        this.cantidadVentas = 0;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public void venderAuto(ArrayList<Auto> stock, ArrayList<Auto> vendidos, String modeloABuscar) {
        Auto autoEncontrado = null;
        // verificar el stock
        for (Auto a : stock) {
            if (a.getModelo().equalsIgnoreCase(modeloABuscar)) {
                autoEncontrado = a;
                break;
            }
        }

        if (autoEncontrado != null) {
            stock.remove(autoEncontrado);  // Lo quitamos del stock
            vendidos.add(autoEncontrado); // Lo agregamos a vendidos
            this.cantidadVentas++;        // Sumamos una venta al vendedor
            System.out.println("Venta exitosa: " + modeloABuscar);
        } else {
            System.out.println("El auto " + modeloABuscar + " no está en stock.");
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        javax.swing.JOptionPane.showMessageDialog(null, "Autos vendidos: " + cantidadVentas);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + (comisionPorVenta * cantidadVentas);
    }

}
