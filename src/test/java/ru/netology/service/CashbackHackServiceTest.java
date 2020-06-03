package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldBuyInOver1000() {
        int actual = cashback.remain(1302);
        int expected = 698;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyInWhen1000() {
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyInWhen0() {
        int actual = cashback.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyInUnder1000() {
        int actual = cashback.remain(553);
        int expected = 447;
        assertEquals(expected, actual);

    }
}