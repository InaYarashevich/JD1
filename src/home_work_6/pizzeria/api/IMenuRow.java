package home_work_6.pizzeria.api;

/**
 * Строчка чека
 */

public interface IMenuRow {
    /**
     * Информация о пицце
     * @return
     */
    IPizzaInfo getInfo();

    /**
     * Стоимость пиццы
     * @return
     */
    double getPrice();
}
