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


}
