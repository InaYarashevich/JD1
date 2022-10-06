package home_work_6.pizzeria.api;

import java.util.List;

/**
 * Меню пиццерии
 */

public interface IMenu {
    /**
     * Доступные к заказу пиццы
     * @return описания пицц, которые можно заказать
     */
    List<IMenuRow> getItems();
}
