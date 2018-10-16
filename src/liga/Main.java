package liga;

/**
 *
 * @author Jhon
 */
public class Main {
    public static void main(String[] args) {
        Liga liga = new Liga("Aguila");
        //equipos
        Equipo e1 = new Equipo("Patrioticos");
        Equipo e2 = new Equipo("Americos");
        //jugadores
        Jugador j1 = new Jugador("Pedro", "Alero");
        Jugador j2 = new Jugador("Santos", "Defensor");
        Jugador j3 = new Jugador("Jacinto", "Arquero");
        Jugador j4 = new Jugador("Pablo", "Alero");
        Jugador j5 = new Jugador("Andres", "Defensor");
        Jugador j6 = new Jugador("Casillas", "Arquero");
        //gerentes
        Gerente g1 = new Gerente("Julian Pedraza");
        Gerente g2 = new Gerente("Armando Casas");
        //Asignar a los equipos jugadores y gerentes
        e1.addJugador(j1);
        e1.addJugador(j2);
        e1.addJugador(j3);
        e2.addJugador(j4);
        e2.addJugador(j5);
        e2.addJugador(j6);
        e1.addGerente(g1);
        e2.addGerente(g2);
        //Agregar los equipos a la Liga
        liga.addEquipo(e1);
        liga.addEquipo(e2);
        //Generar la lista de gerentes
        liga.lista();
    }
}
