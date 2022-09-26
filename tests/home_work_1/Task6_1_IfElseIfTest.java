package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task6_1_IfElseIfTest {

    @Test
    public void checkAnastasiaTest(){
        Assertions.assertEquals(
                "Я тебя так долго ждал",
                Task6_1_IfElseIf.printWelcome("Анастасия"));
    }

    @Test
    public void checkVasiyaTest(){
        Assertions.assertEquals(
                "Привет! \nЯ тебя так долго ждал",
                Task6_1_IfElseIf.printWelcome("Вася"));
    }

    @Test
    public void checkOtherNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_IfElseIf.printWelcome("Анна"));
    }

    @Test
    public void checkNotANameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_IfElseIf.printWelcome("5"));
    }

    @Test
    public void checkBlankNameTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_IfElseIf.printWelcome(""));
    }

    @Test
    public void checkNullTest(){
        Assertions.assertEquals(
                "Добрый день, а вы кто?",
                Task6_1_IfElseIf.printWelcome(null));
    }
}
