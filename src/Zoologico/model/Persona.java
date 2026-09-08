package Zoologico.model;

import java.util.Objects;

public abstract class Persona {

    private final String nombre;
    private final int dni;
    private final int legajo;
    private double salario;

    private static int contador = 1;

    public Persona(String nombre, int dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = contador;
        contador++;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", legajo=" + legajo +
                ", salario=" + salario +
                '}';
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
