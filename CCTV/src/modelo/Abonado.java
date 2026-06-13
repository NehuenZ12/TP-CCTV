package modelo;

/**
 *
 * @author Nehuen
 */

public class Abonado {

    private String nombre;
    private int password;

    public Abonado() {
    }

    public Abonado(String nombre, int password) {
        this.nombre = nombre;
        this.password = password;
    }

    public boolean validarIngreso(int psw) {
        return this.password == psw;
    }

    public void cambioPassword(String newPass) {
        this.password = Integer.parseInt(newPass);

        System.out.println(
                "Password cambiada a: "
                + this.password);
    }

    public void delay(int mili) {

        try {

            Thread.sleep(mili);

        } catch (InterruptedException e) {

            System.out.println(
                    "Delay de "
                    + mili
                    + " milisegundos");
        }
    }

    public boolean abonadosDiferentes(Abonado c2) {
        return !this.equals(c2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}