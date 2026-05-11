package org.example;

public class AutoUtilitario extends Auto {

    private double capacidadCarga;  // En kg
    private double volumenCarga;  //En metros cubicos

    public AutoUtilitario(String marca, String modelo, String color, Motor motor, double precio, double capacidadCarga, double volumenCarga) {
        super(marca, modelo, color, motor, precio);
        this.capacidadCarga = capacidadCarga;
        this.volumenCarga = volumenCarga;
    }

    public void cargarMercaderia(double kg) {
        if (kg <= capacidadCarga) {
            System.out.println("Mercaderia cargada.\n");
        }else {
            System.out.println("Se supera la capacidad de carga.\n");
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(double volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutoUtilitario {" + "Capacidad de Carga: " + capacidadCarga + "Volumen de Carga: " + volumenCarga + "}";
    }
}
