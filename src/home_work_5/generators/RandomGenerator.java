package home_work_5.generators;

import java.util.Random;

public class RandomGenerator implements IGenerator {
    private int length;
    private static final String RANDOM_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
    private static final String RUSSIAN_CHARS = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
    private static final String ENGLISH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";


    public RandomGenerator(int length) {
        this.length = length;
    }

    @Override
    public String generate(String characters, int stringLength, int characterPosition) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < random.nextInt(stringLength); i++) {
            sb.append(characters.charAt(random.nextInt(characterPosition)));
        }
        return sb.toString();
    }
}
