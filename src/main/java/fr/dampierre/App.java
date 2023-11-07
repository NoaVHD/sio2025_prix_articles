package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien avez vous d'articles ?");
        int nbArticle = clavier.nextInt();
        double total = 0;

            for(int i = 1; i <= nbArticle; i++){
            System.err.println("Prix de l'article " + i +" :");
            double prixArticle = clavier.nextInt();
            total = total + prixArticle;
           /*  int i = 1;
            while ( i <= nbArticle ) {
            System.out.println ( "Prix de l'article :" + i );
            double prixArticle = clavier.nextInt();
            total = total + prixArticle;
            i++;*/
    }
    System.out.println("Votre total est de : "+ total);
        clavier.close();
        }

       
}
