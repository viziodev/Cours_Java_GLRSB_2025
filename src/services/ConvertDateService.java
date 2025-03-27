package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  class ConvertDateService {
    public static String toFr(LocalDate dateEng) {
         DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-YYYY");
         return dateEng.format(formatter);
    }

    public static String toEn(LocalDate dateFr) {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return dateFr.format(formatter); 
    }
}
