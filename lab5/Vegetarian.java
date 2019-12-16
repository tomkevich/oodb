package lab5;

import org.postgresql.util.PGobject;
import org.postgresql.util.PGtokenizer;

public class Vegetarian extends PGobject {
    String name;
    String description;
    int price;

    public Vegetarian() {
        setType("vegetarian");
    }

    public void setValue(String value){
        String str = value.substring(1, value.length()-1);
        PGtokenizer gtokenizer = new PGtokenizer(str, ',');

        name = gtokenizer.getToken(0);
        description = gtokenizer.getToken(1);
        price = Integer.parseInt(gtokenizer.getToken(2));

        System.out.println(name + "," + description + "," + price);
    }

    public String getValue(){
        return "('" + getName() + "','" + getDescription() + "','" + getPrice() + "')";

    }

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
        return "Vegetarian{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
