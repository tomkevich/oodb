package Classes;

import java.util.ArrayList;
import java.util.List;

public class Menu {
//    полный список всего меню
    public List<VegetarianMeal> vegetarianMeals = new ArrayList<>();
    public List<MainDish> mainDishes = new ArrayList<>();
    public List<Snacks> snacks = new ArrayList<>();
    public List<SoftDrink> softDrinks = new ArrayList<>();
    public List<AlcoholicDrink> alcoholicDrinks = new ArrayList<>();

    public List<VegetarianMeal> getVegetarianMeals() {
        return vegetarianMeals;
    }

    public void setVegetarianMeals(List<VegetarianMeal> vegetarianMeals) {
        this.vegetarianMeals = vegetarianMeals;
    }

    public List<MainDish> getMainDishes() {
        return mainDishes;
    }

    public void setMainDishes(List<MainDish> mainDishes) {
        this.mainDishes = mainDishes;
    }

    public List<Snacks> getSnacks() {
        return snacks;
    }

    public void setSnacks(List<Snacks> snacks) {
        this.snacks = snacks;
    }

    public List<SoftDrink> getSoftDrinks() {
        return softDrinks;
    }

    public void setSoftDrinks(List<SoftDrink> softDrinks) {
        this.softDrinks = softDrinks;
    }

    public List<AlcoholicDrink> getAlcoholicDrinks() {
        return alcoholicDrinks;
    }

    public void setAlcoholicDrinks(List<AlcoholicDrink> alcoholicDrinks) {
        this.alcoholicDrinks = alcoholicDrinks;
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
