package Empresa_MEG.src.main.java.org.example;

public class Motor {
    double kilometrosRecorridos;
    float cilindrada; //(por ejemplo: 1.6, 2.0, etc.)
    int caballosFuerza;


    public Motor() {

    }

    public Motor(double kilometrosRecorridos, float cilindrada, int caballosFuerza) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
        this.caballosFuerza = caballosFuerza;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        if (kilometrosRecorridos >= 0)
            this.kilometrosRecorridos = kilometrosRecorridos;
        else {
            System.out.println("Error.Kilometrage inexistente");
        }
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        if (caballosFuerza > 0)
            this.caballosFuerza = caballosFuerza;
        else {
            System.out.println("Error.Caballos de fuerza < 0");
        }
    }

    public boolean requiereCambioAceite(double kilometrosRecorridos){
        boolean temp = false;
        if (kilometrosRecorridos >= 100000)
            temp = true;
        return temp;
    }
}
