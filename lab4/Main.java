package lab4;

import Classes.MainDish;
import Classes.Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            /* Подключение к базе данных */
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/oodb";
            String login = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, login, password);

            MainDish.addNewMainDish("Салат", "Салат с морепродуктами" ,300, Menu.mainDishes);
            MainDish.addNewMainDish("Суп", "" ,600, Menu.mainDishes);
            MainDish.addNewMainDish("Мясная тарелка", "Ассорти из 6 видов мяса" ,1500, Menu.mainDishes);
            MainDish.addNewMainDish("Пицца", "Пицца маргарита" ,350, Menu.mainDishes);

//            Сохранение в бд
            SaveToDb.Save(Menu.mainDishes, con);


//            Загрузка из бд
            Menu.mainDishes = LoadFromDb.loadMenuJson(con);     /* json */
            Menu.mainDishes = LoadFromDb.loadMeniJsonb(con);    /* jsonb */

//            Измерение времени для сохранения в бд
            SaveToDb.getTime(Menu.mainDishes, con);

            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
