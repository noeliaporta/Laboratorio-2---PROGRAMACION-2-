package Empresa_MEG.src.main.java.org.example;

public class Motor {
    double kilometrosRecorridos;
    float cilindrada; //(por ejemplo: 1.6, 2.0, etc.)
    int caballosFuerza;



    public boolean requiereCambioAceite(double kilometrosRecorridos){
        boolean temp = false;
        if (kilometrosRecorridos >= 100000)
            temp = true;
        return temp;
    }
}
