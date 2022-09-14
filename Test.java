package SedmaNedeljaMiniProjekat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Sastojci
        var sastojak1=new WeightedIngredient(1,"Secer",3.00,156.14);
        var sastojak2=new WeightedIngredient(2,"SO",0.10,93);
        var sastojak3=new WeightedIngredient(3,"zuti secer",2.6,97.33);
        var sastojak4=new WeightedIngredient(4,"brasno", 1,80);
        var sastojak5=new WeightedIngredient(5,"ulje",0.2,200);
        var sastojak6=new WeightedIngredient(6,"jaja", 1,18);
        var sastojak7=new WeightedIngredient(7,"voda",1,50);
        var sastojak8=new WeightedIngredient(8,"kisela voda",1.5,65);
        var sastojak9=new WeightedIngredient(9,"cimet",0.03,34);
        var sastojak10=new WeightedIngredient(10, "jabuke",1.5,165);
        var sastojak11=new WeightedIngredient(11, "banane",1.5,133);
        var sastojak12=new WeightedIngredient(12,"jagode", 0.5, 350);
        var sastojak13=new WeightedIngredient(13,"maline",0.25,150);
        var sastojak14=new WeightedIngredient(14,"prasak za pecivo",0.01,13.33);
        var sastojak15=new WeightedIngredient(15,"kvasac",0.03,20);

        //Recepti, dodavanje sastojaka u recepte
        var rec1=new Recipe("Supa od jaja", Recipe.TezinaRecepta.EASY);
        rec1.weightedIngredientList.add(sastojak6);
        rec1.weightedIngredientList.add(sastojak6);
        rec1.weightedIngredientList.add(sastojak7);
        var rec2=new Recipe("Kafanski dorucak", Recipe.TezinaRecepta.MEDIUM);
        rec2.weightedIngredientList.add(sastojak6);
        rec2.weightedIngredientList.add(sastojak6);
        rec2.weightedIngredientList.add(sastojak6);
        rec2.weightedIngredientList.add(sastojak4);
        rec2.weightedIngredientList.add(sastojak2);
        var rec3= new Recipe("Domaci hleb", Recipe.TezinaRecepta.HARD);
        rec3.weightedIngredientList.add(sastojak4);
        rec3.weightedIngredientList.add(sastojak6);
        rec3.weightedIngredientList.add(sastojak6);
        rec3.weightedIngredientList.add(sastojak8);
        rec3.weightedIngredientList.add(sastojak14);
        rec3.weightedIngredientList.add(sastojak15);
        rec3.weightedIngredientList.add(sastojak15);
        var rec4= new Recipe("Vocni kolac", Recipe.TezinaRecepta.PRO);
        rec4.weightedIngredientList.add(sastojak14);
        rec4.weightedIngredientList.add(sastojak13);
        rec4.weightedIngredientList.add(sastojak12);
        rec4.weightedIngredientList.add(sastojak11);
        rec4.weightedIngredientList.add(sastojak11);
        rec4.weightedIngredientList.add(sastojak10);
        rec4.weightedIngredientList.add(sastojak6);
        rec4.weightedIngredientList.add(sastojak5);
        rec4.weightedIngredientList.add(sastojak1);
        var rec5= new Recipe("Palacinke", Recipe.TezinaRecepta.MEDIUM);
        rec5.weightedIngredientList.add(sastojak1);
        rec5.weightedIngredientList.add(sastojak2);
        rec5.weightedIngredientList.add(sastojak4);
        rec5.weightedIngredientList.add(sastojak5);
        rec5.weightedIngredientList.add(sastojak6);
        rec5.weightedIngredientList.add(sastojak8);
        var rec6= new Recipe("Vocna salata", Recipe.TezinaRecepta.EASY);
        //Dodavanje u omiljene recepte
        rec6.setFavorite(true);
        rec6.weightedIngredientList.add(sastojak10);
        rec6.weightedIngredientList.add(sastojak11);
        rec6.weightedIngredientList.add(sastojak12);
        rec6.weightedIngredientList.add(sastojak13);
        var rec7= new Recipe("Slatko od maline", Recipe.TezinaRecepta.BEGINNER);
        rec7.weightedIngredientList.add(sastojak1);
        rec7.weightedIngredientList.add(sastojak13);
        var rec8= new Recipe("Slatko od jagode", Recipe.TezinaRecepta.BEGINNER);
        rec8.setFavorite(true);
        rec8.weightedIngredientList.add(sastojak1);
        rec8.weightedIngredientList.add(sastojak1);
        rec8.weightedIngredientList.add(sastojak12);
        var rec9= new Recipe("Banana bread", Recipe.TezinaRecepta.PRO);
        rec9.weightedIngredientList.add(sastojak4);
        rec9.weightedIngredientList.add(sastojak4);
        rec9.weightedIngredientList.add(sastojak6);
        rec9.weightedIngredientList.add(sastojak11);
        rec9.weightedIngredientList.add(sastojak14);
        var rec10=new Recipe("Cinnamon rolls", Recipe.TezinaRecepta.PRO);
        //Dodavanje u omiljene recepte
        rec10.setFavorite(true);
        //Brisanje recepta iz omiljenih!!!
