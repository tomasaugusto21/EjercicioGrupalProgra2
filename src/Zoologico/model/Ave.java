package Zoologico.model;

public class Ave extends Animal{

    private String estadoPlumaje;
    private CapacidadDeVuelo capacidadDeVuelo;


    public Ave(String nombre, String especie, int hambre, int salud, int higiene, boolean enfermo, String estadoPlumaje, CapacidadDeVuelo capacidadDeVuelo) {
        super(nombre, especie, hambre, salud, higiene, enfermo);
        this.estadoPlumaje = estadoPlumaje;
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    public String getEstadoPlumaje() {
        return estadoPlumaje;
    }

    public void setEstadoPlumaje(String estadoPlumaje) {
        this.estadoPlumaje = estadoPlumaje;
    }

    public CapacidadDeVuelo getCapacidadDeVuelo() {
        return capacidadDeVuelo;
    }

    public void setCapacidadDeVuelo(CapacidadDeVuelo capacidadDeVuelo) {
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    @Override
    public String toString() {
        return super.toString() + "el animal es Ave, el estado de su plumaje es " + estadoPlumaje + " y es " + capacidadDeVuelo;
    }
    
}
