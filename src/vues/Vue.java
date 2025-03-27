package vues;

import java.util.Scanner;

//Classe de Base ou Super Classe ou Classe Mere
public class Vue {
     protected static Scanner scanner=new Scanner(System.in);
     public static double  saisieDoublePositif(String sms){
        double val;
        do {
              System.out.println(sms); 
              val=scanner.nextDouble();
        } while (val<=0);
        return val;
      }

      public static String  saisieChaine(String sms){
        String ch;
        do {
              System.out.println(sms); 
              ch=scanner.nextLine();
        } while ( ch.equals(""));
        return ch;
      }

}
