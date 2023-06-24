package main.java.com.bootcoding.collection.ArrayList;

public class WallWatch {
  String colour;
  int price;
  String Material;

    public WallWatch(String colour, int price, String material) {
        this.colour = colour;
        this.price = price;
        Material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    @Override
    public String toString() {
        return "WallWatch{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", Material='" + Material + '\'' +
                '}';
    }
}
