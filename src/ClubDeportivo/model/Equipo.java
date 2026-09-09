package ClubDeportivo.model;

public class Equipo {

    private String nombreEquipo;
    private Deporte deporte;
    private Persona entrenador;
    private Jugador jugadores [];
    private int contadorJugadores = 0;

    public Equipo(String nombreEquipo, Deporte deporte, Persona entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.deporte = deporte;
        this.entrenador = entrenador;
        this.jugadores = new Jugador[22];
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public Persona getEntrenador() {
        return entrenador;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public StringBuilder mostrarJugadores (){

        StringBuilder sb = new StringBuilder();

        for (Jugador jugador : jugadores){

            sb.append(jugador.toString()).append("\n");

        }

        return sb;
    }

    public boolean agregarJugadores (Jugador jugador){

        if (jugador == null){
            return false;
        }

        if (jugador.getDeporte() != this.deporte){
            return false;
        }

        if (contadorJugadores >= jugadores.length){
            return false;
        }

        jugadores[contadorJugadores] = jugador;
        contadorJugadores++;

        return true;
    }

}
