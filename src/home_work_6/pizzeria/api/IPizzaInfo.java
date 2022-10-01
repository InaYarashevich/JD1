package home_work_6.pizzeria.api;

/**
 * Информация о пицце
 */
public interface IPizzaInfo {
    /**
     * Итоговый размер пиццы, которую приготовят
     * @return
     */
    int getSize();

    /**
     * Название пиццы
     * @return
     */
    String getName();

    /**
     * Описание/ состав пиццы
     * @return
     */
    String getDescription();

}
