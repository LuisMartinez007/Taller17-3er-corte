package Taller17.Ejercicio3;

public class Prueba{
    public static void main(String[] args) {
        // Crear instancias de Bicicleta y Coche usando polimorfismo
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        // Usar el método moverse
        bicicleta.moverse();
        coche.moverse();
    }
}
