package modelo;

/**
 *
 * @author Nehuen
 */

public class Trabajador {

    private int id;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Trabajador() {
    }

    public Trabajador(int id,
            String nombre,
            String puesto,
            boolean libre) {

        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = libre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
}