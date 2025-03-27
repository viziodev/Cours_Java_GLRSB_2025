package entity;

import java.time.LocalDate;

import services.ConvertDateService;

public class Transaction {
    private int id;
    private double montant;
    private LocalDate date;
    private  TypeTransaction type;
    private static int nbreCompteurTransaction;
    
    public Transaction() {
        date=LocalDate.now();
        id=++nbreCompteurTransaction;
    }

    public TypeTransaction getType() {
        return type;
    }
    public void setType(TypeTransaction type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Transaction other = (Transaction) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", montant=" + montant + ", date=" + ConvertDateService.toFr(date) + ", type=" + type + "]";
    }


    
    
}
