package ru.netology.sqr;

public class SQRService {
    public int count(int minValue, int maxValue) {
        int segment = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue) {
                if (i * i <= maxValue) {
                   segment = segment + 1;
                }
            }
        }
        if (segment + 1 > 0) {
            System.out.println("Значений " + segment);
        }
        return segment;
    }

}
