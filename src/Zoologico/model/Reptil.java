package Zoologico.model;

public class Reptil extends Animal{

    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(String nombre, String especie, int hambre, int salud, int higiene, boolean enfermo, boolean esVenenoso, boolean tienePatas) {
        super(nombre, especie, hambre, salud, higiene, enfermo);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean isTienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

    @Override
    public String toString() {
        return super.toString() + "el animal es Reptil. Es venenoso: " + esVenenoso + " . Tiene patas: " +tienePatas;
    }

}
