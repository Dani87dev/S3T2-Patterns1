package Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsaPhoneTest {

    @Test
    void test_correct_format_UsaPhone_number() {

        UsaPhone usaPhone = new UsaPhone("987654321");
        String formatUsaPhone = usaPhone.getFormatedPhoneNumber();

        assertEquals("+1 (098) 765-4321", formatUsaPhone);
    }
}
