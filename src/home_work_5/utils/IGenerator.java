package home_work_5.utils;

import java.util.List;

public interface IGenerator {
    String generateRandomString(String characters, int stringLength, int characterBoundary);
    String generateRandomIdentifiers(List<String> identifier, int length);
    String generatePassword(String characters, int characterBoundary);
    int generateAge();
}
