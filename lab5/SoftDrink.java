package lab5;

import org.postgresql.util.PGobject;
import org.postgresql.util.PGtokenizer;

public class SoftDrink  extends PGobject {
    private String name;
    private double amount;
    private int price;

    public SoftDrink(){
        setType("softDrink");
    }

    public void setValue(String value) {
        String str = value.substring(1, value.length()-1);
        PGtokenizer gtokenizer = new PGtokenizer(str, ',');

        name = gtokenizer.getToken(0);
        amount = Double.parseDouble(gtokenizer.getToken(1));
        price = Integer.parseInt(gtokenizer.getToken(2));

        System.out.println(name + "," + amount + "," + price);

    }
    public String getValue(){
        return "('" + getName() + "','" + getAmount() + "','" + getPrice() + "')";

    }

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
        return "SoftDrink{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
