package lab2;

import Classes.Menu;
import Classes.SoftDrink;
import Classes.VegetarianMeal;
import lab2.service.Search;
import lab2.service.Sort;

public class CafeTestDrive {
    public static void main(String[] args) {
        JsonWriter w = new JsonWriter();
        JsonReader r = new JsonReader();
        Search s = new Search();
        Sort sr = new Sort();

//        добавляем новые блюда
        VegetarianMeal.addNewVegetarian("Salad", "This is vegetarian meal!", 500, Menu.vegetarianMeals);
        VegetarianMeal.addNewVegetarian("Cheesecakes", "This is also vegetarian meal", 650, Menu.vegetarianMeals);

//        добавляем новые напитки
        SoftDrink.addNewSoftDrink("Lemonade", 350.0, 150, Menu.softDrinks);
        SoftDrink.addNewSoftDrink("Mohito", 450.0, 250, Menu.softDrinks);

//        запись в Json формат
//        w.toJson();
//        из json формата
//        r.fromJson();

//        s.FIND_VEGETARIAN_BY_MANE();
        sr.SORT_VEGETARIAN_BY_NAME();
        System.out.println(Menu.vegetarianMeals.toString());
    }
}
