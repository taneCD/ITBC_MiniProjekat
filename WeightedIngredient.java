package SedmaNedeljaMiniProjekat;

public class WeightedIngredient extends Ingredient{
    public double weight;
    public double pricePerUnit;

    public WeightedIngredient(int id, String nazivSastojka, double weight, double pricePerUnit) {
        super(id, nazivSastojka);
        this.weight = weight;
        this.pricePerUnit = pricePerUnit;
    }
    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getPrice() {
        return weight*pricePerUnit;
    }
}
