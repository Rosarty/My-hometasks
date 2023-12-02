package app;

import java.util.Scanner;

public class Main09 {
    static double sumpurch;
    static double sumsal;
    static double sumpay;
    static int sale;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Purchase amount : ");
        sumpurch = scanner.nextDouble();

        if (sumpurch <= 5000) {
            sale = 5;
        } else if (sumpurch <= 10000) {
            sale = 10;
        } else {
            sale = 15;
        }
        System.out.printf("The amount of the total purchase : %.2f", sumpurch);
        sumsal = calculateSalesPurchase(sumpurch, sale);
        System.out.printf("%nAmount of discount : %.2f", sumsal);
        sumpay = calculateForPayPurchase(sumpurch, sale);
        System.out.printf("%nAmount to be paid : %.2f", sumpay);

    }
    private static double calculateSalesPurchase(double sumpurch, int sale) {
        return sale * sumpurch / 100;
    }
    private static double calculateForPayPurchase(double sumpurch, int sale) {
        return sumpurch - (sale * sumpurch / 100);
    }
}

