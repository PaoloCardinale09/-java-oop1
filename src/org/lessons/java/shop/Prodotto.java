//Nel progetto java-oop-1, package org.lessons.java.shop,
// creare la classe Prodotto che gestisce i prodotti dello shop.
//Un prodotto è caratterizzato da:
//- codice (numero intero)
//- nome
//- descrizione
//- prezzo
//- iva

//Usate opportunamente i livelli di accesso (public, private),
// i costruttori,
// i metodi getter e setter ed eventuali altri metodi di “servizio” per fare in modo che:
//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//Il codice prodotto sia accessibile solo in lettura
//Gli altri attributi siano accessibili sia in lettura che in scrittura

//Il prodotto esponga sia un metodo per avere il prezzo base
// che uno per avere il prezzo comprensivo di iva

//Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

//Nello stesso package aggiungete una classe Main
// con metodo main nella quale testate tutte le funzionalità della classe Prodotto
// BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare
// a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
// Buon lavoro!

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // FIELDS (private)
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // CONTRUCTORS (public)
    public  Prodotto(String nome, String descrizione, double prezzo, int iva){
        setCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo= prezzo;
        this.iva= iva;
    }

    // GETTERS SETTERS
    // creo il codice con un numero random a 4 cifre
    public void setCodice(){
        Random random = new Random();
         this.codice = random.nextInt(9000) + 1000 ;
    }



    // metto il codice in solo lettura
    public int getCodice(){
        return this.codice;
    }

    // METHODS
    // metodo per avere un prezzo base
    public double getPrezzoBase(){
        return this.prezzo;
    }

    // metodo per avere un prezzo compreso iva in base alla percentuale  iva inserita
    public double  getPrezzoIvato(double iva){
        this.iva = iva;
        return  this.prezzo + (prezzo/100 * iva);
    }

    // metodo per avere il nome esteso con codice-nome
    public String nomeEsteso(){
        return this.codice + "-"+ this.nome;
    }

}
