import util.CurrencyConverter;

import java.util.Scanner;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the dollar price?");
        double cotacao = sc.nextDouble();

        System.out.println("how many dollars will be bought?");
        double valor = sc.nextDouble();

        double valorFinal;

        valorFinal = CurrencyConverter.calcIof(cotacao, valor);

        System.out.println("Amount to be paid in reais = " + valorFinal);


        sc.close();
    }
}