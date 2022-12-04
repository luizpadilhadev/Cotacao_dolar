package util;

public class CurrencyConverter {
    public static final double Iof = 6;
    public static double valorFinal;

    public static double calcIof (double cotacao, double valor){
        valorFinal = cotacao * valor * 6 / 100;
        return valorFinal;
    }

}
