package b1;

public abstract class Product {
    private int id;
    private String name;
    private int size;
    private double price;
    private int quanlity;
    public Product () {}
    public Product (int id, String name, int size, double price, int quanlity) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.quanlity = quanlity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
    public abstract double getTotalPrice();
    @Override
    public String toString() {
        return String.format("Id: %d, Name: %s, Size: %d, Price: %f, Quanlity: %d\n", this.id, this.name, this.size, this.price, this.quanlity);
    }
}
