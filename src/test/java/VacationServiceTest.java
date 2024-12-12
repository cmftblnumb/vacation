package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void testCalculateRestMonths_case1() {
        ru.netology.javaqa.VacationService service = new ru.netology.javaqa.VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculateRestMonths(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateRestMonths_case2() {
        ru.netology.javaqa.VacationService service = new ru.netology.javaqa.VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculateRestMonths(income, expenses, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}