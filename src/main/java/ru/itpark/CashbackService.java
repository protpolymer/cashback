package ru.itpark;

public class CashbackService {
    public int cashbackCalculate(int purchaseBasic, int purchaseHight, int purchaseSpecial) {

        int basicCashbackPercent = 1;
        int highCashbackPercent = 5;
        int specialCashbackPercent = 30;
        int maxBoundCashback = 3_000;

        int result = ((purchaseBasic * basicCashbackPercent) + (purchaseHight * highCashbackPercent) + (purchaseSpecial * specialCashbackPercent)) / 100;

        if (result >= maxBoundCashback) {
            result = maxBoundCashback;
        }

        return result;
    }
}
