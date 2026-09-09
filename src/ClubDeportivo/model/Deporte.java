package ClubDeportivo.model;

public class Deporte {
    private String nombreDeporte;
    private String descripcion;
    private boolean seJuegaConPelota;
    private double largo;
    private double ancho;

    public Deporte(String nombreDeporte,String descripcion,boolean seJuegaConPelota,double largo,double ancho) {
        this.nombreDeporte = nombreDeporte;
        this.descripcion = descripcion;
        this.seJuegaConPelota = seJuegaConPelota;
        this.largo = largo;
        this.ancho = ancho;
    }
    //getters


    public String getNombreDeporte() {
        return this.nombreDeporte;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean isSeJuegaConPelota() {
        return this.seJuegaConPelota;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "Nombre del deporte:'" + nombreDeporte + '\'' +
                ", Descripcion:'" + descripcion + '\'' +
                ", Se juega con pelota?:" + seJuegaConPelota +
                ", Dimension de la cancha:" + largo +"X"+ ancho +
                '}';
    }
}

