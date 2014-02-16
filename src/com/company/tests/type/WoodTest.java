package com.company.tests.type;

import com.company.model.type.Wood;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class WoodTest extends TestCase {

    @Before
    public void setUp() {

    }

    @Test
    public void testPassandoTodosOsTiposDeMadeira() {
        assertEquals(
            "Brazilian Rosewood",
                Wood.BRAZILIAN_ROSEWOOD.toString()
        );

        assertEquals(
            "Cedar",
            Wood.CEDAR.toString()
        );

        assertEquals(
            "Adirondack",
            Wood.ADIRONDACK.toString()
        );

        assertEquals(
                "Alder",
                Wood.ALDER.toString()
        );

        assertEquals(
                "Cocobolo",
                Wood.COCOBOLO.toString()
        );

        assertEquals(
                "Mahogany",
                Wood.MAHOGANY.toString()
        );

        assertEquals(
                "Sitka",
                Wood.SITKA.toString()
        );

    }
}
