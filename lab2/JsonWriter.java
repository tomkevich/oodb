package lab2;

import Classes.Menu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    public void toJson() {
//    запись в файл
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("VegetarianMeal.json")) {
            gson.toJson(Menu.vegetarianMeals, writer);
            System.out.println(Menu.vegetarianMeals);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("MainDish.json")) {
            gson.toJson(Menu.mainDishes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("Snacks.json")) {
            gson.toJson(Menu.snacks, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("AlcoholicDrink.json")) {
            gson.toJson(Menu.alcoholicDrinks, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("SoftDrink.json")) {
            gson.toJson(Menu.softDrinks, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
