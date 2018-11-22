package ru.itpark;

public class Main {
    public static void main(String[] args) {

        int purchaseBasic = 23_000;
        int purchaseHight = 6_000;
        int purchaseSpecial = 2_330;

        CashbackService cashbackService = new CashbackService();
        int cashback = cashbackService.cashbackCalculate(purchaseBasic, purchaseHight, purchaseSpecial);
        System.out.println(cashback);
    }
}
