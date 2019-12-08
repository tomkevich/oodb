package Classes;

import java.util.List;

//  Безалкогольные напитки
public class SoftDrink extends Drink {
    public SoftDrink(String name, double amount, int price) {
        super(name, amount, price);
    }

    public SoftDrink(){
        super();
    }

    //    создание нового напитка
    public void addNewSoftDrink(String name, double amount, int price, List<SoftDrink> listOfDrink){
        listOfDrink.add(new SoftDrink(name, amount, price));

    }

    //    удаление из меню какого-либо напитка по наименованию
    public void deleteSoftDrinkItem(String name, List<SoftDrink> list){
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
}
