package home_work_1.Task6_redoneTests;

import home_work_1.Task6_redone.Task6_1_IfElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_IfElseTests {
    Task6_1_IfElse task6_1_ifElse = new Task6_1_IfElse();

    @Test
    public void checkAnastasiaTest(){
        Assertions.assertEquals(
                "Я тебя так долго ждал",
                task6_1_ifElse.welcome("Анастасия"));
    }

    @Test
    public void checkVasiyaTest(){
        Assertions.assertEquals(
                "Привет! \nЯ тебя так долго ждал",
                task6_1_ifElse.welcome("Вася"));
    }

    @Test
    public void checkOtherNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElse.welcome("Анна"));
    }

    @Test
    public void checkNotANameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElse.welcome("5"));
    }

    @Test
    public void checkBlankNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElse.welcome(""));
    }

    @Test
    public void checkNullTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElse.welcome(null));
    }
}
