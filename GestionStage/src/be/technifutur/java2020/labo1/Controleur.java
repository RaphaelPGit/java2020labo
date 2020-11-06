package be.technifutur.java2020.labo1;

import java.util.Scanner;

public class Controleur {
    ModeleMenu modele = new ModeleMenu();
    Vue vue = new Vue();



    public void Ctrl(){
        vue.afficheMenu();
        int i = Controleur.getChoice();
        switch (i){
            case 1:
                StageCtrl.addStage();
        }
    }

    private static int getChoice() {
        Scanner scan = new Scanner(System.in);
        int choix = Integer.parseInt(scan.nextLine());
        return choix;
    }
}
