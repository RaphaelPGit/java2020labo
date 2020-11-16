package be.technifutur.java2020.labo1;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ListeStage {
    private static HashMap<String, List<String>> listeStage = new HashMap<String, List<String>>();
    private static int nbStage =1;
    private Scanner scan;

    public ListeStage(){

    }

    public static void addStage(){
        listeStage.put(Stage.getName(),Stage.addStage());
        nbStage ++;
    }

    public HashMap<String, List<String>> getListe(){
       HashMap<String, List<String>> listeStage = this.listeStage;
       return listeStage;
    }

    public static void modifName(String name){
        listeStage.replace(name,listeStage.remove( "oldKey" ));
    }




}
