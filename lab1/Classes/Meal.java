package Classes;

import java.util.List;

public class Meal {
    String name; //наименование
    String description; //описание блюда
    int price; //цена

//    конструктор
    public Meal(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Meal(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
