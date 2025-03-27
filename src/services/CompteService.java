package services;

import java.util.ArrayList;

import entity.Compte;

public class CompteService {
      //Ni un Getters et ni setters
       ArrayList<Compte> comptes ;

       public CompteService() {
        comptes = new ArrayList<>();
      }
      public void addCompte(Compte compte) {
          comptes.add(compte);
      }
      public  ArrayList<Compte>  getComptes() { return comptes; }
        public Compte searchCompteByNumero(String numero){
            for (int index = 0; index < comptes.size(); index++) {
                if (comptes.get(index).getNumero().equals(numero)) {
                    return comptes.get(index);
                }
            }
            return null;
        }


}
