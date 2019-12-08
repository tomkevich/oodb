package lab3;

import Classes.Menu;
import Classes.SoftDrink;
import Classes.VegetarianMeal;

public class CafeTestDrive {
    public static void main(String[] args) {
//        добавляем новые блюда
        VegetarianMeal.addNewVegetarian("Salad", "This is vegetarian meal!", 500, Menu.vegetarianMeals);
        VegetarianMeal.addNewVegetarian("Cheesecakes", "This is also vegetarian meal", 650, Menu.vegetarianMeals);

//        добавляем новые напитки
        SoftDrink.addNewSoftDrink("Lemonade", 350.0, 150, Menu.softDrinks);
        SoftDrink.addNewSoftDrink("Mohito", 450.0, 250, Menu.softDrinks);

        Menu menu = new Menu();
//        SaveXML.saveData(menu);
        LoadXML.loadData();
    }
}
