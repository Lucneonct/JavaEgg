package guia_8.Ejercicio1;

public class CuentaBancaria {
  private int numeroCuenta;
  private int dniCliente;
  private double saldoActual;

  public CuentaBancaria() {}

  public CuentaBancaria(int numeroCuenta, int dniClient, double saldoActual) {
    this.numeroCuenta = numeroCuenta;
    this.dniCliente = dniClient;
    this.saldoActual = saldoActual;
  }

  public int getNumeroCuenta() {
    return this.numeroCuenta;
  }

  public int getDniCliente() {
    return this.dniCliente;
  }

  public double getSaldoActual() {
    return this.saldoActual;
  } 

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public void setDniCliente(int dni) {
    this.dniCliente = dni;
  }

  public void setSaldoActual(double saldoActual) {
    this.saldoActual = saldoActual;
  }
}
