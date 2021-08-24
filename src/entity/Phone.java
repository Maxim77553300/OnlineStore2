package entity;

import java.util.UUID;

public class Phone {
    private Integer id;
    private String model;
    private Integer price;

    public Phone(Integer id, String model, Integer price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {

        this.id = generateID();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static Integer generateID() {

        UUID idOne = UUID.randomUUID();
        String str = "" + idOne;
        int uid = str.hashCode();
        String filterStr = "" + uid;
        str = filterStr.replaceAll("-", "");
        return Integer.parseInt(str);

    }

    @Override
    public String toString() {
        return "id, " + ", model phone ='" + model + '\'' +
                ", price=" + price + "$\n";
    }
}
