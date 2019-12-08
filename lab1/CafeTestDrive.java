import Classes.Meal;
import Classes.Menu;
import Classes.SoftDrink;
import Classes.VegetarianMeal;

public class CafeTestDrive {
    public static void main(String[] args) {
//        создаем экземпляры класса
        Menu menu = new Menu();
        VegetarianMeal v = new VegetarianMeal();
        SoftDrink s = new SoftDrink();

//        добавляем новые блюда
        v.addNewVegetarian("Salad", "This is vegetarian meal!", 500, menu.vegetarianMeals);
        v.addNewVegetarian("Cheesecakes", "This is also vegetarian meal", 650, menu.vegetarianMeals);
        v.addNewVegetarian("error", "this is not right meal", 100, menu.vegetarianMeals);
        System.out.println(menu.vegetarianMeals.toString());

//        удаляем блюдо
        v.deleteVegetarianItem("error", menu.vegetarianMeals);
        System.out.println(menu.vegetarianMeals.toString());

//        добавляем новые напитки
        s.addNewSoftDrink("Lemonade", 350.0, 150, menu.softDrinks);
        s.addNewSoftDrink("Mohito", 450.0, 250, menu.softDrinks);
        System.out.println(menu.softDrinks.toString());

//        удаляем напиток из меню
        s.deleteSoftDrinkItem("Mohito", menu.softDrinks);
        System.out.println(menu.softDrinks.toString());
    }
}
