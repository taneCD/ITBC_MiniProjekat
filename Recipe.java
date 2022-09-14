package SedmaNedeljaMiniProjekat;

import java.util.ArrayList;
import java.util.List;

public class Recipe implements Priceable{
    private final String nazivRecepta;
    public TezinaRecepta difficulty;
    public enum TezinaRecepta {BEGINNER, EASY, MEDIUM, HARD, PRO};

    boolean favorite=false;

    List<WeightedIngredient> weightedIngredientList=new ArrayList<>();

    public double getPrice() { //ukupna cena recepta
        double suma=0;
        for(var el:weightedIngredientList){
            suma=el.getPrice()+suma;
        }
        return suma;
    }
    public Recipe(String nazivRecepta, TezinaRecepta difficulty) {
        this.nazivRecepta = nazivRecepta;
        this.difficulty=difficulty;
    }

    //metoda za dodavanje i brisanje sastojaka
    public void WeightedIngredientAdd(WeightedIngredient sastojak){
        this.weightedIngredientList.add(sastojak);
    }
    public void WeightedIngredientRemove(WeightedIngredient sastojak){
        this.weightedIngredientList.remove(sastojak);
    }
    public Recipe newRecipe(double scale){
        var noviRecept = new Recipe(this.nazivRecepta, difficulty);
        for(var i : this.weightedIngredientList ){
            var skaliraniSastojak=new WeightedIngredient(i.getId(),i.getNazivSastojka(),i.getWeight()*scale,i.getPricePerUnit());

            noviRecept.weightedIngredientList.add(skaliraniSastojak);
        }
        return noviRecept;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    @Override
    public String toString() {
        String str = "Recept: " + this.nazivRecepta+", Omiljeni "+favorite + ", tezina recepta: "+difficulty+"\nSastojci:\n";
        for(var i:weightedIngredientList) {
            str = str + "- " + i.getNazivSastojka() + ": "
                    + i.getWeight() + "\n";
        }
        return str;
    }
}
