package ClubDeportivo.model;

import java.util.Objects;

public abstract class Persona {

    private String nombre;
    private String fechaDeNacimiento;
    private final int dni;

    public Persona(int dni, String nombre, String fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona:" +
                "nombre:'" + nombre + '\'' +
                ", fechaDeNacimiento:'" + fechaDeNacimiento + '\'' +
                ", dni:" + dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
