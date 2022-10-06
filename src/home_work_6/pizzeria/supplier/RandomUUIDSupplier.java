package home_work_6.pizzeria.supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class RandomUUIDSupplier implements Supplier<String> {
    @Override
    public String get() {
        return UUID.randomUUID().toString();
    }
}
