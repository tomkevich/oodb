package lab2.service;

import Classes.Menu;
import Classes.SoftDrink;
import Classes.VegetarianMeal;

import java.util.Collections;

public class Sort {
    public void SORT_SOFTDRINK_BY_NAME(){
        Menu.softDrinks.sort(SoftDrink.SORT_BY_NAME);
    }

    public void SORT_VEGETARIAN_BY_NAME(){
        Menu.vegetarianMeals.sort(VegetarianMeal.SORT_BY_NAME);
    }
}
