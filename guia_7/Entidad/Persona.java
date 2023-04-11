package guia_7.Entidad;

public class Persona {
  public int edad;
  String nombre;
  String apellido;

  public Persona(int edad, String nombre, String apellido) {
    this.edad = edad;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public String getNombreCompleto() {
    return nombre + " " + apellido;
  }

  public void cumpleAnos() {
    this.edad -= 15;
  }
}
