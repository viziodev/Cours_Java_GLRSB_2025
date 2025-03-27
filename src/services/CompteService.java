package services;

import entity.Compte;

public class CompteService {
      //Ni un Getters et ni setters
       private final int N=10;
       private Compte[] comptes;
       private int nbreCompte;

       public CompteService() {
          comptes=new Compte[N];
          nbreCompte=0;
      }
      public int getNbreCompte() {
          return nbreCompte;
      }

      public boolean addCompte(Compte compte) {
        if (nbreCompte<N) {
            comptes[nbreCompte]=compte; 
            nbreCompte++; //
            return true;
        }
        return false;
      }

      public Compte[] getComptes() { return comptes; }

public Compte searchCompteByNumero(String numero){
    for (int index = 0; index < nbreCompte; index++) {
         if (comptes[index].getNumero().equals(numero)) {
              return comptes[index];
         }
    }
    return null;
}


}
