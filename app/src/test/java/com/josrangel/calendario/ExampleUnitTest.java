package com.josrangel.calendario;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void pruebaSuma() {
        assertEquals(4, Funciones.suma(2,2));
    }

    @Test
    public void pruebaResta() {
        assertEquals(0, Funciones.resta(2,2));
    }

    @Test
    public void pruebaMultiplicacion() {
        assertEquals(4, Funciones.multiplicacion(2,2));
    }

    @Test
    public void pruebaDivision() {
        assertEquals(1, Funciones.division(2,2));
    }
}