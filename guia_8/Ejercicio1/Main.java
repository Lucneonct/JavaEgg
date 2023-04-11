package guia_8.Ejercicio1;

public class Main {
  public static void main(String[] args) {
    CuentaBancariaServicio banco = new CuentaBancariaServicio();

    CuentaBancaria cuenta1 = banco.crearCuenta();
    // CuentaBancaria cuenta2 = new CuentaBancaria(1234, 87654321, 9000);

    banco.consultarDatos(cuenta1);
    System.out.println("");
    
    banco.ingresar(cuenta1, 5000);
    banco.consultarSaldo(cuenta1);
    
    banco.retirar(cuenta1, 2000);
    banco.consultarSaldo(cuenta1);
    
    banco.extraccionRapida(cuenta1);
    banco.extraccionRapida(cuenta1);
    banco.extraccionRapida(cuenta1);
    banco.extraccionRapida(cuenta1);
    banco.extraccionRapida(cuenta1);
    banco.extraccionRapida(cuenta1);
    banco.consultarSaldo(cuenta1);
    System.out.println("");
    banco.consultarDatos(cuenta1);
  }
}
