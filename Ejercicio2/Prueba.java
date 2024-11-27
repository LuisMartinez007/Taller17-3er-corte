package Taller17.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        // Crear instancia de CuentaAhorros
        CuentaBancaria cuenta = new CuentaAhorros("Juan Pérez", 1000.0, 5.0);

        // Depositar dinero
        cuenta.depositar(200.0);
        System.out.println("Saldo después del depósito: " + cuenta.consultarSaldo());

        // Retirar dinero
        cuenta.retirar(150.0);
        System.out.println("Saldo después del retiro: " + cuenta.consultarSaldo());

        // Aplicar intereses (necesitamos hacer un cast a CuentaAhorros)
        if (cuenta instanceof CuentaAhorros) {
            ((CuentaAhorros) cuenta).aplicarInteres();
            System.out.println("Saldo después de aplicar intereses: " + cuenta.consultarSaldo());
        }
    }
}

