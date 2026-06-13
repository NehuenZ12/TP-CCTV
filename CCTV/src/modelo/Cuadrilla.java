package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nehuen
 */

public class Cuadrilla {

    private int numero;
    private String equipamiento;
    private String materiales;

    private Lider lider;

    private List<Trabajador> trabajadores;

    public Cuadrilla() {

        trabajadores = new ArrayList<>();
    }

    public Cuadrilla(int numero,
            String equipamiento,
            String materiales,
            Lider lider) {

        this.numero = numero;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.lider = lider;

        this.trabajadores = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public Lider getLider() {
        return lider;
    }

    public void setLider(Lider lider) {
        this.lider = lider;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void agregarTrabajador(
            Trabajador trabajador) {

        trabajadores.add(trabajador);
    }
}
