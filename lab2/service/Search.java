package lab2.service;

import Classes.Menu;
import Classes.SoftDrink;
import Classes.VegetarianMeal;

import java.util.Scanner;

public class Search {
    Scanner in = new Scanner(System.in);

    public void FIND_VEGETARIAN_BY_MANE(){
        System.out.print("Введите наименование блюда:");
        String name = in.nextLine().toLowerCase();

        for (VegetarianMeal m: Menu.vegetarianMeals){
            if (m.getName().toLowerCase().contains(name)){
                System.out.println(m.getName() + ", " + m.getDescription() + ", " + m.getPrice());
            }
        }
    }

    public void FIND_SOFTDRINK_BY_NAME(){
        System.out.print("Введите наименование напитка:");
        String name = in.nextLine().toLowerCase();

        for (SoftDrink m: Menu.softDrinks){
            if (m.getName().toLowerCase().contains(name)){
                System.out.println(m.getName() + ", " + m.getAmount() + ", " + m.getPrice());
            }
        }
    }
}
