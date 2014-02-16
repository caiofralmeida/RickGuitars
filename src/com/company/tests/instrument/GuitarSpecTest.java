package com.company.tests.instrument;

import com.company.model.instrument.GuitarSpec;
import com.company.model.type.Builder;
import com.company.model.type.Type;
import com.company.model.type.Wood;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class GuitarSpecTest extends TestCase {

    protected GuitarSpec guitarSpec;

    @Before
    public void setUp() {
        guitarSpec = new GuitarSpec(
            "Les Paul",
            Type.ELETRIC,
            Wood.ADIRONDACK,
            Wood.COCOBOLO,
            Builder.GIBSON,
            6
        );
    }

    @Test
    public void testMatchesPassandoModeloIncorreto() {
          GuitarSpec guitarSpecCompare = new GuitarSpec(
                  "Fly V",
                  Type.ELETRIC,
                  Wood.ADIRONDACK,
                  Wood.COCOBOLO,
                  Builder.GIBSON,
                  6
          );

          assertFalse(
              guitarSpec.matches(guitarSpecCompare)
          );
    }

    @Test
    public void testMatchesPassandoTipoIncorreto() {
        GuitarSpec guitarSpecCompare = new GuitarSpec(
                "Les Paul",
                Type.ACOUSTIC,
                Wood.ADIRONDACK,
                Wood.COCOBOLO,
                Builder.GIBSON,
                6
        );

        assertFalse(
                guitarSpec.matches(guitarSpecCompare)
        );
    }

    @Test
    public void testMatchesPassandoMadeiraFrontalIncorreta() {
        GuitarSpec guitarSpecCompare = new GuitarSpec(
                "Les Paul",
                Type.ELETRIC,
                Wood.ALDER,
                Wood.COCOBOLO,
                Builder.GIBSON,
                6
        );

        assertFalse(
                guitarSpec.matches(guitarSpecCompare)
        );
    }

    @Test
    public void testMatchesPassandoMadeiraFundoIncorreta() {
        GuitarSpec guitarSpecCompare = new GuitarSpec(
                "Les Paul",
                Type.ELETRIC,
                Wood.ADIRONDACK,
                Wood.BRAZILIAN_ROSEWOOD,
                Builder.GIBSON,
                6
        );

        assertFalse(
                guitarSpec.matches(guitarSpecCompare)
        );
    }

    @Test
    public void testMatchesPassandoFabricanteIncorreto() {
        GuitarSpec guitarSpecCompare = new GuitarSpec(
                "Les Paul",
                Type.ELETRIC,
                Wood.ADIRONDACK,
                Wood.COCOBOLO,
                Builder.ANY,
                6
        );

        assertFalse(
                guitarSpec.matches(guitarSpecCompare)
        );
    }

    @Test
    public void testMatchesPassandoNumeroCordasIncorreto() {
        GuitarSpec guitarSpecCompare = new GuitarSpec(
                "Les Paul",
                Type.ELETRIC,
                Wood.ADIRONDACK,
                Wood.COCOBOLO,
                Builder.GIBSON,
                12
        );

        assertFalse(
                guitarSpec.matches(guitarSpecCompare)
        );
    }

    @Test
    public void testMatchesPassandoTodosDadosCorretos() {
        GuitarSpec guitarSpecCompare = new GuitarSpec(
                "Les Paul",
                Type.ELETRIC,
                Wood.ADIRONDACK,
                Wood.COCOBOLO,
                Builder.GIBSON,
                6
        );

        assertTrue(
                guitarSpec.matches(guitarSpecCompare)
        );
    }

}
