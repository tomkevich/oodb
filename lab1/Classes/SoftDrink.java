package Classes;

import java.util.Comparator;
import java.util.List;

//  Безалкогольные напитки
public class SoftDrink extends Drink {
    public SoftDrink(String name, double amount, int price) {
        super(name, amount, price);
    }


    //    создание нового напитка
    public static void addNewSoftDrink(String name, double amount, int price, List<SoftDrink> listOfDrink){
        listOfDrink.add(new SoftDrink(name, amount, price));

    }

    //    удаление из меню какого-либо напитка по наименованию
    public static void deleteSoftDrinkItem(String name, List<SoftDrink> list){
        int i = 0;
        for (SoftDrink item: list){
            if (item.getName().equals(name)){
                i = list.indexOf(item);
            }
        }
        list.remove(i);
    }

    @Override
    public String toString() {
        return "SoftDrink{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public static Comparator<SoftDrink> SORT_BY_NAME = new Comparator<SoftDrink>() {
        @Override
        public int compare(SoftDrink one, SoftDrink other) {
            return one.name.compareTo(other.name);
        }
    };
}
