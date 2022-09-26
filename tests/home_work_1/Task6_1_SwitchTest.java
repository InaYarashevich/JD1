package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_1_SwitchTest {
    @Test
    public void checkAnastasiaTest(){
        Assertions.assertEquals(
                "Я тебя так долго ждал",
                Task6_1_Switch.printWelcome("Анастасия"));
    }

    @Test
    public void checkVasiyaTest(){
        Assertions.assertEquals(
                "Привет! \nЯ тебя так долго ждал",
                Task6_1_Switch.printWelcome("Вася"));
    }

    @Test
    public void checkOtherNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_Switch.printWelcome("Анна"));
    }

    @Test
    public void checkNotANameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_Switch.printWelcome("5"));
    }

    @Test
    public void checkBlankNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_Switch.printWelcome(""));
    }

    @Test
    public void checkNullTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_Switch.printWelcome(null));
    }
}
