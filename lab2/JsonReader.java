package lab2;

import Classes.*;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReader {
    public void fromJson() {
        Gson gson = new Gson();
        try { //    получаем данные из файла
            BufferedReader br = new BufferedReader(new FileReader("VegetarianMeal.json"));
            BufferedReader br2 = new BufferedReader(new FileReader("MainDish.json"));
            BufferedReader br3 = new BufferedReader(new FileReader("Snacks.json"));
            BufferedReader br4 = new BufferedReader(new FileReader("AlcoholicDrink.json"));
            BufferedReader br5 = new BufferedReader(new FileReader("SoftDrink.json"));
            //создаем экземпляр класса 
            VegetarianMeal[] obj = gson.fromJson(br, VegetarianMeal[].class);
            MainDish[] obj2 = gson.fromJson(br2, MainDish[].class);
            Snacks[] obj3 = gson.fromJson(br3, Snacks[].class);
            AlcoholicDrink[] obj4 = gson.fromJson(br4, AlcoholicDrink[].class);
            SoftDrink[] obj5 = gson.fromJson(br5, SoftDrink[].class);

//            Добавляем полученные данные в списки
            for (VegetarianMeal m : obj) {
                Menu.vegetarianMeals.add(new VegetarianMeal(m.getName(), m.getDescription(), m.getPrice()));
            }
            for (MainDish m : obj2) {
                Menu.mainDishes.add(new MainDish(m.getName(), m.getDescription(), m.getPrice()));
            }
            for (Snacks m : obj3) {
                Menu.snacks.add(new Snacks(m.getName(), m.getDescription(), m.getPrice()));
            }
            for (AlcoholicDrink m : obj4) {
                Menu.alcoholicDrinks.add(new AlcoholicDrink(m.getName(), m.getAmount(), m.getPrice()));
            }
            for (SoftDrink m : obj5) {
                Menu.softDrinks.add(new SoftDrink(m.getName(), m.getAmount(), m.getPrice()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
