package ghidoituong;

public class Product {
    private int proID;
    private String proName;
    private double price;


    public Product() {
    }

    public Product(int proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "proID=" + proID +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
