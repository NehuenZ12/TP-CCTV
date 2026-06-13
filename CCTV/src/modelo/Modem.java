
package modelo;

/**
 *
 * @author Nehuen
 */
public class Modem {

    private String serialNumber;
    private String marca;
    private double velocidad;
    private int puertosEthernet;
    private boolean puertoCoaxial;
    private String protocoloRed;
    private int nroLeds;
    private boolean firewall;
    private String estado;
    
    private DocumentoHardware documentoHardware;
    private DocumentoDriver documentoDriver;

    public Modem() {
    }

    public Modem(String serialNumber,
            String marca,
            double velocidad,
            int puertosEthernet,
            boolean puertoCoaxial,
            String protocoloRed,
            int nroLeds,
            boolean firewall,
            DocumentoHardware documentoHardware,
            DocumentoDriver documentoDriver) {

        this.serialNumber = serialNumber;
        this.marca = marca;
        this.velocidad = velocidad;
        this.puertosEthernet = puertosEthernet;
        this.puertoCoaxial = puertoCoaxial;
        this.protocoloRed = protocoloRed;
        this.nroLeds = nroLeds;
        this.firewall = firewall;
        this.documentoHardware = documentoHardware;
        this.documentoDriver = documentoDriver;
        this.estado = "Activo";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuertosEthernet() {
        return puertosEthernet;
    }

    public void setPuertosEthernet(int puertosEthernet) {
        this.puertosEthernet = puertosEthernet;
    }

    public boolean isPuertoCoaxial() {
        return puertoCoaxial;
    }

    public void setPuertoCoaxial(boolean puertoCoaxial) {
        this.puertoCoaxial = puertoCoaxial;
    }

    public String getProtocoloRed() {
        return protocoloRed;
    }

    public void setProtocoloRed(String protocoloRed) {
        this.protocoloRed = protocoloRed;
    }

    public int getNroLeds() {
        return nroLeds;
    }

    public void setNroLeds(int nroLeds) {
        this.nroLeds = nroLeds;
    }

    public boolean isFirewall() {
        return firewall;
    }

    public void setFirewall(boolean firewall) {
        this.firewall = firewall;
    }

    public DocumentoHardware getDocumentoHardware() {
        return documentoHardware;
    }

    public void setDocumentoHardware(DocumentoHardware documentoHardware) {
        this.documentoHardware = documentoHardware;
    }

    public DocumentoDriver getDocumentoDriver() {
        return documentoDriver;
    }

    public void setDocumentoDriver(DocumentoDriver documentoDriver) {
        this.documentoDriver = documentoDriver;
    }
    
    public String getEstado() {
    return estado;
}

    public void setEstado(String estado) {
    this.estado = estado;
}
}
