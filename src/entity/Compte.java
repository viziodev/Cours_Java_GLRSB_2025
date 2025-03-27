package entity;

import java.util.ArrayList;

public class Compte {
    //Attributs d'instances ou objet
     private int id;
     private String  numero;
     private String dateCreation;
     private double  montant;

     private ArrayList<Transaction> transactions ;
     private int nbreTransactions;

     public MessageTransaction addTransaction(Transaction transaction) {
      
        if (transaction.getType()==TypeTransaction.Retrait) {
          if (transaction.getMontant()<montant) {
              transactions.add(transaction);
              montant-=transaction.getMontant();
             return MessageTransaction.RetraitSucces; 
           }else{
             return MessageTransaction.MontantInsuffisant;
           }
        }else{
           transactions.add(transaction);
           montant+=transaction.getMontant();
          return MessageTransaction.DepotSucces; 
        }
        

       
     }

     
    //methodes  d'instances ou objet
      //Constructeur
        //1-Instancier un Objet 
        //2-Initialser des attributs lors de la creation d'un objet
       public Compte(){
        transactions=new ArrayList<>();
       }
      //Getters 
      public int getId(){
        return id;
      }

      public String getNumero(){
        return numero;
      }

      public String getDateCreation(){
        return dateCreation;
      }
      public double getMontant(){
        return montant;
      }
      //Setters
      public void setId(int id){
         this.id =id;
      }
      public void setNumero(String numero){
          this.numero =numero;
      }

      public void setDateCreation(String dateCreation){
        this.dateCreation = dateCreation;
      }
      public void setMontant(double montant){
        this.montant=montant;
      }

      //Metiers
        //copie:copie de valeurs
        public void copie(Compte compte){
           id = compte.getId();
           numero = compte.getNumero();
           dateCreation =compte.getDateCreation();
           montant = compte.getMontant();
        }
        //egal: comparaison de valeurs
        public boolean egal(Compte compte){
          return numero.equals(compte.getNumero());
        }
        //toChaine : Transformer un objet en chaine ou la Serialisation
        @Override
        public String toString() {
            return "Compte [id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", montant=" + montant
                    + "]";
        }

        public ArrayList<Transaction> getTransactions() {
          return transactions;
        }
        public int getNbreTransactions() {
          return nbreTransactions;
        }
        
       
        
  
}
