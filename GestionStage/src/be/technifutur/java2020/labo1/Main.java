package be.technifutur.java2020.labo1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Controleur ctrl = new Controleur();
        String choix;



            ctrl.Ctrl();

























        /*
        Menu[] menu = new Menu[]{
                new Stage(),
                new Vue()
        };
        Scanner entre = new Scanner(System.in);
        String input = null;
        boolean quit = false;
        do {
            displayMenu(menu);
            input = entre.nextLine();
            int choice = Integer.parseUnsignedInt(input)-1;
            menu[choice].run();
        }while (!quit);
    }

    private static void displayMenu(Menu[] menu) {
        System.out.println();
        for (int i=0;i< menu.length;i++){
            System.out.printf(" - %d : %s%n", i + 1, menu[i].getChoix());
        }
        System.out.print("Entrez votre choix : ");

         */
    }
}
