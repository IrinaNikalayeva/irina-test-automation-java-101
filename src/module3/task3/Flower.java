package module3.task3;

public class Flower {
    protected int id;
    protected String flowerName;
    protected Double flowerPrice;

    public Flower(int id, String flowerName, Double flowerPrice) {
        this.id = id;
        this.flowerName = flowerName;
        this.flowerPrice = flowerPrice;
    }

    public Double getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public void setFlowerPrice(Double flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFlowerName() {

        return flowerName;
    }

    @Override
    public String toString() {
        return
                "id=" + id + " " + "Name= " + flowerName + " " + "Price=" + flowerPrice;
    }
}
