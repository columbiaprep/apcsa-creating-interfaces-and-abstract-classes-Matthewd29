public class Item extends Entity{
    private String name
    private double weight;
    private int cost;
    private int quantity;
    private statModifiers itemStatMods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public statModifiers getItemStatMods() {
        return itemStatMods;
    }

    public void setItemStatMods(statModifiers itemStatMods) {
        this.itemStatMods = itemStatMods;
    }
}