package Classes;

import java.util.Iterator;
import java.util.List;

//  Вегетарианское меню
public class VegetarianMeal extends Meal {
    public VegetarianMeal(String name, String description, int price) {
        super(name, description, price);
    }

    public VegetarianMeal() {
        super();
    }

    ;

    //    создание нового блюда
    public void addNewVegetarian(String name, String description, int price, List<VegetarianMeal> list) {
        VegetarianMeal v = new VegetarianMeal(name, description, price);
        list.add(v);
    }

    //    удаление из меню какого-либо блюда по наименованию
    public void deleteVegetarianItem(String name, List<VegetarianMeal> listOfVegetarianMeals) {
        int i = 0;
        for (VegetarianMeal v : listOfVegetarianMeals) {
            if (name.equals(v.getName())) {
                i = listOfVegetarianMeals.indexOf(v);
            }
        }
        listOfVegetarianMeals.remove(i);
    }

    @Override
    public String toString() {
        return "VegetarianMeal{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
