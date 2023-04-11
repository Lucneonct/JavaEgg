package guia_8.Ejercicio1;

import java.util.Scanner;

public class CuentaBancariaServicio {

  public CuentaBancaria crearCuenta() {
    CuentaBancaria cuenta = new CuentaBancaria();

    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese el número de su cuenta bancaria");
    int numeroCuenta = leer.nextInt();
    cuenta.setNumeroCuenta(numeroCuenta);

    System.out.println("Ingrese el DNI del cliente");
    int dni = leer.nextInt();
    cuenta.setDniCliente(dni);

    System.out.println("Ingrese el saldo actual de la cuenta");
    double saldoActual = leer.nextInt();
    cuenta.setSaldoActual(saldoActual);

    leer.close();
    return cuenta;
  }

  public void ingresar(CuentaBancaria cuenta, double monto) {
    cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
  }

  public void retirar(CuentaBancaria cuenta, double monto) {
    double saldo = cuenta.getSaldoActual() - monto;

    if (saldo <= 0) {
      cuenta.setSaldoActual(0);
    } else {
      cuenta.setSaldoActual(saldo);
    }
  }

  public void extraccionRapida(CuentaBancaria cuenta) {
    double saldoExtraido = cuenta.getSaldoActual() * 0.2;

    System.out.println("Saldo extraido: $" + saldoExtraido);

    cuenta.setSaldoActual(cuenta.getSaldoActual() - saldoExtraido);
  }

  public void consultarSaldo(CuentaBancaria cuenta) {
    System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
  }

  public void consultarDatos(CuentaBancaria cuenta) {
    System.out.println("Numero Cuenta: " + cuenta.getNumeroCuenta());
    System.out.println("Dni: " + cuenta.getDniCliente());
    this.consultarSaldo(cuenta);
  }
}
