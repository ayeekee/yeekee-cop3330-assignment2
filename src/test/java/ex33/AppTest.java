package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void magic8Ball() {
        String[] responses = {"Yes.", "No.", "Ask again later."};

        int num = App.magic8Ball(responses);
        int min = 0;
        int max = 2;
        assertTrue(min <= num && num <= max);
    }
}