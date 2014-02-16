package com.company.tests.type;

import com.company.model.type.Type;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TypeTest extends TestCase {

    @Before
    public void setUp() {

    }

    @Test
    public void testPassandoTodosTiposDeGuitarras() {
        assertEquals(
            "Eletric",
            Type.ELETRIC.toString()
        );

        assertEquals(
            "Acoustic",
            Type.ACOUSTIC.toString()
        );
    }
}
