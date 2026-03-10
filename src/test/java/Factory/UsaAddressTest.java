package Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsaAddressTest {

    @Test
    void test_correct_Format_Usa_address(){

        UsaAddress usaAddress = new UsaAddress("154 5th Avenue", "New York", "NY 10001");
        String formatedUsaAddress = usaAddress.getFormatedAdress();

        assertEquals("154 5th Avenue, New York, NY 10001", formatedUsaAddress);



    }
}
