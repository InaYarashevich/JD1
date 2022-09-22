package home_work_5.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomGenerator implements IGenerator {
    Random random = new Random();
    public static final String RANDOM_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
    public static final String RUSSIAN_CHARS = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
    public static final String ENGLISH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
    public static final List<String> NICKS = Arrays.asList("Alex", "Andy", "Ann", "Chris", "Christy", "Ned",
            "Bess", "Bessie", "Beth", "Liz", "Katie", "Dickon", "Teddy", "Tommy");
    public static final List<String> NAMES = Arrays.asList("Alexander", "Andrew", "Christiana", "Edward", "Elizabeth",
            "Katherine", "Richard", "Susan", "Theodore", "Thomas", "Aiden", "Emma", "Evelyn", "Oliver");
    public static final List<String> NICKS_ANIMALS = Arrays.asList("Тaйсон", "Джек", "Боня", "Рекс", "Джеси", "Хатико",
            "Дик", "Лорд", "Альма", "Рич", "Барон", "Вольт", "Каспер", "Лаки");


    @Override
    public String generateRandomString(String characterType, int stringLength, int characterBoundary) {
        StringBuffer randomString = new StringBuffer();
        for (int i = 0; i < random.nextInt(stringLength); i++) {
            randomString.append(characterType.charAt(random.nextInt(characterBoundary)));
        }
        return randomString.toString();
    }

    @Override
    public String generateRandomNamesAndNicks(List<String> identifier) {
       return identifier.get(random.nextInt(14));
    }

    @Override
    public String generatePassword(String characters, int characterBoundary) {
        StringBuffer password = new StringBuffer();
        for (int i = 0; i < 11; i++) {
            password.append(characters.charAt(random.nextInt(characterBoundary)));
        }
        return password.toString();
    }

    @Override
    public int generateAge() {
        return 1 + random.nextInt(15);
    }
}
