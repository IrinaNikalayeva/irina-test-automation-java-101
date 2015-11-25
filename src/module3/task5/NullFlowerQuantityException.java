package module3.task5;


public class NullFlowerQuantityException extends Exception {
    private String DetailMsg;

    public NullFlowerQuantityException(String DetailMsg) {
        this.DetailMsg = DetailMsg;
    }

    public String toString() {
        return "You've entered 0 for the quantity!" + DetailMsg;

    }
}
