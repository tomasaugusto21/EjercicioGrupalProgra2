package Zoologico.model;

public class Cuidador extends Persona{

    private Especialidad especialidad;

    public Cuidador(String nombre, int dni, double salario, Especialidad especialidad) {
        super(nombre, dni, salario);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "La persona es: Cuidador con especialidad en " + especialidad;
    }



}
