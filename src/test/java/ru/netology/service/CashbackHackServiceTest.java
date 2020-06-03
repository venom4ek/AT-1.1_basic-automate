package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldBuyInOver1000() {
        int actual = cashback.remain(1302);
        int expected = 698;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyWhen1000() {
        int actual = cashback.remain(2000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyInWhen0() {
        int actual = cashback.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyInUnder1000() {
        int actual = cashback.remain(553);
        int expected = 447;
        assertEquals(actual, expected);
    }
}