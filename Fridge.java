package SedmaNedeljaMiniProjekat;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    List<WeightedIngredient> friziderLista = new ArrayList<>();

    public Fridge() {
    }
    public void addIngredient(WeightedIngredient ingredient) {
        boolean sastojakPostoji = false;
        for (var el : friziderLista) {
            if (el.getId() == ingredient.getId()) {
                sastojakPostoji = true;
                el.setWeight(el.getWeight() + ingredient.getWeight());
                break;
            }
        }
        if (sastojakPostoji == false)
            friziderLista.add(ingredient);
    }

    public void removeIngredient(WeightedIngredient ingredient) {
        for (var el : friziderLista) {
            if (el.getId() == ingredient.getId()) {
                friziderLista.remove(el);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String str = "Frizider sadrzi: \nSastojci:\n";
        for (var i : friziderLista) {
            str = str + "- " + i.getNazivSastojka() + ": "
                    + i.getWeight() + "\n";
        }
        return str;
    }
    public boolean mozeJelo(Recipe recipe) { //Klasa objekat
        int brojac = 0;
        for (var el : recipe.weightedIngredientList) {
            for (var el2 : friziderLista) {
                if (el.getId() == el2.getId()) {
                    if (el2.getWeight() >= el.getWeight()) {
                        brojac++;
                    }
                }
            }
        }
        if (brojac == recipe.weightedIngredientList.size()) {
            return true;
        }
        return false;
    }

    public void praviJelo(Recipe recipe) {
        for (var elRecept : recipe.weightedIngredientList) {
            for (var elFrizider : friziderLista) {
                if (elRecept.getId() == elFrizider.getId()) {
                    if (elFrizider.getWeight() >= elRecept.getWeight()) {
                        elFrizider.setWeight(elFrizider.getWeight() - elRecept.getWeight());
                        if (elRecept.getWeight() == 0) {   //Ako ostane 0 weight sastojka, obrisi ga iz frizidera.
                            System.out.println("Nemate dovoljnu kolicinu namirnice.");
                            friziderLista.remove(elFrizider);
                        }
                        break;
                    } else {
                        System.out.println("***Nema dovoljno namernica za ovaj recept.***");
                    }
                }
            }
        }
    }
}
