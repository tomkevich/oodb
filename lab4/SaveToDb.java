package lab4;

import Classes.MainDish;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SaveToDb {
    public static void Save(List<MainDish> list, Connection connection) throws SQLException {
//        Добавление фрагмента меню в базу данных в формате json и jsonb
        Gson gson = new Gson();
        String asJson = gson.toJson(list);

        PreparedStatement statement = connection.prepareStatement("INSERT INTO MenuCafe(con, conb) VALUES ( cast(? as json), cast(? as jsonb))");
        statement.setString(1, asJson);
        statement.setString(2, asJson);
        statement.executeUpdate();
        statement.close();

    }

    public static void getTime(List<MainDish> list, Connection connection) throws SQLException {
//        Метод для сравнения времени добавления в бд json и jsonb
        Gson gson = new Gson();
        String asJson = gson.toJson(list);
        long start = 0;
        long stop = 0;
        long result = 0;

//        Сохранение json
        start = System.currentTimeMillis();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO MenuCafe(con) VALUES (cast (? as json))");
        statement.setString(1, asJson);
        statement.executeUpdate();
        stop = System.currentTimeMillis();

        result = stop - start;
        System.out.println("Время добавления json = " + result);


//        Сохранение jsonb
        start = System.currentTimeMillis();
        statement = connection.prepareStatement("INSERT INTO MenuCafe(conb) VALUES (cast (? as jsonb))");
        statement.setString(1, asJson);
        statement.executeUpdate();
        stop = System.currentTimeMillis();

        result = stop - start;
        System.out.println("Время добавления jsonb = " + result);

        statement.close();
    }
}
