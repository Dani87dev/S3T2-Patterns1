package Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpainPhoneTest {

    @Test
    void test_correct_spain_phoneNumber_format() {
        SpainPhone spainPhone = new SpainPhone("623456789");
        String spainFormatedNumber = spainPhone.getFormatedPhoneNumber();

        assertEquals("+34 623 45 67 89", spainFormatedNumber);
    }

    @Test
    void test_correct_lenght_Spain_phoneNumber(){

        assertThrows(RuntimeException.class, ()->{
            SpainPhone spainPhone = new SpainPhone("6623456789");
        });
    }

}
