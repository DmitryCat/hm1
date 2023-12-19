package Impl;
//
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> ids = new ArrayList<>();

    public List<Integer> add(List<Integer> ids) {
        this.ids.addAll(ids);
        return this.ids;
    }

    public List<Integer> get() {
        return this.ids; // Возвращает содержимое корзины
    }
}