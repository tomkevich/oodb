package Classes;

import java.util.List;

//      Алкогольные напитки
public class AlcoholicDrink extends Drink {
    public AlcoholicDrink(String name, double amount, int price) {
        super(name, amount, price);
    }

    public AlcoholicDrink(){
        super();
    }

    //    создание нового напитка
    public static void addNewAlcoholicDrink(String name, double amount, int price, List<AlcoholicDrink> listOfDrink){
        listOfDrink.add(new AlcoholicDrink(name, amount, price));

    }

    //    удаление из меню какого-либо напитка по наименованию
    public static void deleteAlcoholicItem(String name, List<AlcoholicDrink> list){
        int i = 0;
        for (AlcoholicDrink item: list){
            if (item.getName().equals(name)){
                i = list.indexOf(item);
            }
        }
        list.remove(i);
    }

    @Override
    public String toString() {
        return "AlcoholicDrink{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
