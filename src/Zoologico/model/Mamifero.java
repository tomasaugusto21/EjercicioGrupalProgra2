package Zoologico.model;

public class Mamifero extends Animal{

    private TipoPelaje tipoPelaje;

    public Mamifero(String nombre, String especie, int hambre, int salud, int higiene, boolean enfermo, TipoPelaje tipoPelaje) {
        super(nombre, especie, hambre, salud, higiene, enfermo);
        this.tipoPelaje = tipoPelaje;
    }

    public TipoPelaje getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(TipoPelaje tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public String toString() {
        return super.toString() + "el animal es Mamifero y su tipo de pelaje es " + tipoPelaje;
    }




}
