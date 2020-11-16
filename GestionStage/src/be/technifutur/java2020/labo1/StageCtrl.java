package be.technifutur.java2020.labo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StageCtrl {
    StageVue vue = new StageVue();
    Stage stage = new Stage();
    Scanner scan = new Scanner(System.in);


    public static void addStage() throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        dateFormat.setLenient(false);
        String dateString;

        System.out.println("--------------------------");
        System.out.println("- Entrer le nom du stage -");
        System.out.println("--------------------------");
        String name = scan.nextLine();
        Stage.setName(name);

        System.out.println("-----------------------------------------------------------");
        System.out.println("- Entrer la date et l'heure de début du stage (jj mm aaaa)-");
        System.out.println("-----------------------------------------------------------");
        dateString = scan.nextLine();
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
            Stage.setDateDebut(date);
        }
        catch (Exception e) {
            System.err.println("Format de date invalide. Usage : jj mm aaaa");
            StageCtrl.addStage();
        }


        System.out.println("------------------------------------------------------------");
        System.out.println("- Entrer la date et l'heure de la fin du stage (jj mm aaaa)-");
        System.out.println("------------------------------------------------------------");
        dateString = scan.nextLine();
        try {
            date = dateFormat.parse(dateString);
            Stage.setDatefin(date);
        }
        catch (Exception e) {
            System.err.println("Format de date invalide. Usage : jj mm aaaa");
            StageCtrl.addStage();
        }
    }


    public static void searchStage(){
        ListeStage liste = new ListeStage();
        HashMap<String, List<String>> listeStage = liste.getListe();
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("- Entrer le nom d'un stage -");
        System.out.println("----------------------------");
        String name = scan.nextLine();
        if(listeStage.containsKey(name)){
            System.out.println(listeStage.get(name));
        }else {
            System.out.println("Stage introuvable");
        }



    }


    public static void modif(int choice) {

                switch (choice){
                    case 1:
                        Stage.modifName();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        break;
                }
    }
}
