package org.example;

public abstract class Empleado {
    private String nombre;
    protected String apellido;
    private String dni;
    private String email;
    private int codigoEmpleado;
    protected double sueldoBasico;

    public Empleado() {
    }

    public Empleado (String nombre, String apellido, String dni, String email, int codigoEmpleado, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.codigoEmpleado = codigoEmpleado;
        this.sueldoBasico = sueldoBasico;
    }

    // es abstract porque se puede sobreescribir, para cada tipo de empleado debo hacer una calcularSueldo especifico
    public abstract double calcularSueldo();

    public void mostrarInformacion() {
        String info = "Empleado: " + apellido + " " + nombre +
                "\nLegajo:" + codigoEmpleado +
                "\nSueldo a cobrar: $" + String.format("%.2f", calcularSueldo());
        javax.swing.JOptionPane.showMessageDialog(null, info);
    }

}

/*
Métodos:
double calcularSueldo() (puede ser sobrescrito)
void mostrarInformacion()
 */