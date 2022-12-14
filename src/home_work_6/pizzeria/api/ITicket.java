package home_work_6.pizzeria.api;

import java.time.LocalDateTime;

/**
 * Квиток, выдаваемый к заказу
 */

public interface ITicket {
    /**
     * Уникальный номер заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalDateTime getCreatedAt();

    /**
     * Заказ, для которого выдали квиток
     * @return
     */
    IOrder getOrder();
}
