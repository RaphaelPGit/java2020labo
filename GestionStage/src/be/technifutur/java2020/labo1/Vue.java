package be.technifutur.java2020.labo1;



public class Vue{
    ModeleMenu modele = new ModeleMenu();
    MenuModif modif = new MenuModif();


    public void afficheMenu(){
        System.out.println("---------------------------");
        System.out.println("- Sélectionner une option -");
        System.out.println("---------------------------");
        modele.afficheMenu();
    }

    public void afficheMenuA(){
        System.out.println("---------------------------");
        System.out.println("- Sélectionner une option -");
        System.out.println("---------------------------");
        modif.afficheMenu();
    }


}
