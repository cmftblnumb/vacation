package ru.netology.javaqa;

public class VacationService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                count++;
                money -= expenses;
                money -= money / 3;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}