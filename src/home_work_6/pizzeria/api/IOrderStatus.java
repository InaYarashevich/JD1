package home_work_6.pizzeria.api;

import java.util.List;

/**
 * Статус заказа, выданный по определнному квитку
 */

public interface IOrderStatus {
    /**
     * Получить список пройденных этапов
     * @return пройденные этапы
     */
    List<IStage> getHistory();

    /**
     * Признак готовности заказа
     * @return true - готов, false - не готов
     */
    boolean isDone();

    /**
     * По какому квитку мы получили статус
     * @return
     */
    ITicket getTicket();
}
