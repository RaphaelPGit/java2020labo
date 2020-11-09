package be.technifutur.java2020.labo1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Stage {
    private static String name;
    private static Date dateDebut;
    private LocalDateTime dateFin;

    public static List<String> addStage(){
        List<String> stage = new ArrayList<String>();
        /*
        List<String> stage = Collections.singletonList(name);
        */
        stage.add(name);
        stage.add(dateDebut.toString());


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
}
