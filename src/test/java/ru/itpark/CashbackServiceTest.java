package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void cashbackCalculate() {
        {
            // Positive test for cashback

            CashbackService cashbackTest = new CashbackService();
            int cashback = cashbackTest.cashbackCalculate(9_542, 12_500, 6_900);

            assertEquals(2790, cashback);
        }
    }
}