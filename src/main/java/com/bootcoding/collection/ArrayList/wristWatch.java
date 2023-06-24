package main.java.com.bootcoding.collection.ArrayList;

public class wristWatch {
    String Type;
    float price;
    String material;

    public wristWatch(String type, float price, String material) {
        Type = type;
        this.price = price;
        this.material = material;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "wristWatch{" +
                "Type='" + Type + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
