package home_work_1.Task6_redoneTests;

import home_work_1.Task6_redone.Task6_1_IfElseIf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_IfElseIfTests {
    Task6_1_IfElseIf task6_1_ifElseIf = new Task6_1_IfElseIf();

    @Test
    public void checkAnastasiaTest(){
        Assertions.assertEquals(
                "Я тебя так долго ждал",
                task6_1_ifElseIf.welcome("Анастасия"));
    }

    @Test
    public void checkVasiyaTest(){
        Assertions.assertEquals(
                "Привет! \nЯ тебя так долго ждал",
                task6_1_ifElseIf.welcome("Вася"));
    }

    @Test
    public void checkOtherNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElseIf.welcome("Анна"));
    }

    @Test
    public void checkNotANameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElseIf.welcome("5"));
    }

    @Test
    public void checkBlankNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElseIf.welcome(""));
    }

    @Test
    public void checkNullTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                task6_1_ifElseIf.welcome(null));
    }
}
