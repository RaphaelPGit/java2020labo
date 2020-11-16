package be.technifutur.java2020.labo1;

import java.util.*;
import java.util.stream.Collectors;

public class StageVue {
    ListeStage liste = new ListeStage();


    public void afficheStage(){
        HashMap<String, List<String>> listeStage= liste.getListe();
        ArrayList liste = new ArrayList<>(listeStage.entrySet());
        for(Object elem: liste)
        {
            System.out.println (elem);
        }
    }


}
