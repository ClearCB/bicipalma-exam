package edu.craptocraft.bicipalma.domain.estacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.craptocraft.bicipalma.domain.bicicleta.*;

public class EstacionTest {

    @Test
    public void constructorEstacionTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertNotNull(estacion);
        assertEquals("id: 1 \ndireccion: Manacor \nanclajes: 6", estacion.toString());
    }

    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());

        estacion = new Estacion(1, "Manacor", 0);
        assertEquals(0, estacion.anclajesLibres());
    }

    @Test
    public void anclarBicicletaTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        estacion.anclarBicicleta(new Bicicleta(911));
        assertEquals(5, estacion.anclajesLibres());
        
        estacion.anclarBicicleta(new Bicicleta(922));
        assertEquals(4, estacion.anclajesLibres());

        estacion = new Estacion(1, "Manacor", 0);
        estacion.anclarBicicleta(new Bicicleta(911));
        assertEquals(0, estacion.anclajesLibres());
    }
}