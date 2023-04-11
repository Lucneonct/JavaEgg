package guia_7;

import guia_7.Entidad.Persona;

public class Pooe01 {
  public static void main(String[] args) {

    Persona alumno = new Persona(22, "Lucas", "Alvarez");
    System.out.println(alumno.getNombreCompleto());

    System.out.println("Edad: " + alumno.edad);
    alumno.cumpleAnos();
    System.out.println("Edad: " + alumno.edad);
  }
}
