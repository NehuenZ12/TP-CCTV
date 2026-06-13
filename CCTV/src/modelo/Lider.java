package modelo;

/**
 *
 * @author Nehuen
 */

public class Lider extends Trabajador {

    public Lider() {
    }

    public Lider(int id,
            String nombre,
            String puesto,
            boolean libre) {

        super(id, nombre, puesto, libre);
    }
}
