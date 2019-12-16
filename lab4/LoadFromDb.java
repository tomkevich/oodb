package lab4;

import Classes.MainDish;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class LoadFromDb {
    public static List<MainDish> loadMenuJson(Connection connection) throws SQLException {
        long start = System.currentTimeMillis();
        String pStr = "";

        PreparedStatement statement = connection.prepareStatement("SELECT con FROM MenuCafe WHERE id = 1");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("con");
        }

        statement.close();
        Gson gson = new Gson();
        MainDish[] list = gson.fromJson(pStr, MainDish[].class);

        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Время загрузки из базы данных json = " + result);
        return Arrays.asList(list);
    }

    public static List<MainDish> loadMeniJsonb(Connection connection) throws SQLException {
        long start = System.currentTimeMillis();
        String pStr = "";

        PreparedStatement statement = connection.prepareStatement("SELECT conb FROM MenuCafe WHERE id = 1");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("conb");
        }

        statement.close();
        Gson gson = new Gson();
        MainDish[] list = gson.fromJson(pStr, MainDish[].class);

        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Время загрузки из базы данных jsonb = " + result);
        return Arrays.asList(list);
    }
}
