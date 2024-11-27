package Taller17.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    // Constructor
    public CuentaAhorros(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    // Método para aplicar intereses
    public void aplicarInteres() {
        double interes = getSaldo() * tasaInteres / 100;
        depositar(interes); // Utilizamos el método depositar de la clase base
    }

    // Método getter para tasa de interés
    public double getTasaInteres() {
        return tasaInteres;
    }

    // Método setter para tasa de interés
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}

