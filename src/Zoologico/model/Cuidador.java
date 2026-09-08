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


    public boolean alimentar (Animal animal){

        if (animal instanceof Mamifero && this.especialidad == Especialidad.MAMIFERO){
            return animal.comer();
        }else if (animal instanceof Reptil && this.especialidad == Especialidad.REPTIL){
            return animal.comer();
        }else if (animal instanceof Ave && this.especialidad == Especialidad.AVE){
            return animal.comer();
        }

        return false;

    }

    public boolean limpiar (Animal animal){

        if (animal instanceof Mamifero && this.especialidad == Especialidad.MAMIFERO){
            return animal.limpiarse();
        }else if (animal instanceof Reptil && this.especialidad == Especialidad.REPTIL){
            return animal.limpiarse();
        }else if (animal instanceof Ave && this.especialidad == Especialidad.AVE){
            return animal.limpiarse();
        }

        return false;

    }

    public boolean vacunar (Animal animal){

        if (animal instanceof Mamifero && this.especialidad == Especialidad.MAMIFERO){
            return animal.rehabilitar();
        }else if (animal instanceof Reptil && this.especialidad == Especialidad.REPTIL){
            return animal.rehabilitar();
        }else if (animal instanceof Ave && this.especialidad == Especialidad.AVE){
            return animal.rehabilitar();
        }

        return false;

    }

    public boolean jugar (Animal animal){

        if (animal instanceof Mamifero && this.especialidad == Especialidad.MAMIFERO){
            return animal.correr();
        }else if (animal instanceof Reptil && this.especialidad == Especialidad.REPTIL){
            return animal.correr();
        }else if (animal instanceof Ave && this.especialidad == Especialidad.AVE){
            return animal.correr();
        }

        return false;

    }




}
