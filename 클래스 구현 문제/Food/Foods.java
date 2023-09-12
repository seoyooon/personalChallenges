package Q230809;
public class Foods {
    private String name;
    private int price;
    private int order;
    private int totalAmount;

    public Foods() {
        this.name = null;
        this.price = 0;
        this.order = 0;
        this.totalAmount = 0;
    }

    public Foods(String name, int price, int order, int totalAmount) {
        this.name = name;
        this.price = price;
        this.order = order;
        this.totalAmount = totalAmount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getOrder() {
        return order;
    }

    public int getTotalAmount() {
        return (price * order);
    }

    public void setName() {
        this.name = name;
    }
}