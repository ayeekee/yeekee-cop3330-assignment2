package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculateHR() {
        assertEquals(138.15, App.calculateHR(22,65,55));
    }
}