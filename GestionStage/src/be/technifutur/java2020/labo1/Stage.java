package be.technifutur.java2020.labo1;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stage {
    private static String name;
    private static Date dateDebut;
    private static Date dateFin;


    public static List<String> addStage(){
        List<String> stage = new ArrayList<String>();
        stage.add(dateDebut.toString());
        stage.add(dateFin.toString());
        return stage;
    }

    public static void setName(String name1){
        name=name1;
    }

    public static String getName(){
        return name;
    }

    public static void setDateDebut(Date date1){


        dateDebut = date1;
    }

    public static void setDatefin(Date date2) throws ParseException {
        dateFin = date2;
        if (dateDebut.after(dateFin)){
            System.out.println("Date de début du stage supérieur à la date de fin");
            dateDebut = null;
            name = null;
            dateFin = null;
            StageCtrl.addStage();

        }else {
            ListeStage.addStage();
        }
    }

    public static void isValid(){

    }

    public static void modifName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        ListeStage.modifName(name);
    }
}
