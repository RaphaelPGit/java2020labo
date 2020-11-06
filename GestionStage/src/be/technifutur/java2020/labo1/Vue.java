package be.technifutur.java2020.labo1;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;
import be.technifutur.java2020.labo1.ModeleMenu;


public class Vue{
    Scanner scan =  new Scanner(System.in);
    StageCtrl ctrl = new StageCtrl();
    Stage stage = new Stage();
    ListeStage liste = new ListeStage();
    ModeleMenu modele = new ModeleMenu();



    public void afficheMenu(){
        System.out.println("---------------------------");
        System.out.println("- Sélectionner une option -");
        System.out.println("---------------------------");
        modele.afficheMenu();
    }

/*
        System.out.println("1: Ajouter un stage");
        System.out.println("2: Supprimer un stage");
        System.out.println("3: Modifier un stage");
        System.out.println("4: Afficher la liste de stage");
        String name = scan.nextLine();
        int i=Integer.parseInt(name);
        switch (i){
            case 1:
                ctrl.addStage();
                break;
            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
                break;
            case 4:
                System.out.println("case4");
                break;
        }

        liste.afficheListe();*/






}
