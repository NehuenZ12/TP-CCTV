
package modelo;

import java.time.LocalDate;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;


/**
 *
 * @author Nehuen
 */
public class AbonadoTest {

    private static Abonado ciu;
    private int i = 1;

    @BeforeAll
    public static void antesDeTodo() {

        ciu = new Abonado(
                "Anonimus",
                1212);

        System.out.println(
                "INGRESO de abonado del bien");
    }

    @AfterAll
    public static void despuesDeTodo() {

        System.out.println(
                LocalDate.now().minusDays(1));

        System.out.println(
                "Modem rotos reparados, Abonados Felices");
    }

    @BeforeEach
    public void before() {

        System.out.println("----------------------");
        System.out.println("Test numero: " + i);
    }

    @AfterEach
    public void after() {

        System.out.println("----------------------");
    }

    @Test
    public void testValidarPsw() {

        String contra = "123456";

        boolean resultado =
                ciu.validarIngreso(
                        Integer.parseInt(contra));

        assertTrue(resultado);
    }

    @Test
    public void testValidarEmail() {

        String email = "test@test.com";

        boolean valido =
                email.contains("@")
                &&
                email.contains(".")
                &&
                email.length() < 20;

        assertTrue(valido);
    }

    @Test
    public void testCambioPass() {

        String newPass = "1234";

        ciu.cambioPassword(newPass);

        assertEquals(
                1234,
                ciu.getPassword());
    }

    @Test
    @Timeout(30)
    public void testDelay() {

        ciu.delay(45);
    }

    @Test
    public void testAbonadosDiferentes() {

        Abonado c1 =
                new Abonado(
                        "Juan",
                        1111);

        Abonado c2 =
                new Abonado(
                        "Pedro",
                        2222);

        c1.abonadosDiferentes(c2);

        assertNotSame(
                c1,
                c2,
                "misma persona");
    }
}
