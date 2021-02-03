package java_hotel_system_entities;

public class Type {
    int id;
    String label;
    String price;

    public Type() {
    }

    public Type(String label, String price) {
        this.label = label;
        this.price = price;
    }

    public Type(int id, String label, String price) {
        this.id = id;
        this.label = label;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + id + ", label=" + label + ", price=" + price + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
