package vues;

import java.util.ArrayList;
import entity.Transaction;
import entity.TypeTransaction;

//Classe de Derivee ou Classe Fille ou Sous Classe 
public class TransactionVue extends Vue {
  public static Transaction saisie(){
       Transaction transaction=new Transaction();
       transaction.setMontant(saisieDoublePositif("Veuillez entrer le montant une transaction"));
       transaction.setType(saisieType());
       return transaction;
  } 
  public static void affiche(ArrayList<Transaction> transactions){
        for (int index = 0; index < transactions.size(); index++) {
              System.out.println(transactions.get(index));
         }
      } 

      public static TypeTransaction saisieType(){
        int type;
        do {
            System.out.println("1-Depot");
            System.out.println("2-Retrait");
            System.out.println("Veuillez selectionner un type");
            type=scanner.nextInt() ; 
        } while (type!=1 && type!=2);
        return type==1? TypeTransaction.Depot : TypeTransaction.Retrait; 
       
    }
  
}

