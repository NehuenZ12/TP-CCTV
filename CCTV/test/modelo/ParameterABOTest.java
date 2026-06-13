package modelo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParameterABOTest {

    private String email;
    private boolean esperado;

    public ParameterABOTest(
            String email,
            boolean esperado) {

        this.email = email;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {

        return Arrays.asList(new Object[][]{

            {"test@test.com", true},
            {"usuario@gmail.com", true},
            {"correoinvalido", false},
            {"sinarroba.com", false},
            {"sinpunto@gmail", false}

        });
    }

    @Test
    public void testValidarEmail() {

        boolean resultado =
                email.contains("@")
                &&
                email.contains(".");

        assertEquals(
                esperado,
                resultado);
    }
}