package module3.task5;


public class NegativePriceException extends Exception {
    private String DetailMsg;

    public NegativePriceException(String DetailMsg) {
        this.DetailMsg = DetailMsg;
    }

    public String toString() {
        return "Negative flower's price was found! Please correct the list!" + DetailMsg;

    }
}
