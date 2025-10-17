package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiseTestJunit5 {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithReminder(){
        int amount = 2500;
        int expected = 500;

        Assertions.assertEquals(expected,service.remain(amount));


    }
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithoutReminder(){
        int amount = 2000;
        int expected = 1000;

        Assertions.assertEquals(expected,service.remain(amount));

    }
    @Test
    public void shouldCalculateWhereAmountLowerThanBoundary(){
        int amount = 700;
        int expected = 300;

        Assertions.assertEquals(expected,service.remain(amount));
    }
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int expected = 0;

        Assertions.assertEquals(expected,service.remain(amount));
    }
}
