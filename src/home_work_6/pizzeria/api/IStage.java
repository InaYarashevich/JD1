package home_work_6.pizzeria.api;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Описание этапа выполнения заказа
 */

public interface IStage {
    /**
     * Описание этапа
     *
     * @return
     */
    String getDescription();

    /**
     * Когда этап был начат
     *
     * @return
     */
    static LocalTime getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        LocalTime time = LocalTime.now();
        String text = time.format(formatter);
        LocalTime parsedDate = LocalTime.parse(text, formatter);
        return parsedDate;
    }
}
