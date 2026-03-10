package Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpainAddressTest {

    @Test
    void test_correct_Format_Spain_address() {

        SpainAddress directionSpain = new SpainAddress("Carrer Major 34", "Barcelona", "08001");
        String formatSpaintDirection = directionSpain.getFormatedAdress();

        assertEquals("Carrer Major 34, 08001 Barcelona", formatSpaintDirection);

    }
}
