package be.technifutur.java2020.labo1;

import java.util.Scanner;
import be.technifutur.java2020.labo1.ModeleMenu;

public class StageCtrl {
    StageVue vue = new StageVue();
    Stage stage = new Stage();
    Scanner scan = new Scanner(System.in);


    public static void addStage(){
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("- Entrer le nom du stage : -");
        System.out.println("----------------------------");
        String name = scan.nextLine();
        Stage.setName(name);
        System.out.println(Stage.getName());
    }



    /*public static void main(String[] args) {
        Stage stage = new Stage();
        StageVue vue = new StageVue();
        ListeStage liste = new ListeStage();

        System.out.println("Entrez le nom de votre nouvelle formation :");
        Scanner entre = new Scanner(System.in);

        String name = entre.nextLine();




        stage.setName(name);
        stage.getName();
        stage.run();
        stage.getName();

        entre = new Scanner(System.in);

        name = entre.nextLine();

        stage.setName(name);
        stage.getName();
        stage.run();
        stage.getName();
    }*/



}
