package Taller17.Ejercicio1;

public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método getter para radio
    public double getRadio() {
        return radio;
    }

    // Método setter para radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

