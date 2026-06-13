package modelo;

/**
 *
 * @author Nehuen
 */

public class DocumentoDriver {

    private String descripcion;
    private String version;

    public DocumentoDriver() {
    }

    public DocumentoDriver(String descripcion, String version) {
        this.descripcion = descripcion;
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}