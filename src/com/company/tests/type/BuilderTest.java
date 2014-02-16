package com.company.tests.type;

import com.company.model.type.Builder;
import junit.framework.TestCase;
import org.junit.Test;

public class BuilderTest extends TestCase {

    @Test
    public void setUp() {

    }

    @Test
    public void testPassandoTodosOsFabricantes() {
        assertEquals(
            "Gibson",
                Builder.GIBSON.toString()
        );

        assertEquals(
                "Any",
                Builder.ANY.toString()
        );

        assertEquals(
                "Fender",
                Builder.FENDER.toString()
        );

        assertEquals(
                "Martin",
                Builder.MARTIN.toString()
        );

        assertEquals(
                "Olson",
                Builder.OLSON.toString()
        );

        assertEquals(
                "Prs",
                Builder.PRS.toString()
        );

        assertEquals(
                "Ryan",
                Builder.RYAN.toString()
        );
    }

}
