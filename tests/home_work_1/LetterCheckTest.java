package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCheckTest {
    @Test
    public void checkLetterIsALetterTest(){
        Assertions.assertTrue(
                LetterCheck.checkSymbol('a'));
    }

    @Test
    public void checkSpecialCharacterIsALetterTest(){
        Assertions.assertFalse(
                LetterCheck.checkSymbol('?'));
    }

    @Test
    public void checkNumberIsALetterTest(){
        Assertions.assertFalse(
                LetterCheck.checkSymbol('1'));
    }

    @Test
    public void checkBlankSpaceIsALetterTest(){
        Assertions.assertFalse(
                LetterCheck.checkSymbol(' '));
    }

    @Test
    public void checkDefaultIsALetterTest(){
        Assertions.assertFalse(
                LetterCheck.checkSymbol('\u0000'));
    }
}
