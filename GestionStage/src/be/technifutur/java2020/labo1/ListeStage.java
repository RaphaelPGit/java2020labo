package be.technifutur.java2020.labo1;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ListeStage {
    private static HashMap<Integer, List<String>> listeStage = new HashMap<Integer, List<String>>();
    private static int nbStage =1;
    /*private Stage[] list;

     */
    private Scanner scan;

    public ListeStage(){
      /*  listeStage = new HashMap<Integer, Stage>();
        list = new Stage[10];

       */
    }
    public static void addStage(){

        listeStage.put(nbStage,Stage.addStage());
        nbStage ++;

    }

    public HashMap<Integer, List<String>> getListe(){
       HashMap<Integer, List<String>> listeStage = this.listeStage;
       return listeStage;


    }




}
