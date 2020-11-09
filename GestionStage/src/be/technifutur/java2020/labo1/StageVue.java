package be.technifutur.java2020.labo1;

import java.util.*;

public class StageVue {

    ListeStage liste = new ListeStage();




    public void afficheStage(){
        HashMap<Integer, List<String>> listeStage= liste.getListe();
        for (Integer i : listeStage.keySet()) {
            System.out.println(i + " : " + listeStage.get(i));
        }
    }


}
