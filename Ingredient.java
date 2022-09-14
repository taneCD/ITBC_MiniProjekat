package SedmaNedeljaMiniProjekat;

public abstract class Ingredient {
    public int id;
    public String nazivSastojka;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public Ingredient(int id, String nazivSastojka) {
        this.id = id;
        this.nazivSastojka = nazivSastojka;

    }
}

