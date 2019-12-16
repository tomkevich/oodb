package lab5;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/oodb";
            String login = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, login, password);

            Load(con);
            Save(con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    public static void Save(Connection connection) throws SQLException {
        MainDish mainDish = new MainDish();
        Vegetarian vegetarian = new Vegetarian();
        SoftDrink softDrink = new SoftDrink();
        AlcoholicDrink alcoholicDrink = new AlcoholicDrink();

        mainDish.setName("Soup");
        mainDish.setDescription("this is main dish");
        mainDish.setPrice(350);
        vegetarian.setName("Salad");
        vegetarian.setDescription("this is vegetarian meal");
        vegetarian.setPrice(300);
        softDrink.setName("Limonade");
        softDrink.setAmount(250.0);
        softDrink.setPrice(150);
        alcoholicDrink.setName("Mohito");
        alcoholicDrink.setAmount(250.0);
        alcoholicDrink.setPrice(330);

        PreparedStatement statement = connection.prepareStatement("INSERT INTO MeuCafe (mainDish, vegetarian, softDrink, alDrink) VALUES" +
                " (row " + mainDish.getValue() + ", row " + vegetarian.getValue() + ", row " + softDrink.getValue() + ", row " + alcoholicDrink.getValue() + ")");
        statement.executeQuery();
        statement.close();
    }

    public static void Load(Connection connection) throws SQLException {
        MainDish mainDish = new MainDish();
        Vegetarian vegetarian = new Vegetarian();
        SoftDrink softDrink = new SoftDrink();
        AlcoholicDrink alcoholicDrink = new AlcoholicDrink();

        String mainStr = "";
        String vegStr = "";
        String softStr = "";
        String alStr = "";

        PreparedStatement statement = connection.prepareStatement("SELECT (mainDish) FROM MenuCafe");
        ResultSet resultSet = statement.executeQuery();
        System.out.println("MainDish");
        while (resultSet.next()){
            mainStr = resultSet.getString("mainDish");
            mainDish.setValue(mainStr);
        }

        PreparedStatement statement1 = connection.prepareStatement("SELECT (vegetarian) FROM MenuCafe");
        ResultSet resultSet1 = statement1.executeQuery();
        System.out.println("Vegetarian");
        while (resultSet1.next()){
            vegStr = resultSet1.getString("vegetarian");
            vegetarian.setValue(vegStr);
        }

        PreparedStatement statement2 = connection.prepareStatement("SELECT (softDrink) FROM MenuCafe");
        ResultSet resultSet2 = statement2.executeQuery();
        System.out.println("SoftDrink");
        while (resultSet2.next()){
            softStr = resultSet2.getString("softDrink");
            softDrink.setValue(softStr);
        }

        PreparedStatement statement3 = connection.prepareStatement("SELECT (alDrink) FROM MenuCafe");
        ResultSet resultSet3 = statement3.executeQuery();
        System.out.println("AlcoholicDrink");
        while (resultSet3.next()){
            alStr = resultSet3.getString("alDrink");
            alcoholicDrink.setValue(alStr);
        }

    }
}
