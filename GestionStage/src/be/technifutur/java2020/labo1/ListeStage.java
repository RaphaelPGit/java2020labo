package be.technifutur.java2020.labo1;

import java.util.Scanner;

public class ListeStage {
    private Stage[] list;
    private int nbStage = 0;
    private Scanner scan;

    public ListeStage(){
        list = new Stage[10];
    }



    public void addStage(String nom){

        Stage stage = new Stage();
        stage.setName(nom);

        list[nbStage] = stage;
        nbStage++;
    }

    public void afficheListe(){

        for (int i=0;i < list.length;i++){
            System.out.printf(" - %d %s%n", i+1,list[i]);

        }
    }






}
