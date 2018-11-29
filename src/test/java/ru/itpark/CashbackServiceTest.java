package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void cashbackCalculate() {
        {

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(9_542, 12_500, 6_900);

            assertEquals(2_790, cashback);
        }
        {

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(0, 0, 0);

            assertEquals(0, cashback);
        }
        {

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(9_542, 0, 0);

            assertEquals(95, cashback);
        }
        {

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(0, 12_500, 0);

            assertEquals(625, cashback);
        }
        {

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(0, 0, 6_900);

            assertEquals(2070, cashback);
        }
        {

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(300_000, 60_000, 10_000);

            assertEquals(3000, cashback);
        }
    }
}