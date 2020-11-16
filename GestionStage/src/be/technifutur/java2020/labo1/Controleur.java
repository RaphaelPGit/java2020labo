package be.technifutur.java2020.labo1;

import java.text.ParseException;
import java.util.Scanner;

public class Controleur {

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
                    i=0;
                    break;
                case 3:
                    StageCtrl.searchStage();
                    vue.afficheMenuA();
                    StageCtrl.modif(Controleur.getChoice2());
                    i=0;
                    break;
                case 4:
                    break;
            }
        }while (i<1 || i > 4);
    }

    private static int getChoice() {
        Scanner scan = new Scanner(System.in);
        int choix = Integer.parseInt(scan.nextLine());
        return choix;
    }

    private static int getChoice2() {
        Scanner scan = new Scanner(System.in);
        int choix = 1;
        do {
            choix = Integer.parseInt(scan.nextLine());
        }while (choix <1 || choix > 5);

        return choix;
    }

}
