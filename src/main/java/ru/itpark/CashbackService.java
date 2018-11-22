package ru.itpark;

public class CashbackService {
    public int cashbackCalculate(int purchaseBasic, int purchaseHight, int purchaseSpecial) {

        int basicCashbackPercent = 1;
        int hightCashbackPercent = 5;
        int specialCashbackPercent = 30;
        int maxBoundCashback = 3_000;

        int result = (int)((purchaseBasic * basicCashbackPercent) + (purchaseHight * hightCashbackPercent) + (purchaseSpecial * specialCashbackPercent)) / 100;

        if (result >= maxBoundCashback) {
            result = maxBoundCashback;
        }

        return result;
    }
}
