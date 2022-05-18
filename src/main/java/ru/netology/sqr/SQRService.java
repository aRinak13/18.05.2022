package ru.netology.sqr;

public class SQRService {
    public int calculatingTheSquareOfANumberInARange(int start, int end) {
        int j = 0;
        for (int i = 10; i < 100; i++) {
            int sqrt = i * i;
            if (sqrt >= start && sqrt <= end) {
                j = j + 1;
            }
        }
        return j;
    }
}