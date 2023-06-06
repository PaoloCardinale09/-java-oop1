//Nel progetto java-oop-1, org.lessons.java.bank,
// creare la classe Conto caratterizzata da:

//- numero di conto
//- nome del proprietario
//- saldo

//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
// ed eventuali altri metodi di “servizio” per fare in modo che:

//- alla creazione di un nuovo conto il saldo sia 0€
//- Il codice conto sia accessibile solo in lettura,
// il proprietario sia accessibile in lettura e in scrittura
// e il saldo sia accessibile solo in lettura

//- siano presenti un metodo per versare una somma di denaro sul conto e
// uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
//- altri metodi per ritornare le informazioni del conto e il saldo formattato
//Aggiungere una classe Bank con metodo main,
// dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente
// con un numero di conto random (da 1 a 1000)
//Poi chiediamo all’utente cosa vuole fare dando 3 opzioni:
// versare una somma o prelevare una somma di denaro, oppure uscire.
// Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare
// e proviamo ad effettuare l’operazione sul conto.
// Se l’operazione non è valida mostriamo un messaggio di errore.
// Se l’operazione va a buon fine mostriamo il saldo attuale del conto.
// Il menu continua ad apparire fino a che l’utente sceglie di uscire.

package org.lessons.java.bank;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    // FIELDS (private)
    private int numeroDiConto;
    private String nomeProprietario;
    private BigDecimal saldo;

    // CONTRUCTORS

    public Conto( String nomeProprietario) {
        this.numeroDiConto = numeroDiConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = new BigDecimal(0);
        this.numeroDiConto = generateCode();
    }


    // GETTERS AND SETTERS

    public int getNumeroDiConto() {
        return numeroDiConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    // METHODS
    public void deposito(BigDecimal amount){
        saldo = saldo.add(amount);
    }

    public void prelievo(BigDecimal amount){
        // controllo saldo è >= amount
        if (saldo.compareTo(amount)>= 0){
        saldo= saldo.subtract(amount);
        }else {
            System.out.println("La somma è maggiore del saldo");
        }
    }

    public String getFormatterSaldo(){
        DecimalFormat df = new DecimalFormat("0.00€");
        return df.format(saldo);
    }


    private int generateCode(){
        Random random = new Random();
        return random.nextInt(1000);
    }

    @Override
    public String toString() {
        return "Conto{" +
                "numeroDiConto=" + numeroDiConto +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}





