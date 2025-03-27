package vues;

import java.time.LocalDate;
import java.util.ArrayList;
import entity.Compte;
import services.ConvertDateService;
//Classe de Derivee ou Classe Fille ou Sous Classe 
public class CompteVue extends Vue {
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
     
      public static void affiche(ArrayList<Compte> comptes){
        for (int index = 0; index < comptes.size(); index++) {
              System.out.println(comptes.get(index).toString());
        }
      }

}
