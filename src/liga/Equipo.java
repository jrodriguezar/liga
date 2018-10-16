package liga;

import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private Gerente gerente;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    
    public void addGerente (Gerente gerente){
        this.gerente=gerente;
    }
}
