package Classes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "menu")
public class Menu {
    public Menu() {
    }

    //    полный список всего меню
    public static List<VegetarianMeal> vegetarianMeals = new ArrayList<>();
    public static List<MainDish> mainDishes = new ArrayList<>();
    public static List<Snacks> snacks = new ArrayList<>();
    public static List<SoftDrink> softDrinks = new ArrayList<>();
    public static List<AlcoholicDrink> alcoholicDrinks = new ArrayList<>();


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

    //    работа с XML
    @XmlElementWrapper(name = "VegetarianMeals")
    @XmlElement(name = "VegetarianMeal")
    public List<VegetarianMeal> getVegetarianMeals() {
        return vegetarianMeals;
    }

    @XmlElementWrapper(name = "SoftDrinks")
    @XmlElement(name = "SoftDrink")
    public List<SoftDrink> getSoftDrinks() {
        return softDrinks;
    }
}
