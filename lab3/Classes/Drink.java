package Classes;

public class Drink {
    String name; //наименование
    double amount; //объем
    int price; //цена

//    конструктор
    public Drink(String name, double amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Drink(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
