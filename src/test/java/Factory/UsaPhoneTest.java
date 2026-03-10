package Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UsaPhoneTest {

    @Test
    void test_correct_format_UsaPhone_number() {

        UsaPhone usaPhone = new UsaPhone("987654321");
        String formatUsaPhone = usaPhone.getFormatedPhoneNumber();

        assertEquals("+1 (098) 765-4321", formatUsaPhone);
    }

    @Test
    void test_correct_lenght_Usa_phoneNumber(){

        assertThrows(RuntimeException.class, ()->{
            UsaPhone usaPhone = new UsaPhone("11987654321");
        });
    }
}
