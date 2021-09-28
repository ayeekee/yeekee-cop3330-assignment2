package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertEquals(70.0, PaymentCalculator.calculateMonthsUntilPaidOff(5000,.00032877,100));
    }
}