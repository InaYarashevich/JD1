package home_work_5.utils;

import java.util.List;

public interface IGenerator {
    String generateRandomString(String characters, int stringLength, int characterBoundary);
    String generateRandomNamesAndNicks(List<String> identifier);
    String generatePassword(String characters, int characterBoundary);
    int generateAge();
}
