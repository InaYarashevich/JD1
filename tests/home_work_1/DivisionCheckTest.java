package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionCheckTest {
    @Test
    public void canBeDividedWithoutRemainder() {
        Assertions.assertEquals(
                true,
                DivisionCheck.canBeDivided(10, 2));
    }

    @Test
    public void canBeDividedWithRemainder() {
        Assertions.assertEquals(
                false,
                DivisionCheck.canBeDivided(10, 3));
    }
}