//        rec10.setFavorite(false);
        rec10.weightedIngredientList.add(sastojak1);
        rec10.weightedIngredientList.add(sastojak3);
        rec10.weightedIngredientList.add(sastojak4);
        rec10.weightedIngredientList.add(sastojak5);
        rec10.weightedIngredientList.add(sastojak6);
        rec10.weightedIngredientList.add(sastojak9);
        rec10.weightedIngredientList.add(sastojak14);

        //Dodavanje svih recepata u listu
        ArrayList<Recipe>sviRecepti=new ArrayList<>();

//        Recipe[]receptiArray=new Recipe[sviRecepti.size()];
//        receptiArray=sviRecepti.toArray(receptiArray);
        sviRecepti.add(rec1);
        sviRecepti.add(rec2);
        sviRecepti.add(rec3);
        sviRecepti.add(rec4);
        sviRecepti.add(rec5);
        sviRecepti.add(rec6);
        sviRecepti.add(rec7);
        sviRecepti.add(rec8);
        sviRecepti.add(rec9);
        sviRecepti.add(rec10);

        System.out.println("********************************************************************");

        //Pravljenje jela po zadatoj ceni
        double trazenaCenaJela=600;
        ArrayList<Recipe>ovoMoguDaNapravim=new ArrayList<>();
        double suma=0.0;
        for(var el : sviRecepti) {
            suma =suma+ el.getPrice();

            if (suma<=trazenaCenaJela) {
                ovoMoguDaNapravim.add(el);
            }
        }
        System.out.println("Za "+trazenaCenaJela+" din moze da se napravi: "+ovoMoguDaNapravim.size()+" jela.");
        for(var el: ovoMoguDaNapravim){
            System.out.println(el.getNazivRecepta()+", cena "+el.getPrice());
        }
        System.out.println("********************************************************************");

        //Pravljenje scaliranog jela (npr pola mere)
        var rec10scale=rec10.newRecipe(0.5);
        System.out.println("Recept 10 - pola mere " + rec10scale);                     //pola mere
        System.out.println("********************************************************************");
        //Gledamo kolika je cena recepta 10
        var cenarec10= rec10.getPrice();
        System.out.println(cenarec10);
        System.out.println("********************************************************************");

        //Punimo frizider
        var fr=new Fridge();
        fr.addIngredient(new WeightedIngredient(1,"Secer",3.00,156.14));
        fr.addIngredient(new WeightedIngredient(1,"Secer",3.00,156.14));
        fr.addIngredient(new WeightedIngredient(1,"Secer",3.00,156.14));
        fr.addIngredient(new WeightedIngredient(2,"SO",5,15));
        fr.addIngredient(new WeightedIngredient(2,"SO",8,15));
        fr.addIngredient(new WeightedIngredient(6,"jaja", 1,18));
        fr.addIngredient(new WeightedIngredient(6,"jaja", 1,18));
        fr.addIngredient(new WeightedIngredient(6,"jaja", 1,18));
        fr.addIngredient(new WeightedIngredient(6,"jaja", 1,18));

        //Da li je moguce napraviti neko jelo
        System.out.println(fr.mozeJelo(rec10));
        //Proveravamo sta frizider sadrzi
        System.out.println(fr);
        fr.praviJelo(rec2);
        //Proveravamo sta je ostalo u frizideru nakon pravljenja recepta rec2.
        System.out.println(fr);

        System.out.println("********************************************************************");
        //Proveravamo koja je cena recepta 3
        System.out.println(rec3.getPrice());
        System.out.println("********************************************************************");
        //Proveravamo tezinu recepta rec7.
        System.out.println(rec7.difficulty);
        System.out.println("********************************************************************");
        //Pravljenje liste omiljeni recepti i dodavanje u listu
        ArrayList<Recipe>omiljeniRecepti=new ArrayList<>();

        for(var el: sviRecepti){
            if(el.isFavorite()){
            omiljeniRecepti.add(el);
            }
        }

        //Izlistavanje omiljenih recepta
        System.out.println("Omiljeni recepti: ");
        for(var el: omiljeniRecepti){
            System.out.println(el.getNazivRecepta());
        }
        System.out.println("********************************************************************");
        //Poredjaj recepte po tezini
//        for(int i=0;i<sviRecepti.size();i++){
//            for(int j=i+1;j< sviRecepti.size();j++){
////                if(sviRecepti[i].getD


//                }
//        }
    }
}
