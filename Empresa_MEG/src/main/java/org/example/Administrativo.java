package org.example;

import java.util.ArrayList;

public class Administrativo extends Empleado {
    private int horasExtra;

    public Administrativo(String nombre, String apellido, String dni, String email, int codigoEmpleado, double sueldoBasico, int horasExtra) {
        super(nombre, apellido, dni, email, codigoEmpleado, sueldoBasico);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void cargarAuto(ArrayList<Auto> stock, Auto nuevoAuto) {
        stock.add(nuevoAuto);
        System.out.println("Administrativo " + apellido + " cargó un " + nuevoAuto.getMarca() + " al stock.");
    }

    @Override
    public double calcularSueldo() {
        // ponele que el valor fijo de horas extra es  de 1000
        return sueldoBasico + (horasExtra * 1000);
    }
}

/*
Administrativo:
Puede tener horas extra.
cargarAuto(ArrayList<Auto> stock) que agregue un auto a la lista de autos en stock.
 */