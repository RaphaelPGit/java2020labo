package be.technifutur.java2020.labo1;

import java.text.ParseException;
import java.util.Scanner;

public class Controleur {
    ModeleMenu modele = new ModeleMenu();
    Vue vue = new Vue();
    StageVue liste = new StageVue();



    public void Ctrl() throws ParseException {
        int i;
        do {
            vue.afficheMenu();
            i = Controleur.getChoice();
            switch (i){
                case 1:
                    StageCtrl.addStage();
                    i=0;
                    break;
                case 2:
                    liste.afficheStage();
                    StageCtrl.searchStage();
                    i=0;
                    break;
                case 3:
                    break;
            }
        }while (i<1 || i > 3);
    }


    private static int getChoice() {
        Scanner scan = new Scanner(System.in);
        int choix = Integer.parseInt(scan.nextLine());
        return choix;
    }


}
