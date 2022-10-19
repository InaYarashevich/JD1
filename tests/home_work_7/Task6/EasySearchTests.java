package home_work_7.Task6;

import home_work_7.dto.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTests {

    @Test
    public void searchSmokeTest(){
        EasySearch easySearch = new EasySearch();
        String text = "привет, как дела!";
        Assertions.assertEquals(
                1, easySearch.search(text, "привет"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchThroughSplitTest(){
        EasySearch easySearch = new EasySearch();
        String text = "привет,какдела!";
        Assertions.assertEquals(
                1, easySearch.search(text, "привет"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchThroughSplitWordTest(){
        EasySearch easySearch = new EasySearch();
        String text = "привет,какдела!";
        Assertions.assertEquals(
                0, easySearch.search(text, "дела"), "Искомое слово найдено в строке."
        );
    }


    @Test
    public void searchThroughSplitsTest(){
        EasySearch easySearch = new EasySearch();
        String text = "привет;какдела!";
        Assertions.assertEquals(
                1, easySearch.search(text, "какдела"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchThroughSplitWithPunctTest(){
        EasySearch easySearch = new EasySearch();
        String text = "как дела!.Что делаешь?";
        Assertions.assertEquals(
                1, easySearch.search(text, "Что"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchOfDoubleWordsTest(){
        EasySearch easySearch = new EasySearch();
        String text = "Привет-привет";
        Assertions.assertEquals(
                1, easySearch.search(text, "Привет-привет"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchOfDoubleWordsSecondTest(){
        EasySearch easySearch = new EasySearch();
        String text = "Привет-привет";
        Assertions.assertEquals(
                0, easySearch.search(text, "-привет"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchOfWordsWithHyphenTest(){
        EasySearch easySearch = new EasySearch();
        String text = "Привет -привет";
        Assertions.assertEquals(
                1, easySearch.search(text, "-привет"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchOfWordsWithNumberTest(){
        EasySearch easySearch = new EasySearch();
        String text = "4-х";
        Assertions.assertEquals(
                1, easySearch.search(text, "4-х"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchOfWordNumberTest(){
        EasySearch easySearch = new EasySearch();
        String text = "один и 1";
        Assertions.assertEquals(
                1, easySearch.search(text, "1"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchOfTheSameNounsTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушке бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "бабушка"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchCapitalizedInTheBeginningTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка Бабушке бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "Бабушке"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchCapitalizedInTheBeginningNotCaseSensitiveTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка Бабушке бабушку";
        Assertions.assertEquals(
                0, easySearch.search(text, "бабушке"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchCapitalizedInTheMiddleTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабУшке бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "бабУшке"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchCapitalizedInTheMiddleNotCaseSensitiveTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабУшке бабушку";
        Assertions.assertEquals(
                0, easySearch.search(text, "бабушке"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchCapitalizedInTheEndTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушкЕ бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "бабушкЕ"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchCapitalizedInTheEndNotCaseSensitiveTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушкЕ бабушку";
        Assertions.assertEquals(
                0, easySearch.search(text, "бабушке"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchInUpperCaseTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка БАБУШКЕ бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "БАБУШКЕ"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchInUpperCaseNotCaseSensitiveTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка БАБУШКЕ бабушку";
        Assertions.assertEquals(
                0, easySearch.search(text, "бабушке"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchWithBlankSpaceBeforeTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушке бабушку";
        Assertions.assertEquals(
                0, easySearch.search(text, " бабушке"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchWithBlankSpaceAfterTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушке бабушку";
        Assertions.assertEquals(
                0, easySearch.search(text, "бабушке "), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchWithSpecialCharacterInsideTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушк'е бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "бабушк'е"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchWithNumbersInsideTest(){
        EasySearch easySearch = new EasySearch();
        String text = "бабушка бабушк1е бабушку";
        Assertions.assertEquals(
                1, easySearch.search(text, "бабушк1е"), "Искомое слово не найдено в строке."
        );
    }

    @Test
    public void searchSimpleTest(){
        EasySearch easySearch = new EasySearch();
        String text = "Мама мыла раму";
        Assertions.assertEquals(
                0, easySearch.search(text, "мыл"), "Искомое слово найдено в строке."
        );
    }

    @Test
    public void searchGermanWordTest(){
        EasySearch easySearch = new EasySearch();
        String text = "Pläne Für Die Freizeit";
        Assertions.assertEquals(
                1, easySearch.search(text, "Pläne"), "Искомое слово не найдено в строке."
        );
    }
}
