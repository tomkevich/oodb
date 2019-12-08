package Classes;

import java.util.List;

//  Закуски
public class Snacks extends Meal{
    public Snacks(String name, String description, int price) {
        super(name, description, price);
    }

    public Snacks(){
        super();
    }

    //    создание нового блюда
    public static void addNewSnacks(String name, String description, int price, List<Snacks> listOfSnacks){
        listOfSnacks.add(new Snacks(name, description, price));

    }

    //    удаление из меню какого-либо блюда по наименованию
    public static void deleteVegetarianItem(String name, List<Snacks> listOfSnacks){
        int i = 0;
        for (Snacks item: listOfSnacks){
            if (item.getName().equals(name)){
                i = listOfSnacks.indexOf(item);
            }
        }
        listOfSnacks.remove(i);
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
