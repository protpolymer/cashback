package ru.itpark;

public class Main {
    public static void main(String[] args) {

        double purchaseBasic = 23_000;
        double purchaseHight = 6_000;
        double purchaseSpecial = 2_330;

        CashbackService cashbackService = new CashbackService();
        int cashback = cashbackService.cashbackCalculate(purchaseBasic, purchaseHight, purchaseSpecial);
        System.out.println(cashback);
    }
}
