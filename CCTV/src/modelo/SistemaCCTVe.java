package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaCCTVe {

    private List<Abonado> abonados;
    private List<Modem> modems;
    private List<SolicitudArreglo> solicitudes;
    private List<VisitaTecnica> visitas;
    private List<Cuadrilla> cuadrillas;

    public SistemaCCTVe() {

        abonados = new ArrayList<>();
        modems = new ArrayList<>();
        solicitudes = new ArrayList<>();
        visitas = new ArrayList<>();
        cuadrillas = new ArrayList<>();
    }

    public void listadoAbonados() {

        for (Abonado a : abonados) {

            System.out.println(
                    a.getNombre());
        }
    }

    public void informesSolicitudesPorMarca(
            String marca) {

        for (SolicitudArreglo s : solicitudes) {

            if (s.getModem()
                    .getMarca()
                    .equalsIgnoreCase(marca)) {

                System.out.println(
                        s.getCodInf());
            }
        }
    }

    public void informeCuadrillasOciosas() {

        for (Cuadrilla c : cuadrillas) {

            boolean todosLibres = true;

            for (Trabajador t
                    : c.getTrabajadores()) {

                if (!t.isLibre()) {

                    todosLibres = false;
                }
            }

            if (todosLibres) {

                System.out.println(
                        "Cuadrilla "
                        + c.getNumero()
                        + " ociosa");
            }
        }
    }

    public void visitasPorCuadrilla(
            int numeroCuadrilla) {

        for (VisitaTecnica v : visitas) {

            if (v.getCuadrilla()
                    .getNumero()
                    == numeroCuadrilla) {

                System.out.println(
                        v.getNumeroVisita());
            }
        }
    }

    public void solicitudesSinVisita() {

        for (SolicitudArreglo s
                : solicitudes) {

            if (s.getVisita() == null) {

                System.out.println(
                        s.getCodInf());
            }
        }
    }

    public void trabajadoresPorCuadrilla(
            int numeroCuadrilla) {

        for (Cuadrilla c
                : cuadrillas) {

            if (c.getNumero()
                    == numeroCuadrilla) {

                for (Trabajador t
                        : c.getTrabajadores()) {

                    System.out.println(
                            t.getNombre());
                }
            }
        }
    }

}
