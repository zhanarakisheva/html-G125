public class Phone {
    private String name;
    private String model;
    private int price;

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String getCategory() {
        if (price > 1000) {
            return "TOP";
        } else if (price >= 500) {
            return "MEDIUM";
        }
        return "SIMPLE";
    }
}
