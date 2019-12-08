package Classes;

import java.util.List;
import java.util.Scanner;

//  Основное меню
public class MainDish extends Meal {

    public MainDish(String name, String description, int price) {
        super(name, description, price);
    }

    public MainDish(){
        super();
    }


//    создание нового блюда
    public static void addNewMainDish(String name, String description, int price, List<MainDish> listOfMainDish){
        listOfMainDish.add(new MainDish(name, description, price));

    }
//    удаление из меню какого-либо блюда по наименованию
    public static void deleteMainDishItem(String name, List<MainDish> listOfMainDish){
        int i = 0;
        for (MainDish item: listOfMainDish){
            if (item.getName().equals(name)){
                i = listOfMainDish.indexOf(item);
            }
        }
        listOfMainDish.remove(i);
    }


    @Override
    public String toString() {
        return "MainDish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
