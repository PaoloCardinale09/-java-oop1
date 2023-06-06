package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // Chiedo nome prodotto
        System.out.println("Nome prodotto: ");
        String nome = scan.nextLine();

        // Chiedo descrizione prodotto
        System.out.println("Descrizione prodotto: ");
        String descrizione = scan.nextLine();

        // Chiedo prezzo prodotto
        System.out.println("Prezzo prodotto: ");
        int prezzo= scan.nextInt();

        // Chiedo percentuale iva
        System.out.println("Percentuale IVA: ");
        int iva= scan.nextInt();

        // Con i dati costruisco il prodotto

        Prodotto prodotto = new Prodotto( nome, descrizione, prezzo, iva);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + decimalFormat.format( prodotto.getPrezzoBase()) + " €");
        System.out.println("Prezzo + iva al " +iva+ "%: " +decimalFormat.format( prodotto.getPrezzoIvato(iva))  + " €");
        System.out.println("Nome esteso del prodotto: " +prodotto.nomeEsteso());



        scan.close();
    }
}
