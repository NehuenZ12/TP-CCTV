package modelo;

import java.time.LocalDate;

/**
 *
 * @author Nehuen
 */
public class SolicitudArreglo {

    private int codInf;
    private LocalDate fechaInforme;
    private String problema;
    private int codigoUrgencia;

    private Modem modem;
    private Abonado abonado;

    private VisitaTecnica visita;

    public SolicitudArreglo() {
    }

    public SolicitudArreglo(int codInf,
            LocalDate fechaInforme,
            String problema,
            int codigoUrgencia,
            Modem modem,
            Abonado abonado,
            VisitaTecnica visita) {

        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codigoUrgencia = codigoUrgencia;
        this.modem = modem;
        this.abonado = abonado;
        this.visita = visita;
    }

    public int getCodInf() {
        return codInf;
    }

    public void setCodInf(int codInf) {
        this.codInf = codInf;
    }

    public LocalDate getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(LocalDate fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getCodigoUrgencia() {
        return codigoUrgencia;
    }

    public void setCodigoUrgencia(int codigoUrgencia) {
        this.codigoUrgencia = codigoUrgencia;
    }

    public Modem getModem() {
        return modem;
    }

    public void setModem(Modem modem) {
        this.modem = modem;
    }

    public Abonado getAbonado() {
        return abonado;
    }

    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }

    public VisitaTecnica getVisita() {
        return visita;
    }

    public void setVisita(VisitaTecnica visita) {
        this.visita = visita;
    }
}