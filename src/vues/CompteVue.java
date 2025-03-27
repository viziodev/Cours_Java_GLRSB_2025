package vues;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import entity.Compte;
import services.ConvertDateService;

public class CompteVue {
     private static Scanner scanner=new Scanner(System.in);
      public static Compte saisie(){
           Compte compte;
           compte= new Compte();
           System.out.println("Entrer l'id du compte");
           compte.setId(scanner.nextInt());
           scanner.nextLine();
           compte.setDateCreation(ConvertDateService.toFr(LocalDate.now()));
           compte.setNumero(saisieChaine("Entrer le numero du compte"));
           compte.setMontant(saisieDoublePositif("Entrer le solde du compte"));
           return compte;
      }
      public static String  saisieChaine(String sms){
        String ch;
        do {
              System.out.println(sms); 
              ch=scanner.nextLine();
        } while ( ch.equals(""));
        return ch;
      }

      public static double  saisieDoublePositif(String sms){
        double val;
        do {
              System.out.println(sms); 
              val=scanner.nextDouble();
        } while (val<=0);
        return val;
      }

      public static void affiche(ArrayList<Compte> comptes){
        for (int index = 0; index < comptes.size(); index++) {
              System.out.println(comptes.get(index).toString());
        }
      }

}
