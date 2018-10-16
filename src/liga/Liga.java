package liga;

import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class Liga {
    private String nombre;
    private ArrayList<Equipo> equipos;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
    
    public void addEquipo(Equipo equipo){
        this.equipos.add(equipo);
    }
    
    public void lista (){
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("Nombre del equipo: " + equipos.get(i).getNombre());
            System.out.println("Nombre del Gerente: " + equipos.get(i).getGerente().getNombre());
        }
    }
}
