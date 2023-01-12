package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void testNumberOfValues() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.count(800, 900);
        Assertions.assertEquals(expected, actual);
    }
}
