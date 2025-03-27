package entity;

public enum MessageTransaction {
    MontantInsuffisant("Retrait impossible car le montant est insuffisant"), //
    DepotSucces("Depot effectuee  avec success"),//
    RetraitSucces("Retrait effectue  avec success");
    private final String value;
    public String getValue() {
      return value;
   }
   MessageTransaction(String value) {
      this.value = value;
   }

   
}
