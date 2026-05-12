package org.example;

public class AutoDeportivo extends Auto{


    private  double velocidadMaxima;  // En km
    private double aceleracion0a100; //En segundo

    public AutoDeportivo(String marca, String modelo, String color, Motor motor, double precio, double velocidadMaxima, double aceleracion0a100) {
        super(marca, modelo, color, motor, precio);
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion0a100 = aceleracion0a100;
    }

    public void activarModoSport(){
        System.out.printf("Modo sport activado.\n");
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracion0a100() {
        return aceleracion0a100;
    }

    public void setAceleracion0a100(double aceleracion0a100) {
        this.aceleracion0a100 = aceleracion0a100;
    }

    @Override
    public void avanzar(int km) {
        System.out.println("El deportivo acelera...\n");
        super.avanzar(km);
    }

    @Override
    public String toString() {
        String base = super.toString().replace("</html>", "");
        return base +
                "<br><b>DATOS DEL DEPORTIVO:</b><br>" +
                "Velocidad Maxima: " + velocidadMaxima + " km/h<br>" +
                "Aceleracion 0 a 100: " + aceleracion0a100 + " km/h</html>";
    }
}
