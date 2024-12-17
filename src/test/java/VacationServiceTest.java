package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.VacationService;

public class VacationServiceTest {
    @Test
    public void testCalculate1(){
        VacationService service = new VacationService();
        int income = 10_000;
        int expences = 3_000;
        int treshold = 20_000;


        int actual = service.calculate(income, expences, treshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2(){
        VacationService service = new VacationService();
        int income = 100_000;
        int expences = 60_000;
        int treshold = 150_000;

        int actual = service.calculate(income, expences, treshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}