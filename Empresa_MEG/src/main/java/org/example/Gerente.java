package org.example;

import java.util.ArrayList;

public class Gerente extends Empleado {
    private double bonoAdicional;

    public Gerente(String nombre, String apellido, String dni, String email, int codigoEmpleado, double sueldoBasico, double bonoAdicional) {
        super(nombre, apellido, dni, email, codigoEmpleado, sueldoBasico);
        this.bonoAdicional = bonoAdicional;
    }

    public void agregarEmpleadoVendedor(ArrayList<Vendedor> listaVendedores, Vendedor nuevoVendedor) {
        listaVendedores.add(nuevoVendedor);
        System.out.println("Vendedor añadido por el Gerente.");
    }

    public void agregarEmpleadoAdministrativo(ArrayList<Administrativo> listaAdmins, Administrativo nuevoAdmin) {
        listaAdmins.add(nuevoAdmin);
        System.out.println("Administrativo añadido por el Gerente.");
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bonoAdicional;
    }
}
