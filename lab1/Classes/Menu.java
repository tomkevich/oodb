package Classes;

import java.util.ArrayList;
import java.util.List;

public class Menu {
//    полный список всего меню
    public static List<VegetarianMeal> vegetarianMeals = new ArrayList<>();
    public static List<MainDish> mainDishes = new ArrayList<>();
    public static List<Snacks> snacks = new ArrayList<>();
    public static List<SoftDrink> softDrinks = new ArrayList<>();
    public static List<AlcoholicDrink> alcoholicDrinks = new ArrayList<>();

    public List<VegetarianMeal> getVegetarianMeals() {
        return vegetarianMeals;
    }

    public void setVegetarianMeals(List<VegetarianMeal> vegetarianMeals) {
        Menu.vegetarianMeals = vegetarianMeals;
    }

    public List<MainDish> getMainDishes() {
        return mainDishes;
    }

    public void setMainDishes(List<MainDish> mainDishes) {
        Menu.mainDishes = mainDishes;
    }

    public List<Snacks> getSnacks() {
        return snacks;
    }

    public void setSnacks(List<Snacks> snacks) {
        Menu.snacks = snacks;
    }

    public List<SoftDrink> getSoftDrinks() {
        return softDrinks;
    }

    public void setSoftDrinks(List<SoftDrink> softDrinks) {
        Menu.softDrinks = softDrinks;
    }

    public List<AlcoholicDrink> getAlcoholicDrinks() {
        return alcoholicDrinks;
    }

    public void setAlcoholicDrinks(List<AlcoholicDrink> alcoholicDrinks) {
        Menu.alcoholicDrinks = alcoholicDrinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "vegetarianMeals=" + vegetarianMeals +
                ", mainDishes=" + mainDishes +
                ", snacks=" + snacks +
                ", softDrinks=" + softDrinks +
                ", alcoholicDrinks=" + alcoholicDrinks +
                '}';
    }

}
