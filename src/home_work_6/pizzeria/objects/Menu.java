package home_work_6.pizzeria.objects;

import home_work_6.pizzeria.api.IMenu;
import home_work_6.pizzeria.api.IMenuRow;

import java.util.ArrayList;
import java.util.List;


public class Menu implements IMenu {
    private List<IMenuRow> items = new ArrayList<>();

    public Menu(List<IMenuRow> items) {
        this.items = items;
    }

    public Menu(){}

    @Override
    public List<IMenuRow> getItems() {
        items.add(new MenuRow(new PizzaInfo("Ранч пицца", "американский соус ранч, филе цыпленка, ветчина, свежие томаты, сыр моцарелла, базилик", 1), 15.00));
        items.add(new MenuRow(new PizzaInfo("Гавайская", "сырный соус, ветчина, филе цыпленка, ананасы, сыр моцарелла, базилик", 1), 18.00));
        items.add(new MenuRow(new PizzaInfo("Грибная", "чесночный соус, ветчина, свежие шампиньоны, сыр моцарелла, базилик", 1), 19.00));
        items.add(new MenuRow(new PizzaInfo("Сырный цыпленок", "сырный соус, филе цыпленка, свежие томаты, сыр моцарелла, базилик, кунжут", 2), 20.00));
        items.add(new MenuRow(new PizzaInfo("Деревенская", "американский соус ранч, грудинка (свинина), свежий лук, соленые огурцы, свежие шампиньоны, сыр моцарелла, базилик", 2), 25.00));
        items.add(new MenuRow(new PizzaInfo("Колбаски барбекю", "пицца-соус, охотничьи колбаски, свежий лук, свежие шампиньоны, грудинка (свинина), соленые огурцы, американский соус ранч, соус барбекю, сыр моцарелла, базилик", 2), 22.00));
        items.add(new MenuRow(new PizzaInfo("Итальянская", "пицца-соус, пепперони, свежие шампиньоны, грудинка (свинина), маслины, сыр моцарелла, базилик", 2), 23.00));
        items.add(new MenuRow(new PizzaInfo("Острая чили", "острый перец халапеньо, чесночный соус, сладкий соус чили, пепперони, грудинка (свинина), свежий болгарский перец, сыр моцарелла, перец кайенский", 2), 25.00));
        return items;
    }

    @Override
    public String toString() {
        return "Menu:" +items;
    }
}
