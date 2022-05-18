package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'checking the square of the number 1', 200, 300, 4",
            "'checking the square of the number 2', 200, 400, 6",
            "'checking the square of the number 3', 500, 1000, 9"})
    void сalculatingTheSquareOfANumberInARange(String name, int start, int end, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculatingTheSquareOfANumberInARange(start, end);

        Assertions.assertEquals(actual, expected);
    }
}