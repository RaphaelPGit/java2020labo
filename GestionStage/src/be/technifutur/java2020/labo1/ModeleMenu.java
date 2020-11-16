package be.technifutur.java2020.labo1;


import java.util.HashMap;

public class ModeleMenu {

    private HashMap<Integer, String> mapMenu = new HashMap<Integer, String>();

    public ModeleMenu() {
        HashMap<Integer, String> mapMenu = this.mapMenu;
        mapMenu.put(1,"Ajouter un stage");
        mapMenu.put(2,"Afficher les stages");
        mapMenu.put(3,"Rechercher un stage");
        mapMenu.put(4,"Quitter");
        this.mapMenu =  mapMenu;
    }






    public void afficheMenu(){
        for (Integer i : mapMenu.keySet()) {
            System.out.println(i + " : " + mapMenu.get(i));
        }
    }






}





