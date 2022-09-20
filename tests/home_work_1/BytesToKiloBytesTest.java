package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BytesToKiloBytesTest {
    @Test
    public void convertToKiloBytesTest() {
        Assertions.assertEquals(
                5,
                BytesIntoKiloBytes.convertToKb(5120));
    }
}
