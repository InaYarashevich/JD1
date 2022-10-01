package home_work_6.pizzeria.api;

/**
 * Приготовленная пицца
 */

public interface IPizza {

    /**
     * Название пиццы
     * @return
     */
    String getName();

    /**
     * Размер пиццы
     * @return
     */
    int getSize();
}
