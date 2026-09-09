package ClubDeportivo.model;

public class Jugador extends Persona  {

    private Categoria categoria;
    private int numCamiseta;
    private Deporte deporte;

    public Jugador(int dni, String nombre, String fechaDeNacimiento,Categoria categoria, int numCamiseta,Deporte deporte){
        super(dni,nombre,fechaDeNacimiento);
        this.categoria = categoria;
        this.numCamiseta = numCamiseta;
        this.deporte = deporte;
    }

    //getters

    public Categoria getCategoria() {
        return this.categoria;
    }

    public int getNumCamiseta() {
        return this.numCamiseta;
    }

    public Deporte getDeporte() {
        return this.deporte;
    }
    //set

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
