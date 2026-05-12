package org.example;

public class AutoFamiliar extends Auto {

    private int cantidadPuertas;
    private int cantidadAsientos;

    public AutoFamiliar() {
    }

    public AutoFamiliar(String marca, String modelo, String color, Motor motor, double precio, int cantidadPuertas, int cantidadAsientos) {
        super(marca, modelo, color, motor, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public void plegarAsientos(){
        System.out.println("Asientos plegados\n");
    }

    @Override
    public String toString() {
        String base = super.toString().replace("</html>", "");
        return base +
                "<br><b>DATOS DEL FAMILIAR:</b><br>" +
                "Cantidad de Puertas: " + cantidadPuertas + "<br>" +
                "Cantidad de Asientos: " + cantidadAsientos + "</html>";
    }
}
