package modelo;

/**
 *
 * @author Nehuen
 */
public class VisitaTecnica {

    private int numeroVisita;
    private String ubicacion;
    private String tamanio;

    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;

    private String observaciones;

    private Cuadrilla cuadrilla;

    public VisitaTecnica() {
    }

    public VisitaTecnica(int numeroVisita,
            String ubicacion,
            String tamanio,
            LocalDate fechaCreacion,
            LocalDate fechaReparacion,
            String observaciones,
            Cuadrilla cuadrilla) {

        this.numeroVisita = numeroVisita;
        this.ubicacion = ubicacion;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaReparacion = fechaReparacion;
        this.observaciones = observaciones;
        this.cuadrilla = cuadrilla;
    }

    public int getNumeroVisita() {
        return numeroVisita;
    }

    public void setNumeroVisita(int numeroVisita) {
        this.numeroVisita = numeroVisita;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cuadrilla getCuadrilla() {
        return cuadrilla;
    }

    public void setCuadrilla(Cuadrilla cuadrilla) {
        this.cuadrilla = cuadrilla;
    }
}