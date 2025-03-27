import java.util.Scanner;

import entity.Compte;
import entity.MessageTransaction;
import entity.Transaction;
import entity.TypeTransaction;
import services.CompteService;
import vues.CompteVue;
import vues.TransactionVue;

/*
 * Creer un compte
 *  1-Description du compte ==> Classe entity Compte
 *  2-Saisie du Compte ==> Classe vue CompteVue
 *  3-Realiser le service addCompte==> Definir le tableau de compte + addCompte()
 */
public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Compte compte;
      //  CompteVue compteVue=new CompteVue();
        CompteService compteService=new CompteService();
        
       int choix;
       do {
              choix = menu();
         
               switch (choix) {
                case 1:
                  compte= CompteVue.saisie();
                  compteService.addCompte(compte);
                    Transaction tx=new Transaction();
                    tx.setType(TypeTransaction.Depot);
                    tx.setMontant(compte.getMontant());
                    compte.addTransaction(tx);
                    System.out.println("Le Compte a ete cree avec success");
                  
                    break;
                case 2:
                CompteVue.affiche(compteService.getComptes());
                    break;
                case 3:
                     String numero=CompteVue.saisieChaine("Entrer le numero du compte a rechercher");
                     compte =compteService.searchCompteByNumero(numero);
                     if (compte!=null){ 
                        tx = TransactionVue.saisie();
                        MessageTransaction messageTransaction=compte.addTransaction(tx);
                        System.out.println(messageTransaction.getValue());
                      
                     }else{
                        System.out.println("Ce Numero ne correspond a aucun compte");
                     }
                  break;
                case 4:
                 numero=CompteVue.saisieChaine("Entrer le numero du compte a rechercher");
                 compte =compteService.searchCompteByNumero(numero);
                 if (compte!=null){ 
                      TransactionVue.affiche(compte.getTransactions());
                 }else{
                   System.out.println("Ce Numero ne correspond a aucun compte");
                 }
                 break;
               
                default:
                    break;
               }            
       } while (choix!=5);

       
    }

    public static int menu(){
        System.out.println(
          "1-Créer  un  compte\n" + 
         "2-Afficher les comptes\n" + 
         "3-Ajouter  une Transaction à un compte\n" + 
        "4-Lister les transactions d’un compte\n" + //
        "5-Quitter\n" );
        return scanner.nextInt() ; 
    }
}
