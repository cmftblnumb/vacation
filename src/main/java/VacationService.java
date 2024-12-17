package ru.netology.javaqa;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
    int balance = 0;
    int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                // отдых
                balance -= expenses;
                balance /= 3;
                counter++;
            } else {
                //balance = balance + income;
                balance += income;
                balance -= expenses;
            }

        }
        return counter;
    }
}