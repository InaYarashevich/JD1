package home_work_6.pizzeria.api;

import home_work_6.pizzeria.objects.Pizza;

import java.util.List;

/**
 * Готовый заказ
 */

public interface IDoneOrder {
    /**
     * Квиток, по которому готовился заказ
     * @return квиток, выданный при формировании заказа
     */
    ITicket getTicket();

    /**
     * Готовые пиццы, приготовленные по заказу
     * @return список пицц
     */
    List<IPizza> getItems();
}
