package Taller17.Ejercicio1;

public class Prueba{
    public static void main(String[] args) {
        // Crear instancias de Circulo y Rectangulo
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        // Calcular y mostrar las áreas utilizando polimorfismo
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
