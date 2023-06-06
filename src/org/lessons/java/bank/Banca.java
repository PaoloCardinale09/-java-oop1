package org.lessons.java.bank;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Banca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        Conto conto = new Conto(nome);
        System.out.println(conto);

        boolean exit = false;
        do {
            System.out.println("Cosa vuoi fare=");
            System.out.println("1-Deposito 2-Prelievo 3-Exit");
            String scelta = scan.nextLine();
            switch (scelta){
                case "1":
                System.out.println("Deposito");
                System.out.println("Importo");
                BigDecimal depositoImporto = new BigDecimal(scan.nextLine());
                conto.deposito(depositoImporto);
                System.out.println("Il tuo saldo è: " + conto.getFormatterSaldo());
                break;

                case "2":
                System.out.println("Prelievo");
                System.out.println("Importo: ");
                BigDecimal prelievoImporto = new BigDecimal(scan.nextLine());
                conto.prelievo(prelievoImporto);
                System.out.println("Il tuo saldo è: " + conto.getFormatterSaldo());
                break;

                case "3":
                System.out.println("Exit");
                exit = true;
                break;
            }

        }while (!exit);

        scan.close();
    }
}
